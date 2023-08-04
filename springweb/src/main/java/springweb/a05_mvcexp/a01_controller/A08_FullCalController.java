package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class A08_FullCalController {
	@GetMapping("calendar.do")
	public String calendar() {
		return "WEB-INF\\views\\a05_mvcexp\\a11_fullcalendar.jsp";
	}
}
