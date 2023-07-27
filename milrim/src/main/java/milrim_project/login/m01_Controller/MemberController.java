package milrim_project.login.m01_Controller;

import org.apache.ibatis.annotations.Param;
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

@Controller("memCtrl")
public class MemberController {

	@Autowired
	private MemberService service;

    @GetMapping("jo.do") // 회원가입 페이지
    public String jo() {
        return "WEB-INF\\views\\project5_Milrim\\join.jsp"; // 뷰 페이지 경로 설정
    }
    
    @GetMapping("idMem.do")
    @ResponseBody
    public void insMember(Member ins) {
        service.insMember(ins);
    }

	@PostMapping("idc.do")
	@ResponseBody
	public String idcMem(@Param("id") String id, Model d) {
		
		return service.idcMem(id);
	}
	
//=================== 로그인
    @RequestMapping("login.do")
    @ResponseBody
    public String loginYS(Member sch,Model d) {
    	System.out.println(service.loginYS(sch));
    	d.addAttribute("loginys", service.loginYS(sch));
    	return "WEB-INF\\views\\project5_Milrim\\login.jsp";
    }
    //?id=himan&pass=123123
    
    
 //================== 아이디 비밀번호 찾기
    @RequestMapping("find.do")
    public String find() {
    	return "WEB-INF\\views\\project5_Milrim\\findId.jsp";
    }
    
	// 아이디 찾기=================
    @PostMapping("findID.do")
    public ResponseEntity<String> findID(@Param("name") String name,@Param("phonenumber") String phonenumber) {
    	return ResponseEntity.ok(service.findID(name, phonenumber));
    }
	// 비밀번호 찾기=================
    @PostMapping("findPASS.do")
    public ResponseEntity<String> findPASS(@Param("id") String id,@Param("phonenumber") String phonenumber){

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



















































