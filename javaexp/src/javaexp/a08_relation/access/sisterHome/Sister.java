package javaexp.a08_relation.access.sisterHome;

import javaexp.a08_relation.access.ourHome.Father;

public class Sister extends Father {
	void callFatherInfo1() {
		Father f1 = new Father();
//		System.out.println("private age" + f1.age);
//		System.out.println("default lunch" + f1.lunch);
		// protected 라도 객체를 생성하면 상속 조건에 벗어나 에러 발생
//		System.out.println("protected job" + f1.job);
		System.out.println("public height" + f1.height);
	}
	
	void callFatherInfo2() {
		// 상속이라도 패키지가 다르면 private, default는 무리.
//		System.out.println("private age" + age);
//		System.out.println("default lunch" + lunch);
		System.out.println("protected job" + job);
		System.out.println("public height" + height);
	}
	
	
}
