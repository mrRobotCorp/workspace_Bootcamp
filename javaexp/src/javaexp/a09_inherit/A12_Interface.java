package javaexp.a09_inherit;

public class A12_Interface {

	public static void main(String[] args) {
		// 다형성 처리
		Wing w01 = new Wing01();
		Wing w02 = new Wing02();
		w01.fly();
		w02.fly();
		// ex) SwimmingWay 인터페이스를 선언하고 상수로 "수영" 추상 메서드 swimming()
		//		Swimming01 우리동네 풀장을 수영하다. Swimming02 호수를 수영하다
		//		로 다형성으로 선언 호출 처리
		
		SwimmingWay sw01 = new Swimming01();
		SwimmingWay sw02 = new Swimming02();
		sw01.swimming();
		sw02.swimming();
		
		Robot r1 = new Robot("MZ");
		r1.flying();
		r1.adapterWing(new Wing01());
		r1.adapterWing(new Wing02());
		r1.flying();
		
		SwimmingPlayer swP = new SwimmingPlayer("Joe");
		swP.addSkill(new Swimming01()); // 동네 풀장에서
		swP.addSkill(new Swimming02()); // 호수에서
		swP.swimming();
	}
}
// ex) SwimmingPlayer 클래스 선언, 이름과 SwimmingWay로 필드 선언
//		addSkill로 SwimmingWay 할당. swimming() 메서드를 통해 해당 선수의 이름과 수영하다 처리
class SwimmingPlayer {
	private String name;
	private SwimmingWay swWay;
	
	public SwimmingPlayer(String name) {
		this.name = name;
	}

	public void addSkill(SwimmingWay swWay) {
		this.swWay = swWay;
		System.out.println(name + "가 수영 기술을 익혔다.");
	}
	
	public void swimming() {
		System.out.print(name + "가 ");
		if(swWay == null) {
			System.out.println("아직 수영 기술을 익히지 못 함");
		} else {
			swWay.swimming();
		}
	}
}

class Robot {
	private String kind;
	// 인터페이스를 인식할 수 있는 메모리 선언
	private Wing wing;
	public Robot(String kind) {
		this.kind = kind;
	}
	
	// r.adapterWing(new Wing01()); 기능을 하는 실제 객체가 들어 오게 처리
	public void adapterWing(Wing wing) {
		this.wing = wing;
		System.out.println(Wing.NAME + "를 " + kind + " 어깨에 붙이다.");
	}
	
	public void flying() {
		System.out.print(kind + " 로봇은 ");
		if(wing == null) {
			System.out.println("아직 날지 못 함.");
		} else {
			wing.fly();
		}
	}
	
	
}

interface SwimmingWay {
	String SWIM = "수영하다."; // public static final로 자동 설정 (변경 불가)
	void swimming(); // 자동 abstract(추상) 설정 
}

class Swimming01 implements SwimmingWay {

	@Override
	public void swimming() {
		System.out.println("우리 동네 풀장을 " + SWIM);
	}
}

class Swimming02 implements SwimmingWay {

	@Override
	public void swimming() {
		System.out.println("호수를 " + SWIM);
	}
}


interface Wing{
	String NAME = "날개"; // public static final 자동 생략
	void fly(); // public abstract 자동 생략
}

// 인터페이스를 상속 받을 때는 implements 인터페이스명 으로 선언함
class Wing01 implements Wing {
//	NAME = "날개 1호"; static final인 변수이므로 재정의 불가능
	// 반드시 재정의 해야 함
	@Override
	public void fly() {
		System.out.println(NAME + " 1호로 우리 동네를 날아다니다.");
		
	}
}

class Wing02 implements Wing {
	@Override
	public void fly() {
		System.out.println(NAME + " 2호로 아시아를 날아다니다.");
		
	}
}

