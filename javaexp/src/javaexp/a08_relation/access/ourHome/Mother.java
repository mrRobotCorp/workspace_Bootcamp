package javaexp.a08_relation.access.ourHome;

public class Mother {
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근 : " + m.tripPlan);
//		System.out.println("private 접근 : " + m.secret);
	}
	
	void callFatherInfo1() {
		Father f1 = new Father();
//		System.out.println("private age" + f1.age);
		System.out.println("default lunch" + f1.lunch);
		System.out.println("protected job" + f1.job);
		System.out.println("public height" + f1.height);
	}
	
	void callFatherInfo2() {
//		System.out.println("private age" + age);
//		System.out.println("default lunch" + lunch);
//		System.out.println("protected job" + job);
//		System.out.println("public height" + height);
	}
}
