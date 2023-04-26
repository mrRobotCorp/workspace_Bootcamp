package javaexp.a09_inherit;

public class A05_Poly_Parts {

	public static void main(String[] args) {
		Computer com1 = new Computer("삼성");
		com1.showInfo();
		// Part part = new Cpu("i7 3.4GHZ"); <- 가 되기 때문에 Part part를 참조변수(매개변수?)로 받는
		// addPart()에서 참조변수로 쓸 수 있음
		com1.addPart(new Cpu("i7 3.4GHZ"));
		com1.showInfo();
		System.out.println("----------------------------");
		com1.addPart(new Ram("8G"));
		com1.showInfo();
		
		// ex) SSD를 상속하여 main에서 호출
		System.out.println("----------------------------");
		com1.addPart(new Ssd("518GB"));
		com1.showInfo();
	
	}

}

class Part {
	private String kind;
	private String spec;
	
	public Part(String kind, String spec) {
		this.kind = kind;
		this.spec = spec;
	}

	public void showInfo() {
		System.out.println("--- 부품 정보 ---");
		System.out.println("부품명 : " + kind);
		System.out.println("사양 : " + spec);
	}
	
}

class Ssd extends Part {

	public Ssd(String spec) {
		super("SSD",spec);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("ssd는 하드웨어적으로 지속적인 메모리 공간에 할당함");
	}
}

class Cpu extends Part {

	public Cpu(String spec) {
		super("CPU", spec);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		// 추가되는 기능을 처리하여 각 부품별로 동일한 메서드이지만 다양한
		// 기능적 처리를 할 수 있게 함.
		System.out.println("CPU는 컴퓨터의 핵심 부품으로 중앙처리를 함.");
	}	
}

class Ram extends Part {

	public Ram(String spec) {
		super("Ram 메모리", spec);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Ram은 컴퓨터의 휘발성 임시 메모리를 처리함.");
	}	
}
// 1단계 - 1:1 관계 구조 컴퓨터 안에 다양한 하나의 부품을 장착가능하게 처리
class Computer {
	private String company;
	private Part part;

	public Computer(String company) {
		this.company = company;
	}
	
	public void addPart(Part part) {
		this.part = part;
		System.out.println("부품이 장착되었음.");
	}
	
	public void showInfo() {
		System.out.println(company + " 회사의 컴퓨터");
		if(part != null) {
			part.showInfo();
		} else {
			System.out.println("부품이 장착되지 않았음.");
		}
	}
}
