package springweb.a03_empMvc;
import org.springframework.beans.factory.annotation.Autowired;
// springweb.a02_emp.A01_EmpController
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;

@Controller("empCtrl01")
public class A01_EmpController {
	@Autowired
	private A02_EmpService service;
	private A04_PreparedDao dao;
	
	public A01_EmpController() {
		dao = new A04_PreparedDao();
	}
	
	// http://localhost:5070/springweb/empList01.do
	
	@RequestMapping("empList01.do")
	public String empList(Emp sch, Model d) {

		d.addAttribute("empList", service.getEmpList(sch));
		return "WEB-INF\\views\\a02_emp\\a01_empList.jsp";
	}
	
	@RequestMapping("empDetail01.do")
	public String empDetail(@RequestParam("empno") int empno, Model d) {
		d.addAttribute("emp", dao.getEmp(empno));
		return "WEB-INF\\views\\a02_emp\\a02_emp_detial.jsp";
	}
	
	
	@RequestMapping("empInsert01.do")
	public String empInsert(Emp ins, Model d) {
		if(ins.getEmpno() != 0) {
			service.insertEmp(ins);
			d.addAttribute("proc", "ins"); //등록 처리 process
		}
		return "WEB-INF\\views\\a03_emp\\a03_emp_InsForm.jsp";
	}
	
	@RequestMapping("empUpdate01.do")
	public String empUpdate(Emp upt, Model d) {
		service.updateEmp(upt);
		// 수정 이후에 DB 다시 가져옴
		d.addAttribute("emp", dao.getEmp(upt.getEmpno()));
		d.addAttribute("proc", "upt");
		return "WEB-INF\\views\\a03_emp\\a02_emp_detial.jsp";
	}
	
	@RequestMapping("empDelete01.do")
	public String empDelete(@RequestParam("empno") int empno, Model d) {
		service.deleteEmp(empno);
		d.addAttribute("proc", "del"); // 삭제 처리 process
		return "WEB-INF\\views\\a03_emp\\a02_emp_detial.jsp";
	}
}
