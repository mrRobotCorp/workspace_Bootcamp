package springweb.a04_dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import backendWeb.z01_vo.Dept;

@Controller
public class A01_DeptController {
	@Autowired
	private A02_DeptService service;
	
	/*
	요청 메서드 선언
	1. url 패턴 ex) @RequestMapping("deptList.do")
		http://localhost:5070/springweb/deptList01.do
	2. 요청깃 --> ename=##&loc=@@ -> Dept(setEname, setLoc)
	3. 모델 데이터 -> view 단 넘길 데이터
		model.addAttribute("모델명", service.XXX());
	4.view 단 처리
		return "" : jsp 경로 위치 복사
	*/
	
	@RequestMapping("deptList01.do")
	public String deptList(Dept sch, Model md) {
		md.addAttribute("deptList", service.getDeptList(sch));
		return "WEB-INF\\views\\a04_dept\\a01_deptList.jsp";
	}
}
