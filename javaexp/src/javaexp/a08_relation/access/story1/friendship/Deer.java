package javaexp.a08_relation.access.story1.friendship;

public class Deer {
	//
	void callWoodCutterInfo() {
		WoodCutter wc = new WoodCutter();
		
		// private은 동일 패키지라도 직접 접근은 불가능
//		System.out.println("private 접근 제어(동일 패키지) : " + wc.hiddenCloth);
		
		System.out.println("default 접근 제어(동일 패키지) : " + wc.hiddenDeer);
	}
}
