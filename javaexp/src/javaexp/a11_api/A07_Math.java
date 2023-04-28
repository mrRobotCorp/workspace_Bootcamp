package javaexp.a11_api;

public class A07_Math {

	public static void main(String[] args) {
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.abs(-5) : " + Math.abs(-5));
		System.out.println("Math.abs(5) : " + Math.abs(5));
		System.out.println("올림(실수) Math.ceil(5.2) : " + Math.ceil(5.2));
		System.out.println("내림(실수) Math.floor(5.9) : " + Math.floor(5.9));
		System.out.println("Math.max(3,4) : " + Math.max(3,4));
		System.out.println("Math.min(2,7) : " + Math.min(2,7));
		System.out.println("반올림(정수) Math.round(4.5) : " + Math.round(4.5));
		System.out.println("반올림(정수) Math.round(4.4) : " + Math.round(4.4));
		
		// ex) 1-10까지 두 개의 수를 임의로 발생시켜 큰 수, 작은 수 출력 Math.method() 사용
//		int ran1 = (int)(Math.random() * 10 + 1);
//		int ran2 = (int)(Math.random() * 10 + 1);
		double ran1 = Math.random() * 10 + 1;
		double ran2 = Math.random() * 10 + 1;
		double max = Math.max(ran1, ran2);
		double min = Math.max(ran1, ran2);
		System.out.println("임의의 숫자1 : " + ran1);
		System.out.println("임의의 숫자2 : " + ran2);
		System.out.println("큰 수 : " + Math.round(max));
		System.out.println("작은 수 : " + Math.round(min)); // 반올림하면 수가 같아지는 경우가 있음
		
		

	}

}