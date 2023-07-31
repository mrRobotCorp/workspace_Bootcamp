package milrim_project.login.m01_Controller;

import java.util.HashMap; 

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import milrim_project.login.m02_Service.MemberService;
import milrim_project.login.m04_vo.Member;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Controller("memCtrl")
public class MemberController {

	@Autowired
	private MemberService service;

	
	
    @GetMapping("join.do") // 회원가입 페이지
    public String jo() {
    	
        return "WEB-INF\\views\\project5_Milrim\\join.jsp"; // 뷰 페이지 경로 설정
    }
    // 회원가입
    @GetMapping("idMem.do")
    @ResponseBody
    public void insMember(Member ins) {
        service.insMember(ins);
    }
    
    // 아이디 중복
	@PostMapping("idc.do")
	@ResponseBody
	public String idcMem(@Param("id") String id, Model d) {
		
		return service.idcMem(id);
	}
	
	// 인증번호 발송
    String api_key = "NCSCIW74KIRULFKD";
    String api_secret = "0VXCPQF8SNFHHJW38DRZMZ6ZZUZGXFJY";
    Message coolsms = new Message(api_key, api_secret);
    String checkNum = "";

    @PostMapping("mesgo.do")
    @ResponseBody
    public void mesgo(@Param("phonenumber") String phonenumber) {
  	  for(int i=1;i<=6;i++) {
  		  int rdNum = (int)(Math.random()*10);
  		  checkNum += ""+rdNum;
  	  }
        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", phonenumber);
        params.put("from", "01033293090"); //무조건 자기번호 (인증)
        params.put("type", "SMS");
        params.put("text", "\t MilRim \n휴대폰 인증번호: "+checkNum);
        params.put("app_version", "test app 1.2"); // application name and version

        try {
        	//send() 는 메시지를 보내는 함수  
          JSONObject obj = (JSONObject) coolsms.send(params);
          System.out.println(obj.toString());
        } catch (CoolsmsException e) {
          System.out.println(e.getMessage());
          System.out.println(e.getCode());
        }
      }
	// 인증번호 체크
    @PostMapping("checkMes.do")
    public ResponseEntity<String> checkMes(@Param("numberC") String numberC) {
    	String checkOK = "";
    	if(numberC.equals(checkNum)) {
    		checkOK = "Y";
    	}else {
    		checkOK = "N";
    		checkNum = "";
    	}
    	
    	return ResponseEntity.ok(checkOK);
    }
	
	
	
	
	
	
//=================== 로그인
/*
    @RequestMapping("login.do")
    public String loginYS(Member sch,Model d) {
    	service.loginYS(sch);
    	d.addAttribute("loginys", service.loginYS(sch));
    	if(service.loginYS(sch).equals("Y")) {
    		loginSession(sch.getId());
    	}else {
    		
    	}
    	return "WEB-INF\\views\\project5_Milrim\\login.jsp";
    }
 */
    @RequestMapping("login.do")
    public String loginYS(Member sch, Model d, HttpServletRequest request, HttpServletResponse response) {
        String loginResult = service.loginYS(sch);
        d.addAttribute("loginys", loginResult);

        if (loginResult.equals("Y")) {
            // 사용자 ID를 쿠키로 저장합니다.
            Cookie idCookie = new Cookie("userId", sch.getId());
            idCookie.setMaxAge(3600); // 쿠키의 유효 기간을 설정합니다 (초 단위) - 필요에 따라 조정하세요
            response.addCookie(idCookie);

            // 세션에 사용자 정보를 저장합니다.
            setUserInfoInSession(request, sch);
        } else {
            // 로그인 실패 또는 처리해야 할 내용이 있다면 여기에 추가하세요
        }

        return "WEB-INF\\views\\project5_Milrim\\login.jsp";
    }

    
    
    private void setUserInfoInSession(HttpServletRequest request, Member member) {
        HttpSession session = request.getSession();
        session.setAttribute("userId", member.getId());
        session.setAttribute("userName", member.getName());
        session.setAttribute("userAuth", member.getAuth());
    }

    @RequestMapping("test.do")
    public void test() {
    	System.out.println();
    }
    
 //================== 아이디 비밀번호 찾기
    @RequestMapping("find.do")
    public String find() {
    	return "WEB-INF\\views\\project5_Milrim\\findId.jsp";
    }
	// 아이디 찾기=================
    @PostMapping("findID.do")
    public ResponseEntity<String> findID(@Param("name") String name,
    		@Param("phonenumber") String phonenumber) {
    	
    	return ResponseEntity.ok(service.findID(name, phonenumber));
    }
	// 비밀번호 찾기=================
    @PostMapping("findPASS.do")
    public ResponseEntity<String> findPASS(@Param("id") String id,
    		@Param("phonenumber") String phonenumber){
    	
    	return ResponseEntity.ok(service.findPASS(id, phonenumber));
    }
    
    
    
    
    
    
    
    
/*
로그인 ^ : 세션, 쿠키
회원가입 O 
아이디,비밀번호 찾기 O

*/
    
}


/* 
db
sql
dao
service
controller
html

세션 : 아이디, 이름, 권한
쿠키 : 아이디 저장
회원가입 버튼 활성화


수~목 회원가입, 로그인, 아이디&비밀번호 찾기
금 멤버십+결제, 관리자(회원정보 열람)
토 관리자
1. 회원정보 삭제
2. 게시글 열람 + 삭제
3. 영상 게시판 열람

월 영상 게시판 생성, 영상 게시판 삭제
화 영상 게시판 업데이트

수 보안 + 취합
목 취합
금 발표

*/	



















































