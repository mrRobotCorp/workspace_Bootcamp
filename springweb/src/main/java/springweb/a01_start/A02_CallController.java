package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A02_CallController {
	// http://localhost:5050/springweb/
	@RequestMapping("/callCtrll.do")
	public String start(Model d) {
		d.addAttribute("greet", "hello spring");
		return "WEB-INF\\views\\a02_callView.jsp";
	}
}
/*
	A03_CallMVC.java
	url /mvc99.do
	모델 데이터 : show//스프링 화면 호출
	a03_callmvc.jsp
*/