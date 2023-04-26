package javaexp.a08_relation.a06_pck;

class Car {
	Bus b1 = new Bus();
	
	void call() {
		// 같은 패키지이므로 public이 아닌 메서드, 변수까지 모두 접근 가능
		b1 = new Bus();
		b1 = new Bus(5525);
		b1 = new Bus("to Busan", 5525);
		
		System.out.println(b1.no);
		System.out.println(b1.target);
//		System.out.println(b1.driver); // private 선언. 같은 패키지여도 직접적인 접근 불가능 -> 간접적 접근 가능
		
		b1 = new Bus("Incheon", 999, "town");
		b1.callInfo(); // 결과 모두 출력
	}
}
