package frontWeb2.vo;

import java.util.Date;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate; // java.util.Date로 임포트 할 것. sql 아님
	private String hiredateS;
	private Double sal;
	
	public String getHiredateS() {
		return hiredateS;
	}

	// 수정을 위한 생성자
	public Emp(int empno, String ename, String job, String hiredateS, Double sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredateS = hiredateS;
		this.sal = sal;
	}

	public void setHiredateS(String hiredateS) {
		this.hiredateS = hiredateS;
	}
	private Double comm;
	
	public Emp(int empno, String ename, String job, int mgr, String hiredateS, Double sal, Double comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredateS = hiredateS;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	private int deptno;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	// 검색 시 필요한 ename, job
	public Emp(String ename, String job) {
		this.ename = ename;
		this.job = job;
	}
	
	public Emp(int empno, String ename, String job, int mgr, Date hiredate, Double sal, Double comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
