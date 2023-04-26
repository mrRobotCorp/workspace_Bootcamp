package javaexp.a07_classObject;

public class A03_Constructor {

	public static void main(String[] args) {
		// 클래스명을 기준으로 객체를 사용 할 준비
		Person p01;
		p01 = new Person();
		ProductVO prod01 = new ProductVO();
		
		// ex1) Computer 클래스 선언하고 default 생성자 호출
		// ex2) Mouse 클래스 선언하고 매개변수가 없는 생성자 호출
//				마우스 객체 생성이라고 출력. 호출
		// 둘 다 참조변수 com1, mou1을 호출하여 출력
		Computer com1 = new Computer();
		Mouse mou1 = new Mouse();
		Mouse mou2 = new Mouse();
		Mouse mou3 = new Mouse();
		
//		mou1.comp = "쥑쥑";
//		mou2.comp = "찍찍";
//		mou3.comp = "직직";

		System.out.println(mou1.comp);
		System.out.println(mou2.comp);
		System.out.println(mou3.comp);
		System.out.println(mou3.price);
	}

}
class Person{
	// 생성자를 아무것도 선언되지 않을 때..
	// 컴파일 시 자동으로 추가해서 생성
}

class Product {
	// 매개변수가 없는 생성자 선언.
	Product() {
		System.out.println("물건 객체 생성자 호출");
	}
}

//----------------------------------------------
class Computer {

}

class Mouse {
	// 객체 속에 있는 field는 모두 default로 초기화가 된 상황. -> 따로 default 데이터로 초기화할 필요X.
	// 추가된 데이터로 할당만 하면 됨.
	String comp;
	int price;
	
	Mouse() {
		comp = "회사입력 안됨";
		price = -1;
		System.out.println("마우스 객체 생성");
	}
}