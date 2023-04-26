package javaexp.a09_inherit;

public class A09_PolyExp {

	public static void main(String[] args) {
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
		Duck d1 = new NormalDuck();
		d1.flying();
		Duck d2 = new Mallard();
		d2.flying();
		
		
	}

}
class Duck {
	private String kind;
	
	public Duck(String kind) {
		this.kind = kind;
	}

	public void flying() {
		System.out.println(kind + "는 날 수 있는가");
	}
}

class NormalDuck extends Duck {

	public NormalDuck() {
		super("집오리");
	}
	
	public void flying() {
		super.flying();
		System.out.println("날지 못 함");
	}
	
}

class Mallard extends Duck {

	public Mallard() {
		super("청둥오리");
	}
	
	public void flying() {
		super.flying();
		System.out.println("날아 다님");
	}
	
}