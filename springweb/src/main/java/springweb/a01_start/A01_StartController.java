package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.z01_vo.Person;
import backendWeb.z01_vo.PlayTeam;
import backendWeb.z01_vo.Product;

// springweb.a01_start.A01_StartController
@Controller("startCtrl")
public class A01_StartController {
   // http://localhost:8080/springweb/start.do
   // http://localhost:8080/springweb/req01.do?name=홍길동&age=25
   @RequestMapping("/start.do")
   public String start(@RequestParam("name") String name, 
         Model d) {
      // view단에 넘겨줄 핵심 데이터 : 모델데이터
      // jsp ==> <h3>${msg}</h3 >
      d.addAttribute("msg","안녕하세요 스프링 모델 데이터");
      
      return "WEB-INF\\views\\a01_start.jsp";
   }
   @RequestMapping("/start2.do")
   public String start2() {
      return "WEB-INF\\views\\a02_start2.jsp";
   }
   // ex) A02_CallController.java ==> 주의) 컨테이너 등록(xml)
   // 기능 메서드 추가하고
   // url = http://localhost:5050/springweb/callCtrl.do
   // 모델데이터 greet : "hello spring"
   // a02_callView.jsp를 호출해서 모델 데이터 출력
   
   
   // 단일 요청키
   // req01.do?name=홍길동&age=25
   @RequestMapping("req01.do")
   public String req01(@RequestParam("name") String name, @RequestParam("age") int age) {
      System.out.println("받은 요청값: "+name);
      System.out.println("받은 요청값: "+age);
      
      return "WEB-INF\\views\\a01_start.jsp"; // webapp하위에 index.jsp 호출
   }
   // http://localhost:5050/springweb/req02.do?pname=사과&price=3000&cnt=4
   // 로그로 물건명: @@ 가격: @@ 갯수: @@ 출력되게 하세요
   @RequestMapping("req02.do")
   public String req01(@RequestParam("pname") String pname, @RequestParam("price") int price, @RequestParam("cnt") int cnt) {
      System.out.println("받은 요청값: "+pname);
      System.out.println("받은 요청값: "+price);
      System.out.println("받은 요청값: "+cnt);
      
      return "WEB-INF\\views\\a01_start.jsp"; // webapp하위에 index.jsp 호출
   }
   
   // http://localhost:5050/springweb/req03.do?names=joe&names=amy&names=mark
   @RequestMapping("req03.do")
   public String req03(
		   			@RequestParam("names") String[] names) {
      System.out.println("이름1: "+ names[0]);
      System.out.println("이름2: "+ names[1]);
      System.out.println("이름3: "+ names[2]);
      
      return ""; // webapp하위에 index.jsp 호출
   }
   // req04.do?name=amy&age=30&loc=seoul
   // 1. 위 내용을 받을 수 있는 기능 메서드 property가 있는 클래스
   //	생성 또는 확인
   // 2. setName(String), setAge(int), setLoc(String)
   @RequestMapping("req04.do")
   public String req04(Person p01) {
	   System.out.println("요청값 내용 (Person)");
	   System.out.println("이름 : " + p01.getName());
	   System.out.println("나이 : " + p01.getAge());
	   System.out.println("거주지 : " + p01.getLoc());
	   return "";
   }
   
   // ex1) http://localhost:5050/springweb/req05.do?name=apple&price=300&cnt=2
   @RequestMapping("req05.do")
   public String req05(Product prod) {
	   System.out.println("요청값 내용 (Product)");
	   System.out.println("이름 : " + prod.getName());
	   System.out.println("가격 : " + prod.getPrice());
	   System.out.println("갯수 : " + prod.getCnt());
	   return "";
   }
   // ex2) http://localhost:5050/springweb/req06.do?tname=LG&win=30&def=2
   @RequestMapping("req06.do")
   public String req06(PlayTeam pt) {
	   System.out.println("요청값 내용 (PlayTeam)");
	   System.out.println("팀 이름 : " + pt.getTname());
	   System.out.println("승리 : " + pt.getWin());
	   System.out.println("def가 뭐지 : " + pt.getDef());
	   return "";
   }
   
}