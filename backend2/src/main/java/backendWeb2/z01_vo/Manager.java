package backendWeb2.z01_vo;
// backendWeb2.z01_vo.Manager
public class Manager {
	private int empno;
	private String ename;
	private String dname;
	public Manager() {
		// TODO Auto-generated constructor stub
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
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Manager(int empno, String ename, String dname) {
		this.empno = empno;
		this.ename = ename;
		this.dname = dname;
	}
	
}