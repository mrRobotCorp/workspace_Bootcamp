package javaexp.a09_inherit;

public class A03_Overriding {

	public static void main(String[] args) {
		HyunDae com1 = new HyunDae();
		com1.earnMoney();
		Samsung com2 = new Samsung();
		com2.earnMoney();
		
		// company를 상속받은 회사 클래스 생성, earnMoney()를 재정의한 후 main()에ㅓㅅ 호출
		Naver com3 = new Naver();
		com3.earnMoney();
		
		// 상위 Worker - kind (직업종류), Worker(String name) 생성자, working()
		// 하위 Police - 상위 변수 및 메서드 재정의
		// 하위 Programmer
		Police p01 = new Police();
		Programmer pro1 = new Programmer();
		p01.working();
		pro1.working();
		
		
	}

}

class Worker {
	private String kind;
	
	public Worker(String kind) {
		this.kind = kind;
	}
	
	public void working() {
		System.out.println("직업은 " + kind);
		// 상위 working과 구분하기 위해 super.오버라이딩메서드() 선언
	}
	
}

class Police extends Worker {
	Police() {
		super("경찰");
	}
	
	public void working() {
		System.out.print("하위 메서드 Police - ");
		super.working();
	}
	public void call() {
		this.working(); // 현재 클래스의 working메서드 호출
		super.working(); // 상위 클래스의 working()메서드 호출
	}
}


class Programmer extends Worker {
	Programmer() {
		super("개발자");
	}
	
	public void working() {
		System.out.print("하위 메서드 Programmer - ");
		super.working();
	}
}

class Company{
	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public void earnMoney() {
		System.out.println(name + "회사가 돈을 벌다.");
	}
}

class Naver extends Company {
	public Naver() {
		super("네이버");
	}
	
	public void earnMoney() {
		System.out.print("웹 포털로 ");
		super.earnMoney();
	}
}

class HyunDae extends Company {
	public HyunDae() {
		// 상속 시 상위 있는 생성자를 호출하여야 함
		// 직접 접근하지 못 하는 상위 private name을 간접적으로 접근하여 처리.
		super("현대");
	}
	// overriding은 상위에 있는 메서드를 동일학 처리하면서
	// 상위 기능과 다르게 처리하는 것.
	public void earnMoney() {
		System.out.print("배를 만들어서 ");
		super.earnMoney(); // 상위 메서드를 호출 super.
	}
}

class Samsung extends Company {
	public Samsung() {
		super("삼성");
	}
	public void earnMoney() {
		System.out.print("전자제품을 만들어서 ");
		super.earnMoney();
	}
}
/*
 				Company
 	
	Hyundae		Samsung		Naver
	earnMoney	earnMoney	earnMoney
	
	상위 공통된 Company를 통해서 상속 받은 하위 객체들이 다양한 객체로 같은 메서드이지만
	다른 기능 기능을 처리.
	이것을 다양한 객체들로 만들어 진다고 하여 다형성(polymorphism)이라는 개념으로 사용함.
	
	Company com1 = new Hyundae();
	Company com2 = new Samsung();
	Company com3 = new Naver();
	
	#하나의 상위 메모리를 통해 상속 관계와 overriding이 되어 있으면,
	다양한 하위 기능을 가진동일한 메서드 호출을 통해 처리될 수 있음.
	
	Company[] arry = {new Hyundae(), new Samsung(), new Naver() };
	arry[0].earnMoney();
	arry[1].earnMoney();
	arry[2].earnMoney();
 	
 	
 */


