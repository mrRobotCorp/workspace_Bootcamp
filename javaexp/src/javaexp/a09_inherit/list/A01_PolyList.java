package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A01_PolyList {

	public static void main(String[] args) {
		ArrayList<Duck> dlist = new ArrayList<Duck>();
		dlist.add(new NormalDuck());
		dlist.add(new RubberDuck());
		dlist.add(new Mallard());
		
		for(Duck d:dlist) {
			d.swimming();
		}
		
		System.out.println("------------------------------");
		// ex) Part class 하위 Ram, Cpu, Ssd 클래스 생성
		//		위 ArrayList<Part>에 담아서 재정의된 메서드로 호출
		ArrayList<Part> plist = new ArrayList<Part>();
		plist.add(new Ram("8 GB"));
		plist.add(new Ram("8 GB"));
		plist.add(new Cpu("i7"));
		plist.add(new Cpu("i7"));
		plist.add(new Ssd("516 GB"));
		
		for(Part p:plist) {
			p.showPart();
		}
	}

}

class Part {
	private String parts;
	private String spec;

	public Part(String parts, String spec) {
		this.parts = parts;
		this.spec = spec;
	}

	public void showPart() {
		System.out.println(parts + " 부품, 스펙은 " + spec);
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}
	
}

class Ram extends Part {

	public Ram(String spec) {
		super("Ram", spec);
	}

	@Override
	public void showPart() {
		super.showPart();
		System.out.println("휘발성 메모리 램램..");
	}
}

class Cpu extends Part {

	public Cpu(String spec) {
		super("Cpu", spec);
	}

	@Override
	public void showPart() {
		super.showPart();
		System.out.println("중앙처리장치 씨피유씨피유..");
	}
}

class Ssd extends Part {

	public Ssd(String spec) {
		super("Ssd", spec);
	}

	@Override
	public void showPart() {
		super.showPart();
		System.out.println("컴퓨터가 가지고 있는 용량");
	}
}

class Duck {
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	
	public void swimming() {
		System.out.println(kind + "가 수영을 한다");
	}
}

class NormalDuck extends Duck {

	public NormalDuck() {
		super("집 오리");
	}

	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 앞 호수에서 즐겁게...꽥꽥...");
	}
	
}

class RubberDuck extends Duck {

	public RubberDuck() {
		super("고무 오리");
	}

	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 안 욕조 안에서 둥둥 떠다니며....");
	}
	
}

class Mallard extends Duck {

	public Mallard() {
		super("청둥 오리");
	}

	@Override
	public void swimming() {
		super.swimming();
		System.out.println("강가에서 친구들과 즐겁게...첨벙..");
	}
	
}






