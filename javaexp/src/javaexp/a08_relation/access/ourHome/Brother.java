package javaexp.a08_relation.access.ourHome;

public class Brother {
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근 : " + m.tripPlan);
//		System.out.println("private 접근 : " + m.secret);
	}
	
	
}
