package javaexp.z01_home;

public class A13_0420 {

	public static void main(String[] args) {
		/*
		1. 다형성을 대한 내용에 대하여 정리해보자.
		1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가? yeah!
		상속 관계 중 상속 받은 하위 클래스에서 기능적 분리를 하는 메서드를 
		상위 클래스의 이름(매개변수)과 동일하게 정의하여 다양한 기능 처리를 하기 위해.
		
		2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가? yeah!
		상속하는 부모 클래스 = new 자식 클래스 생성자();
		1. 상위 class Part
			공통 필드 String name(부품명)
			오버라이딩 메서드 void showInfo()
		2. 상속 받는 하위 클래스(계속 추가) 
			상위 생성자를 호출하는 생성자 super("Cpu")
			오버라이딩 메서드 void showInfo()
							super.showInfo()
		3. 위 내용을 다형성 처리하는 클래스
			class 포함할 클래스 {
				고유 필드
				상위 클래스 참조명
				하위 클래스 초기화할 메서드
			}
		
		3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 
		기능메서드 drawing()을 처리하여 출력되게 하세요
		삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
		*/
		Polygon p01 = new Triangle();
		p01.drawing();
		
		Polygon p02 = new Square();
		p02.drawing();

		Polygon p03 = new Pentagon();
		p03.drawing();
		
		/*
		6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
		7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.
		*/
		Drink d1 = new Beer();
		Drink d2 = new Vodka();
		d1.shake();
		d2.shake();
		
	}

}

class Drink {
	private String kind;

	public Drink(String kind) {
		this.kind = kind;
	}
	
	public void shake() {
		System.out.print(kind + "를 섞어서 ");
	}
}

class Beer extends Drink {

	public Beer() {
		super("맥주");
	}

	@Override
	public void shake() {
		super.shake();
		System.out.println("소맥을 만들다..");
	}
}

class Vodka extends Drink {

	public Vodka() {
		super("보트카");
	}

	@Override
	public void shake() {
		super.shake();
		System.out.println("다음 날 숙취로 앓아눕다");
	}
}


class Polygon {
	private String kind;

	public Polygon(String kind) {
		this.kind = kind;
	}
	
	public void drawing() {
		System.out.print(kind + " 모양으로 ");
	}
}

class Triangle extends Polygon {

	public Triangle() {
		super("삼각형");
	}

	@Override
	public void drawing() {
		super.drawing();
		System.out.println("세모난 집을 그리다.");
	}
}

class Square extends Polygon {

	public Square() {
		super("사각형");
	}

	@Override
	public void drawing() {
		super.drawing();
		System.out.println("네모난 빌딩을 그리다.");
	}
}

class Pentagon extends Polygon {

	public Pentagon() {
		super("오각형");
	}

	@Override
	public void drawing() {
		super.drawing();
		System.out.println("뉴진스의 하입보이요.");
	}
}
