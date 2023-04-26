package javaexp.a08_relation.access.story2.woodHome;

public class Daughter extends WoodCutter {
	// 상속 + 같은 패키지 안에 있는 클래스는 private 이외에 모두 접근 가능
	// 객체 생성과 상속으로 사용
	public void callWoodInfo() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private : " + wc.privSec);
		System.out.println("default : " + wc.ourHomeSec);
		System.out.println("protected : " + wc.inheritSec);
		System.out.println("public : " + wc.announce);
	}
}
