package javaexp.z01_home.vo;

public class Members {
	private String id;
	private String pw;
	private String name;
	private int points;
	private boolean access;
	public Members() {
		// TODO Auto-generated constructor stub
	}
	public Members(String id, String pw, String name, int points, boolean access) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.points = points;
		this.access = access;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	
	
}