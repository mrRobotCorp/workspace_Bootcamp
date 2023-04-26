package javaexp.a09_inherit;

public class A08_Poly_Zerg {

	public static void main(String[] args) {
		// 라바가 첫 번째 유닉인 드론으로 변형된다
		Larba l1 = new Dron();
		l1.attack(); // 재정의한 내용이 다양하게 처리(다형성)
		
		Larba l2  = new Zerggling();
		l2.attack();
		
		// ex) Hydralisk 히드라 - attack 공격력 15, 원거리 공격함
		Larba l3 = new Hydralisk();
		l3.attack();
		
		/*
		 ex) Duck 상위
				종류
		 		flying() 재정의
		 NormalDuck
		 		집오리
				flying() 날지 못함
		Mallard
			청둥오리
			flying() 날아 다님
		상하위 구조로 다형성 처리하여 메서드 호출
*/
	}

}


class Larba {
	private String unit;

	public Larba(String unit) {
		this.unit = unit;
	}
	
	public void attack() {
		System.out.println(unit + " 공격하려고 함.");
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}

class Hydralisk extends Larba {

	public Hydralisk() {
		super("히드라");
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("공격력은 15이고 원거리 공격을 함.");
	}
	
	
}

class Dron extends Larba {

	public Dron() {
		super("드론");
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("공격력 5이고, 자원 채집만 함.");
	}

}

class Zerggling extends Larba {

	public Zerggling() {
		super("저글링");
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("근거리 공격, 공격력 5이고 빠르게 이동함.");
	}
	
	
	
}


