package backendWeb2.z01_vo;

public class Departments {
	private int d_id;
	private String d_name;
	private int manager_id;
	private double loc_id;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public double getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(double loc_id) {
		this.loc_id = loc_id;
	}
	public Departments(int d_id, String d_name, int manager_id, double loc_id) {
		this.d_id = d_id;
		this.d_name = d_name;
		this.manager_id = manager_id;
		this.loc_id = loc_id;
	}
}
