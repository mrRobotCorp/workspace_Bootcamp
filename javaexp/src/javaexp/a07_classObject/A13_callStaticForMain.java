package javaexp.a07_classObject;

public class A13_callStaticForMain {
	
	int num01;
	static int num02;
	
	void call() {
		System.out.println("static 메서드");
	}
	
	static void call2() {
		System.out.println("일반 메서드");
	}
	
	public static void main(String[] args) {
		A13_callStaticForMain n = new A13_callStaticForMain();
		n.num01 = 25; // 일반 변수이므로 따로 객체 생성
		n.call(); // 일반 메서드는 따로 생성된 객체로 호출
		
		// main()을 포함하는 클래스기 때문에 바로 할당 가능
		A13_callStaticForMain.num02 = 10;
		num02 = 10;
		
		A13_callStaticForMain.call2();
		call2();
	}

}
