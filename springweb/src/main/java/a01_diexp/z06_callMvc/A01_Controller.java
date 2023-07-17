package a01_diexp.z06_callMvc;

import org.springframework.stereotype.Controller;

@Controller
public class A01_Controller {
	public String callCtrl() {
		
		return "A01 컨트롤러";
	}
	
	public void controllMsg() {	
		System.out.println("Controller 호출");
	}
}
