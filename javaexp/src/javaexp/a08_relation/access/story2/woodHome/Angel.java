package javaexp.a08_relation.access.story2.woodHome;

public class Angel extends WoodCutter {
	public void callWoodInfo() {
		WoodCutter wc = new WoodCutter();
		// private은 클래스 외부는 모두 접근X. 나머지는 동일 클래스일 때 모두 접근 가능한 접근 제어자
//		System.out.println("private : " + wc.privSec);
		System.out.println("default : " + wc.ourHomeSec);
		System.out.println("protected : " + wc.inheritSec);
		System.out.println("public : " + wc.announce);
	}
	
	public void callWoodInfo2() {
		// 상속이고 뭐고 간에 private임
//		System.out.println("private : " + privSec);
		System.out.println("default : " + ourHomeSec);
		System.out.println("protected : " + inheritSec);
		System.out.println("public : " + announce);
	}
}
