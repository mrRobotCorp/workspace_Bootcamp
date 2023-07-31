package milrim_project.login.m04_vo;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String pass;
	private String name;
	private String email;
	private String phonenumber;
	private String auth;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pass, String name, String email, String phonenumber) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public Member(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	public Member(String id) {
		super();
		this.id = id;
	}
	public Member(String id, String pass, String name, String email, String phonenumber, String auth) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.auth = auth;
	}




	
}
