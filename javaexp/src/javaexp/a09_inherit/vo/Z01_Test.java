package javaexp.a09_inherit.vo;

public class Z01_Test {

	public static void main(String[] args) {
		Son s1 = new Son();
		// 상속에 의해 상위가 가지고 있는 멤버 사용
		System.out.println(s1.shape);
		System.out.println(s1.workKind);
		// 상속에 의해 상위 객체가 가지고 있는 맴버 사용
		s1.running();
		s1.playBaseBall();
		s1.callSuper();
		s1.addAge(20);
		
		System.out.println("------------------------");
		// ex) Mother class - charac(현명하다) skill(make money)
		// Daughter 위 내용을 상속 받아서 추가 속성과 메서드 처리
		// main()에 호출
		Daughter d1 = new Daughter();
		System.out.println(d1.charac); // 상위 필드 멤버 호출
		System.out.println(d1.job); // 해당 필드 호출
		
		d1.jump(); // 해당 메서드 호출
		
		//ex) Mother 클래스에서 private 접근제어자로 변수 선언(height)
		//		간접적으로 할당 및 호출하는 메서드 생성, daughter에서 그 메서드 호출
		d1.callHeihgt();

		
	}

}
