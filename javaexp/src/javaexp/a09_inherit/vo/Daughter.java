package javaexp.a09_inherit.vo;

public class Daughter extends Mother {
	String job = "Doctor";
	
	public void jump() {
		System.out.println("--- 상위 클래스의 객체 ---");
		// 상위에서 받은 필드값. 바로 사용 가능
		System.out.println(charac);
		skill();
		System.out.println("--- 현 객체의 필드 ---");
		System.out.println(job);
	}
	
	void callHeihgt() {
		checkHeight(-5);
		System.out.println(getHeight() + "cm"); // 간접 접근 형태
		
	}
	
}
