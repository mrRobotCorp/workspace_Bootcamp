package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Calculator;
import backendWeb.z01_vo.Dept;
import backendWeb.z01_vo.Emp;

// springweb.a01_start.A05_MVC_Controller
@Controller
public class A05_MVC_Controller {
	// http://localhost:5050/springweb/mvc01.do
	// ?num01=30&cal= * &num02=10
	@RequestMapping("mvc01.do")
	public String mvc01(Calculator c) {
		// Calculator : 매개변수로 선언하면 default로 요청값을 처리
		// + 모델 객체로 선언됨. 따로 Model 객체 선언할 필요 X
		if(c.getCal() != null) {
			if(c.getCal().equals(" + ")) c.setTot(c.getNum01() + c.getNum02());
			if(c.getCal().equals(" - ")) c.setTot(c.getNum01() - c.getNum02());
			if(c.getCal().equals(" * ")) c.setTot(c.getNum01() * c.getNum02());
			if(c.getCal().equals(" / ")) c.setTot(c.getNum01() / c.getNum02());
			
		}
		
		return "WEB-INF\\views\\a01_start\\a02_mvc_view.jsp";
	}
	
	// http://localhost:5050/springweb/mvc02.do
	@RequestMapping("mvc02.do")
	public String mvc02(@RequestParam("name") String name, Model d) {
		d.addAttribute("name", name + "@");
		return "WEB-INF\\views\\a01_start\\a03_mvc_view.jsp";
	}
	
	// 클릭 시 +1 입력한 나이보다 증가하게
	// defaultValue : 요청값이 없을 시 default로 요청값을 설정
	// http://localhost:5050/springweb/mvc03.do
		@RequestMapping("mvc03.do")
		public String mvc03(@RequestParam(value= "age",
								defaultValue = "0") int age, Model d) {
			d.addAttribute("ages", age + 1);
			return "WEB-INF\\views\\a01_start\\a04_mvc_view.jsp";
		}
		
		// 2개의 매개변수 값을 화면 출력 처리
		// http://localhost:5050/springweb/mvc04.do
		@RequestMapping("mvc04.do")
		public String mvc04(@RequestParam(value = "id",
							defaultValue="") String id, 
							@RequestParam(value = "pass",
							defaultValue="") String pass, Model d) {
			String result = "로그인하세요";
			if(!id.equals("")) {
				if(id.equals("himan") && pass.equals("7777")) {
					result = "로그인 성공";
				} else {
					result = "로그인 실패";
				}
			}
			d.addAttribute("result", result);
			return "WEB-INF\\views\\a01_start\\a05_login.jsp";
		}
		
		// 사원명/직책명을 사원정보 조회 처리
		// http://localhost:5050/springweb/empList88.do
		@RequestMapping("empList88.do")
		public String empList88(Emp sch, Model d) {
			A04_PreparedDao dao = new A04_PreparedDao();
			if(sch.getEname() == null) sch.setEname("");
			if(sch.getJob() == null) sch.setJob("");
			d.addAttribute("empList", dao.getEmpList(sch));
			
			return "WEB-INF\\views\\a01_start\\a06_empList.jsp";
		}
		
		// http://localhost:5050/springweb/deptList88.do
		@RequestMapping("deptList88.do")
		public String deptList(Dept sch, Model d) {
			A04_PreparedDao dao = new A04_PreparedDao();
			if(sch.getDname() == null) sch.setDname("");
			if(sch.getLoc() == null) sch.setLoc("");
			d.addAttribute("deptList", dao.getDeptList(sch));
			
			return "WEB-INF\\views\\a01_start\\a07_deptList.jsp";
		}
		
		
}



