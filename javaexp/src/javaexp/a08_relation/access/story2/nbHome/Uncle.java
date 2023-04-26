package javaexp.a08_relation.access.story2.nbHome;

import javaexp.a08_relation.access.story2.woodHome.WoodCutter;

public class Uncle {
	public void callWoodInfo() {
		// 외부 패키지, 상속 없는 클래스. public밖에 되지 않음.
		WoodCutter wc = new WoodCutter();
//		System.out.println("private : " + wc.privSec);
//		System.out.println("default : " + wc.ourHomeSec);
//		System.out.println("protected : " + wc.inheritSec);
		System.out.println("public : " + wc.announce);
	}
	
	public void callWoodInfo2() {
		// pirvate. 되겠냐
//		System.out.println("private : " + privSec);
		// 같은 패키지만
//		System.out.println("default : " + ourHomeSec);
		// 상속도 안 받았는데 뭐 바람
//		System.out.println("protected : " + inheritSec);
//		System.out.println("public : " + announce);
	}
	
}
