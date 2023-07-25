package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import backendWeb.z01_vo.Emp;
import backendWeb.z01_vo.Person;
import backendWeb.z01_vo.Product;
import springweb.a03_empMVC.A02_EmpService;
import springweb.a05_mvcexp.a02_service.A01_MemberService;
import springweb.a05_mvcexp.z01_vo.Member;

@Controller
public class A05_AjaxCtrl {
	// ajax01.do
	@GetMapping("ajax01.do")
	public String ajax01(Model d) {
		d.addAttribute("p01", new Person("Elliot", 31, "seoul"));
		return "jsonView";
	}

	@GetMapping("ajax02.do")
	public String ajax02(Model d) {
		d.addAttribute("mem", new Member("skrr", "pass", "Kevin", 1921, "user"));
		return "jsonView";
	}
	
	@Autowired
	private A02_EmpService service;
	
	@GetMapping("ajax03.do")
	public String ajax03(Model d) {
		d.addAttribute("empList", service.getEmpList(new Emp()));
		return "jsonView";
	}
	// ex) 사원정보 리스트 가져와서 json 데이터 처리 출력
	@Autowired
	private A01_MemberService service2;
	
	@GetMapping("ajaxMem.do")
	public String ajaxMem(Model d) {
		d.addAttribute("memList", service2.memberList(new Member()));
		return "jsonView";
	}
	
	@GetMapping("ajax05.do")
	@ResponseBody
	public String ajax05() {
		return "hi";
	}
	
	@GetMapping("ajax06.do")
	@ResponseBody
	public String ajax06() {
		Gson g = new Gson();
		
		return g.toJson(new Person("Jamie", 30, "Busan"));
	}
	// ex) ajax07.do
	// good day 출력 , ajax08.do -> Gson으로 Product 정보 출력
	
	@GetMapping("ajax07.do")
	@ResponseBody
	public String ajax07() {
		return "good day - Surfaces";
	}
	
	@GetMapping("ajax08.do")
	@ResponseBody
	public String ajax08() {
		Gson g = new Gson();
		return g.toJson(new Product("candy", 200, 2));
	}
	
	// ajax09.do?name=cherry&price=5000&cnt=2
	@GetMapping("ajax09.do")
	public ResponseEntity<Product> ajax09(Product prod) {
		
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping("ajax10.do")
	public ResponseEntity<Emp> ajax10(Emp sch) {
		return ResponseEntity.ok(sch);
	}
	
	
}
