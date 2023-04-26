package javaexp.z01_home.vo;

public class Woman {
	private String name;
	private String job;
	private int age;
	private Man man;
	
	public Woman(Man man) {
		this.man = man;
	}
	
	public Woman(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public void inWoman(String name) {
		this.name = name;
		System.out.println("여성 멤버가 들어왔습니다.");
	}
	
//	public void wInfo() {
//		System.out.println("--- woman info ----");
//		System.out.println("이름\t" + name);
//		System.out.println("직업\t" + job);
//		System.out.println("나이\t" + age);
//	}
	
	public void showInfo() {
		System.out.println("--- woman info ----");
		System.out.println("이름\t" + name);
		System.out.println("직업\t" + job);
		System.out.println("나이\t" + age);
	}

	public Woman() {
		// TODO Auto-generated constructor stub
	}

	
}
