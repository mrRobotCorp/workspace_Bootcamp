package springweb.a05_mvcexp.z01_vo;
// springweb.a05_mvcexp.z01_vo.EmpJob
public class EmpJob {
	private Employees employee;
	private Job job;
	public EmpJob() {
		// TODO Auto-generated constructor stub
	}
	public EmpJob(Employees employee, Job job) {
		this.employee = employee;
		this.job = job;
	}
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
}
