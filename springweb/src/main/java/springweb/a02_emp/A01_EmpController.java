package springweb.a02_emp;
// springweb.a02_emp.A01_EmpController
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;

@Controller
public class A01_EmpController {
	private A04_PreparedDao dao;
	
	public A01_EmpController() {
		dao = new A04_PreparedDao();
	}
	
	// http://localhost:5050/springweb/empList.do
	
	// ename=Joe&job=사원 --> form
	// <c:forEach var="emp" items="${empList}/>
	@RequestMapping("empList.do")
	public String empList(Emp sch, Model d) {
		if(sch.getEname() == null) sch.setEname("");
		if(sch.getJob() == null) sch.setJob("");
		d.addAttribute("empList", dao.getEmpList(sch));
		return "WEB-INF\\views\\a02_emp\\a01_empList.jsp";
	}
	
	// <c:forEach ...
	// 	<tr> ondblclick="goPage(${emp.empno})>
	//	... function goPage() {
	//			location.href = "${path}/empDetail.do?empno=" + empno	
	
	@RequestMapping("empDetail.do")
	public String empDetail(@RequestParam("empno") int empno, Model d) {
		d.addAttribute("emp", dao.getEmp(empno));
		return "WEB-INF\\views\\a02_emp\\a02_emp_detial.jsp";
	}
	
	/*
	view(jsp)
	name = "empno" value="${emp.empno}"
	name = "ename" value="${emp.ename}"
 	${empno}
	${ename}
	*/
	
	// empno=50&ename=철수&job=
	// http://localhost:5050/springweb/empInsert.do
	@RequestMapping("empInsert.do")
	public String empInsert(Emp ins, Model d) {
		if(ins.getEmpno() != 0) {
			dao.insertEmp(ins);
			d.addAttribute("proc", "ins"); //등록 처리 process
		}
		return "WEB-INF\\views\\a02_emp\\a03_emp_InsForm.jsp";
	}
	
	// submit으로 form 하위 name, value 모두 가져옴
	// ?empno=101&ename=짱구&job=대리
	@RequestMapping("empUpdate.do")
	public String empUpdate(Emp upt, Model d) {
		dao.updateEmp(upt);
		// 수정 이후에 DB 다시 가져옴
		d.addAttribute("emp", dao.getEmp(upt.getEmpno()));
		d.addAttribute("proc", "upt");
		return "WEB-INF\\views\\a02_emp\\a02_emp_detial.jsp";
	}
	
	@RequestMapping("empDelete.do")
	public String empDelete(@RequestParam("empno") int empno, Model d) {
		dao.deleteEmp(empno);
		d.addAttribute("proc", "del"); // 삭제 처리 process
		return "WEB-INF\\views\\a02_emp\\a02_emp_detial.jsp";
	}
}
