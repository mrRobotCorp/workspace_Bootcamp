package springweb.a05_mvcexp.a03_dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Member;

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
	
	
}
