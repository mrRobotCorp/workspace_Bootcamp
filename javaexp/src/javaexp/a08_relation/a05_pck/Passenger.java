package javaexp.a08_relation.a05_pck;

import javaexp.a08_relation.a06_pck.Bus;

public class Passenger {
	
//	ex) a05_pck  하위 passenger class { Bus b1; Car c1; X  —- 선언 } 
//	void call() { b1 = new Bus(); b1 = new Bus(7788); X b1 = new Bus(”서울행”,99);
//	sysout(b1.no); sysout(b1.target); X
//	a06_pck 하위 
//	Bus { public int no; String target; }, Car
	
	
	Bus b1;
//	Car c1; // 다른 패키지에 있으면서 public이 아니기 때문에 접근 불가
	
	void call() {
		b1 = new Bus();
//		b1 = new Bus(7788); // public이 아니기 때문
		b1 = new Bus("to seoul", 7788);

		System.out.println(b1.no);
//		System.out.println(b1.target); // 마찬가지.. public 아님..
		
		
	}
}
