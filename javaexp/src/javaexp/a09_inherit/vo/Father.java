package javaexp.a09_inherit.vo;

public class Father {
	String shape = "통통하다";
	private int age = 40; // 접근 제어자 private 직접외부에서 접근할 수 없음
	
	void running() {
		System.out.println("빠르게 달린다.");
	}
	
	void addAge(int age) { // 간접적으로 추가
		age += age;
	}
	
	int getAge() { // 간접적으로 호출 가능
		return age;
	}
	
	
}
