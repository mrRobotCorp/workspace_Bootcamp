package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A03_CallMVC {
	// http://localhost:5050/springweb/mvc99.do
	@RequestMapping("/mvc99.do")
	public String start(Model d) {
		d.addAttribute("show", "spring show");
		return "WEB-INF\\views\\a03_callmvc.jsp";
	}
}
