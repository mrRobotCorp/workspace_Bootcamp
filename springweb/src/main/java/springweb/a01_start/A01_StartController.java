package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// springweb.a01_start.A01_StartController
public class A01_StartController {
	// http://localhost:5050/springweb/start.do
	@RequestMapping("/start.do")
	public String start() {
		return "WEB-INF\\views\\a01_start.jsp";
	}
}
