package javaexp.z01_home.vo;

public class Man {
	private String name;
	private String job;
	private int age;
	private Woman woman;
	
	public String getName() {
		return name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Man() {
		// TODO Auto-generated constructor stub
	}

	public Man(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}
	
	public Man(Woman woman) {
		this.woman = woman;
	}

	public void mInfo() {
//		System.out.println("--- man info ----");
//		System.out.println("이름\t" + name);
//		System.out.println("직업\t" + job);
//		System.out.println("나이\t" + age);
	}
	
	public void showInfo() {
		System.out.println("--- man info ----");
		System.out.println("이름\t" + name);
		System.out.println("직업\t" + job);
		System.out.println("나이\t" + age);
	}
	
	
}
