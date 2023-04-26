package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A01_StarcraftWorld {

	public static void main(String[] args) {
		// 추상 클래스는 혼자 객체를 생성하지 못 함.
		// 추상 클래스의 목적이 하위 클래스의 공통 기능 선언과
		// 다형성(메서드 재정의를 통해)이기 때문에 
		
		// 추상 클래스는 다형성 처리 할 메서드를 강제성 있게 처리 할 목적이기 때문
		// 실제 클래스가 필요 없게 만든다.
		
//		Larba lb = new Larba("드론", "빨강"); // 추상 클래스이기 때문에 실제 객체를 만드는건 에러 발생
		Larba lb01 = new Dron(); // 추상 클래스의 하위 클래스를 실제 객체에 할당하여 객체 생성.
		lb01.move(); // 상속해서 사용 할 공통 내용
		lb01.getUnit(); // 상속해서 사용 할 공통 내용
		lb01.attack(); // 상속해서 사용 할 다형성 처리 내용, 하위에서 재정의한 추상 메서드.재정의가 강제하고 있음
		
		ArrayList<Larba> myUnits = new ArrayList<Larba>();
		myUnits.add(new Dron());
		myUnits.add(new Zerggling());
		myUnits.add(new Zerggling());
		myUnits.add(new Hydralisk());
		
		System.out.println("사용 할 유닉들");
		for(Larba lb:myUnits) {
			lb.move(); // 공통 메서드
			lb.attack(); // 재정의 매서드
		}
		
		
		
	}

}

// 추상 메서드가 하나라도 있으면 추상 클래스가 되고, 드디어 혼자 객체 생성을 하지 못 함.
// 드디어 혼자 객체 생성을 하지 못함. Larba l1 = new Larba(); (X)
// 다형성에 의해서 상속 받은 하위 객체가 할당 할 때만 생성
// Larba l1 = new Dron();
// Larba l2 = new Zerggling();
// Larba l3 = new Hydralist();
abstract class Larba { 
	private String kind;
	
	public Larba(String kind) {
		this.kind = kind;
	}
	
	public String getUnit() {
		return "색 " + kind;
	}
	
	// 공통 메서드
	public void move() {
		System.out.println(kind + " 이동한다.");
	}
	
	// 추상 메서드
	// 상속 받는 하위에서 반드시 재정의 할 메서드
	public abstract void attack();
	
	
}

class Dron extends Larba {

	public Dron() {
		super("드론");
	}

	@Override
	public void attack() {
		System.out.println(getUnit() + " 채집 유닉이라 공격을 못 한다.");
		System.out.println(getUnit() + " 공격력 5로 미약하게 공격하다");
	}
	
}

class Zerggling extends Larba {

	public Zerggling() {
		super("저글링");
	}

	@Override
	public void attack() {
		System.out.println(getUnit() + " 초기 공격 유닉으로 공격력 5로 빠르게 공격하다");
	}
	
}

class Hydralisk extends Larba {

	public Hydralisk() {
		super("히드라리스크");
	}

	@Override
	public void attack() {
		System.out.println(getUnit() + " 중대형 공격 유닉으로 공격력 15로 원거리 공격하다");
	}

	@Override
	public void move() {
		super.move();
		System.out.println("속도 업그레이드 시 빠르게 이동함");
	}

}







