package javaexp.a09_inherit.abstrac;

public class A03_DuckWorld {

	public static void main(String[] args) {
		Duck d1 = new NormalDuck();
		Duck d2 = new Mallard();
		
		d1.swimming();
		d2.swimming();
		d1.fly();
		d2.fly();
		
		/*
		하위에 RubberDuck 클래스 생성
			추상 클래스 상속 받아 swimming 재정의 하여 목욕탕에서 놀다 출력
			추가 메서드로 usingForKids() 아이들을 위해 만들어진 오리
		*/
		Duck d3 = new RubberDuck();
		d3.swimming();
//		d3.usingForKids(); // 하위에서 추가된 메서드는 다형성에 의해 처리되지 않음. 
		RubberDuck d4 = (RubberDuck)d3; // typecasting
		d4.usingForKids();
		RubberDuck d5 = new RubberDuck(); // 초기 생성할 때 해당 객체로 생성
		d5.usingForKids();

	}
}
/*
 ex) 아래와 같이 추상 클래스 Duck을 선언하여 main()에서 호출
	Duck(추상) - 필드 : kind(종류), 생성자1, swimming() 수영을 하다(공통), getKind(공통)
	fly(추상메서드)
	NormalDuck(실제클래스) 일반오리 : fly() 날지 못 한다.
	Mallard(실제클래스) 청둥오리 : fly() 훨훨 난다.

*/

abstract class Duck {
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	
	public void swimming() {
		System.out.print(kind + "가 수영을 한다. ");
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	abstract void fly();
}

class RubberDuck extends Duck {

	public RubberDuck() {
		super("고무오리");
	}

	@Override
	void fly() {
		
	}
	
	public void swimming() {
		super.swimming();
		System.out.println("목욕탕에서..");
	}
	
	// 하위 클래스에서 추가된 내용
	void usingForKids() {
		System.out.println(getKind() + "는 아이들을 위해 만들어진 오리");
	}

}

class NormalDuck extends Duck {
	/*
	# 상속 시 유의사항
	1. 상위 생성자를 호출해야 함. super(매개변수) : 상위 클래스에서 선언된 생성자 호출
	2. 추상 클래스일 때는 추상 메서드를 반드시 재정의 해야 함.
	*/

	public NormalDuck() {
		super("일반 오리");
	}
	
	public void swimming() {
		super.swimming();
		System.out.println("첨 - 벙");
	}
	
	public void fly() {
		System.out.println(getKind() + "는 날지 못 한다...");
	}
	
}

class Mallard extends Duck {

	public Mallard() {
		super("청둥오리");
	}
	
	public void swimming() {
		super.swimming();
		System.out.println("첨 - 벙");
	}
	
	public void fly() {
		System.out.println(getKind() + "는 훨훨 잘..날아..?");
	}
	
}
