package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A02_OneVsMulti {

	public static void main(String[] args) {
		Computer com1 = new Computer("맥북");
//		com1.addPart(new Cpu("i7 3.4GHZ"));
//		com1.addPart(new Ram("8 GB"));
//		com1.addPart(new Ssd("516 GB"));
//		com1.addPart(new Ssd("128bits 6core"));
//		com1.showAllInfo();
		
		//ex) 전원 공급 장치 Power class 에 부품 추가
		
		com1.addPart(new Cpu("i7 3.4GHZ"));
		com1.addPart(new Ram("8 GB"));
		com1.addPart(new Ssd("128bits 6core"));
		com1.addPart(new GraphicCard("128bits 6core"));
		
		com1.showAllInfo();
	}

}

class Power extends Part {

	public Power(String spec) {
		super("파워공급", spec);
	}
	
	@Override
	public void showPart() {
		super.showPart();
		System.out.println("그래픽 카드는 컴퓨터의 동적 화면 처리를 빠르게 처리 함");
	}
	
	
}
// 추가 할 내용을 상속 받아서 클래스를 구현하고 메서드를 재정의한 후
// 포함 할 클래스의 메서드에 객체 생성 추가하면 됨
class GraphicCard extends Part{

	public GraphicCard(String spec) {
		super("그래픽 카드", spec);
	}

	@Override
	public void showPart() {
		super.showPart();
		System.out.println("그래픽 카드는 컴퓨터의 동적 화면 처리를 빠르게 처리 함");
	}
	
}

class Computer extends Part {
	private String kind;
	private ArrayList<Part> plist;


	public Computer(String spec) {
		super("파워공급", spec);
		plist = new ArrayList<Part>();
	}
	
	public void addPart(Part part) {
		plist.add(part);
		System.out.println(kind + "에 " + part.getParts() + " 부품 추가됩니다.");
	}
	
	public void showAllInfo() {
		System.out.println(kind + " 컴퓨터 부품 리스트");
		if(plist.size()>0) { // <- if문은 필수 아님, 보험 차원
			for(Part p:plist) {
				p.showPart();
			}
		} else {
			System.out.println("부품이 없음.");
		}
	}
	
}
