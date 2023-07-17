package a01_diexp_z05_mvc;

import java.util.List;

import org.springframework.stereotype.Controller;

import backendWeb.z01_vo.Dept;

@Controller("web_Controller")
public class Web_Controller {
	private Web_service service;
	
	public Web_Controller() {
		service = new Web_service();
	}
	
	public List<Dept> getDeptList(Dept sch) {
		System.out.println("컨트롤러 호출");
		return service.deptList(sch);
	}
}
