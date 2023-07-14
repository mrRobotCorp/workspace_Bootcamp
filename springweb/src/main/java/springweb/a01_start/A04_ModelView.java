package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import backendWeb.z01_vo.Dept;
import backendWeb.z01_vo.Product;

// springweb.a01_start.A04_ModelView
@Controller
public class A04_ModelView {
	// http://localhost:5080/springweb/modelExp01.do
	@RequestMapping("modelExp01.do")
	public String start(Model d) {
		// 모델 데이터에 객체 선언
		d.addAttribute("prod", new Product("apple", 300, 2));
		// jsp
		// ${prod.name} Product getName()
		// ${prod.price} Product getPrice()
		// ${prod.cnt} Product getgetCnt()
		return "WEB-INF\\views\\a01_start\\a01_model01.jsp";
	}
	
	// modelExp02.do
	// detp 객체 이용하여 부서번호 부서명 부서위치 모델 객체로.
	// WEB-INF\views\a01_start\a01_model02.jsp
	
	// http://localhost:5050/springweb/modelExp02.do
	@RequestMapping("modelExp02.do")
	public String modelExp02(Model d) {
		// 모델 데이터에 객체 선언
		d.addAttribute("dept", new Dept(30, "IT", "Seoul"));
		// jsp
		// ${prod.name} Product getName()
		// ${prod.price} Product getPrice()
		// ${prod.cnt} Product getgetCnt()
		return "WEB-INF\\views\\a01_start\\a01_model02.jsp";
	}
	
	
}	
