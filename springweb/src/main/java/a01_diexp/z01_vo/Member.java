package a01_diexp.z01_vo;
// a01_diexp.z01_vo.Member

public class Member {
	// Member 아이디 패스워드 이름 권한 포인트
	private String id;
	private String pw;
	private String mname;
	private String auth;
	private int point;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pw, String mname, String auth, int point) {
		this.id = id;
		this.pw = pw;
		this.mname = mname;
		this.auth = auth;
		this.point = point;
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
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
