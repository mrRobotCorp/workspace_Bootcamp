package springweb.a05_mvcexp.a03_dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import springweb.a05_mvcexp.z01_vo.Dept;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Employees;
import springweb.a05_mvcexp.z01_vo.Job;
import springweb.a05_mvcexp.z01_vo.Member;
import springweb.a05_mvcexp.z01_vo.Student02;

// springweb.a05_job.a03_dao.A01_MemberDao
public interface A01_MemberDao {
	public List<Member> memberList(Member sch);
//	public String exp01();
//	public String daoexp2();
//	public int daoexp3();
//	public String exp04(String ename);
//	public double exp05(int empno);
//	public int exp06(String ename);
//	public Date exp07(int empno);
//	
//	// INSERT INTO DEPT01 values(11, '인사', '서울')
//	public void exp08Ins(Dept ins);
//	public void stuIns(Student02 ins);
//	public void locIns(Location ins);
	public List<Emp> exp11EmpList(Emp sch);
	public List<Emp> exp12EmpList(Map sch);
	public List<Emp> exp13EmpList(Map sch);

	public void exp14DeptInsert(@Param("no") int deptno,
			@Param("dpartnm") String dname,
			@Param("location") String loc);
	
	public List<Emp> exp15EmpList(@Param("startDte") String startDte,
				@Param("endDte") String endDte);
	
	public List<Student02> exp16StuList(@Param("stuName") String stuName,
						@Param("startP") int startP,
						@Param("endP") int endP);
	
	public int getEmpCount(@Param("minSal") int minSal,
				@Param("maxSal") int maxSal);
	
	public double getDeptMaxSal(@Param("deptno") int deptno);
	
	public List<Employees> getEmployee(@Param("id") int employee_id);
	public List<Job> getJobList(@Param("jobId") String jobId);
	public List<String> exp19getEnames(@Param("minSal") int minSal,
						@Param("maxSal") int maxSal);
	
	public List<String> exp20GetLoc(@Param("ctryId") String ctryId);
	public List<Emp> getEmpResultExp();
	public List<Dept> getDeptResultExp();
	
	
	
}
