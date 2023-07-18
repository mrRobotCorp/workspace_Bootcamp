package milrim_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// milrim_project.controller.test
@Controller("startCtrl")
public class Controller01 {

	// http://localhost:5080/milrim/start.do
	@RequestMapping("start.do")
	public String start() {
		return "WEB-INF\\views\\a01_start\\a01_start.jsp";
	}
}
