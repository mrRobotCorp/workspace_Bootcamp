package javaexp.a09_inherit;

public class A02_super {

	public static void main(String[] args) {
		Daughter d1 = new Daughter();
		System.out.println(d1.charac);
		System.out.println(d1.name);
		d1.call();
		
		// ex) Father, Son 클래스 선언
		// 1. 변수 동일 선언  /  2. 매개변수가 1개 있는 상위 생성자 선언 후 하위에서 호출
		// 3. 동일 메서드 선언하여 상하위 구분하여 처리
		System.out.println("----------------------");
		Son s1 = new Son();
		s1.callLoc();

	}
}

class Father {
	String place = "Jeju ";
	int post = 3482;
	
	Father(String name) {
		System.out.println("father 생성자");
	}
	
	void callLoc() {
		System.out.println("--- father 메서드 호출 ---");
		System.out.println(place + post);
	}
}

class Son extends Father {
	String place = "Busan ";
	int post = 1111;
	
	Son() {
		// 상위 생성자 호출 필수 (상위 클래스와 동일 이름의 메서드 - 매개변수 맞춰서)
		super("제주");
		System.out.println("son 생성자");
	}
	
	Son(String place) {
		this();
	}
	
	
	void callLoc() {
		super.callLoc();
		System.out.println("--- son 메서드 호출 ---");
		System.out.println(place + post);
	}
}

class Mother {
	String charac = "온화함";
	String name = "어머니";
	
	Mother(String name) {
		System.out.println("mother 생성자");
	}
	
	void call() {
		System.out.println("--- 상위 메서드 호출 ---");
		System.out.println("성격 : " + charac);
	}
}

class Daughter extends Mother {
	String name = "딸";
	
	Daughter() {
		// super(); <- 기본적으로 생략된 내용. default로 컴파일 시 호출됨.
		super("상위"); // 반드시 상위 생성자를 호출해야 함 (상위 클래스 이름의 메서드<- 매개변수 맞출 것)
		System.out.println("딸 생성자");
	}
	
	Daughter(String name) {
		// 내부에 가지고 있는 생성자 호출 -> 바로 위 Daughter()를 호출 -> 그 안에 상위 생성자를 호출하기 떄문에 오류 X
		this();
	}
	
	// 메서드 오버라이딩(overriding) : 상위 클래스의 메서드에 올라 타서 동일하게 정의 (똑같은 내용 정의)
	void call() {
		// 상위에 있는 메서드를 현재 메서드와 구분하여 호출할 때 super.메서드
		super.call();
		System.out.println("--- 메서드 호출 ---");
		System.out.println(charac); // 온화함 출력
		System.out.println("super.name : " + super.name); // 어머니 출력
		System.out.println("this.name : " + this.name); // 딸 출력
		System.out.println("name : " + name); // this 생략 시 자체적으로 가진 필드값인 딸 출력
	}
}



