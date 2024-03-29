package javaexp.a08_relation.access.story2.sonHome;

import javaexp.a08_relation.access.story2.woodHome.WoodCutter;

public class Son1 extends WoodCutter {
	
	public void callWoodInfo() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private : " + wc.privSec);
//		System.out.println("default : " + wc.ourHomeSec);
		//  ********** 주의 *****************
		// 상속은 해당 속성을 내가 가지고 있는 것처럼 사용할 때 말함.
		// 외부에 있는 객체를 생성하여 특정 속성을 호출 상속의 범위를 벗어남. 객체를 새로 생성하면 상속의 의미가 없음
//		System.out.println("protected : " + wc.inheritSec);
		System.out.println("public : " + wc.announce);
	}
	
	public void callWoodInfo2() {
		// pirvate. 되겠냐
//		System.out.println("private : " + privSec);
		// 같은 패키지만
//		System.out.println("default : " + ourHomeSec);
		// 상속 받았기 때문에 외부 패키지여도 가능
		System.out.println("protected : " + inheritSec);
		System.out.println("public : " + announce);
	}
	
}
