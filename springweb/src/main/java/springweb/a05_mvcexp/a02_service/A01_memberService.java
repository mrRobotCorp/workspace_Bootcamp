package springweb.a05_mvcexp.a02_service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.a03_dao.A01_MemberDao;
import springweb.a05_mvcexp.z01_vo.Dept;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Employees;
import springweb.a05_mvcexp.z01_vo.Job;
import springweb.a05_mvcexp.z01_vo.Member;
import springweb.a05_mvcexp.z01_vo.Student02;

@Service
public class A01_memberService {
	@Autowired
	private A01_MemberDao dao; // 인터페이스 = new 실제객체()
	
	public List<Member> memberList(Member sch){
		if(sch.getId()==null) sch.setId("");
		if(sch.getName()==null) sch.setName("");
		return dao.memberList(sch);
	}
	public void daoexp() {
//		System.out.println("#Dao연습#");
//		System.out.println("첫번째연습:"+dao.exp01());
//		System.out.println("두번째연습:"+dao.daoexp2());
//		System.out.println("세번째연습:"+dao.daoexp3());
//		System.out.println("연습04:"+dao.exp04("KING"));
//		System.out.println("연습05:"+dao.exp05(7844));
//		System.out.println("연습06:"+dao.exp06("CLARK"));
//		System.out.println("연습07:"+dao.exp07(7844));
//		dao.exp08Ins(new Dept(11, "재무", "대전"));
		
		for(Emp emp:dao.exp11EmpList(new Emp("", 1000, 3000)) ) {
			System.out.print(emp.getEname() + "\t");
			System.out.print(emp.getJob() + "\t");
			System.out.println(emp.getSal() + "\t");
		}
		
		Map<String, String> sch = new HashMap<String, String>();
		sch.put("ename_sch", "A");
		sch.put("job_sch", "ER");
		for(Emp e:dao.exp12EmpList(sch)) {
			System.out.print(e.getEname() + "\t");
			System.out.println(e.getJob() + "\t");
		}
		
		Map<String, String> sch2 = new HashMap<String, String>();
		sch2.put("job01", "CLERK");
		sch2.put("job02", "MANAGER");
		
		for(Emp e:dao.exp13EmpList(sch2)) {
			System.out.print(e.getEmpno() + "\t");
			System.out.print(e.getEname() + "\t");
			System.out.print(e.getJob() + "\t");
			System.out.println(e.getMgr() + "\t");
		}
		
		dao.exp14DeptInsert(22, "교욱", "부산");
		
		for(Emp emp:dao.exp15EmpList("1981-01-01", "1981-12-31")) {
			System.out.print(emp.getEname() + "\t");
			System.out.println(emp.getHiredate() + "\t");
		}
		
		for(Student02 stu:dao.exp16StuList("", 50, 100)) {
			System.out.print(stu.getSno() + "\t");
			System.out.println(stu.getName() + "\t");
		}
		
		System.out.println("getEmpCount : " + dao.getEmpCount(2000, 5000));
		System.out.println("getDeptMaxSal : " + dao.getDeptMaxSal(10));
		
		for(Employees emp:dao.getEmployee(100)) {
			System.out.print(emp.getEmployee_id() + "\t");
			System.out.print(emp.getFirst_name() + "\t");
			System.out.println(emp.getEmail() + "\t");
		}

		for(Job j:dao.getJobList("O")) {
			System.out.print(j.getJob_id() + "\t");
			System.out.print(j.getJob_title() + "\t");
			System.out.print(j.getMin_sal() + "\t");
			System.out.println(j.getMax_sal());			
		}
		
		for(String name:dao.exp19getEnames(1000, 2000)) {
			System.out.println("exp19 : " + name);
		}
		
		for(String loc:dao.exp20GetLoc("S")) {
			System.out.println("exp20 : " + loc);
		}
		
		for(Emp emp:dao.getEmpResultExp()) {
			System.out.print(emp.getEmpno() + "\t");
			System.out.print(emp.getEname() + "\t");
			System.out.println(emp.getSal() + "\t");
		}
		
		for(Dept d:dao.getDeptResultExp()) {
			System.out.print(d.getDeptno() + "\t");
			System.out.print(d.getDname() + "\t");
			System.out.println(d.getLoc() + "\t");
		}
	}
	
	/*
	public void stuIns() {
		dao.stuIns(new Student02(22, "스폰지밥", 90, 86, 94));
	}
	
	public void locIns() {
		dao.locIns(new Location(1536, "강남구 역삼동", "2435", "서울", "대한민국", "KR"));
	}
	
	*/
	
}
