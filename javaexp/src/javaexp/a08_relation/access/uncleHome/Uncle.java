package javaexp.a08_relation.access.uncleHome;

import javaexp.a08_relation.access.ourHome.Father;
import javaexp.a08_relation.access.ourHome.Mine;

public class Uncle {
	void callMineInfo() {
		Mine m = new Mine();
//		System.out.println("default 접근 : " + m.tripPlan);
//		System.out.println("private 접근 : " + m.secret);
	}
	
	void callFatherInfo1() {
		Father f1 = new Father();
//		System.out.println("private age" + f1.age);
//		System.out.println("default lunch" + f1.lunch);
//		System.out.println("protected job" + f1.job);
		// 객체 생성한거로 public은 가져옴..~
		System.out.println("public height" + f1.height);
	}
		
	void callFatherInfo2() {
		// 상속도 안 함, 다른 패키지임, 객체도 생성 안함. 될 수 있는게 있을리가.
//		System.out.println("private age" + age);
//		System.out.println("default lunch" + lunch);
//		System.out.println("protected job" + job);
//		System.out.println("public height" + height);
	}
}
