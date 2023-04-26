package javaexp.a09_inherit.vo;

// class XXX extends 상위 클래스
public class Son extends Father {
	String workKind = "개발자";
	
	void playBaseBall() {
		System.out.println("야구를 잘함.");
	}
	
	void callSuper() {
		System.out.println(shape);
//		System.out.println(age); // 접근 제어자가 private이므로 상속 사용 불가능
		addAge(20); // private인 age를 메서드에 할당하여 간접적으로 접근 가능
		System.out.println("간접 접근으로의 호출 : " + getAge());
	}
}
