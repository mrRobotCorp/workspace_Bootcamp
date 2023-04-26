package javaexp.z01_util;

public class A06_Random {

	public static void main(String[] args) {
		/*
		 # 임의의 수를 처리해주는 math객체의 random()메서드
		 1. 여러가지 임의의 수를 가져와 활용할 수 있는 내장 기능 함수 (메서드)
		 2. 기본 형식
		 	1) 기본 범위 0.0 <= Math,random() < 1.0
		 	2) 임의의 정수 범위 처리. 0~10 정수 -> Math,random() * 10, (int)(Math,random() * 10 + 1)
		 3. 공식 정리
		 	(int)(Math,random() * 경우의 수 + 시작 수)
		 	ex01) 주사위 던지는 수 처리 방법 - (int)(Math.random() * 6 + 1);
		 	ex02) 0/1 두 가지 경우가 나오는 처리 방법 - (int)(Math.random() * 2 + 0); // 시작 수 0은 생략 가능
		  
		 * */
		double num01 = Math.random();
		
		System.out.print("random 기본 값 출력 - ");
		System.out.println(num01);
		
		System.out.print("random 0-9 값 출력 - ");
		System.out.println(num01*10);
		
		System.out.print("random 정수 값 출력 - ");
		System.out.println( (int)(num01*10 + 1) );
		
//		ex) -----------------------------------------------------------------------
		System.out.println("주사위 랜덤 수 - " + (int)(Math.random() * 6 + 1)); // ex01 1~6까지의 랜덤 수 출력
		
		int gameDiv = (int)(Math.random() * 2);
		System.out.println("0과 1 랜덤 수 - " + gameDiv); // ex02 1 or 0 둘 중 랜덤 출력
		
		String gDiv = gameDiv==0?"짝":"홀";
		System.out.println("랜덤 짝 / 홀 - " + gDiv);
		
//		ex03) 0-100까지 임의의 수를 point에 할당하여 출력. 
//		ex04) 구슬 8개를 임의로 쥘 떄, 나오는 수 출력.
//		ex05) 위 구슬 숫자를 홀짝 구분하여 출력.
		
		int point = (int)(Math.random() * 101 ); // 0부터 포함이기 때문에 101가지의 경우의 수
		System.out.println("임의 포인트 - " + point);
		
		int circle = (int)(Math.random() * 8 + 1);
		System.out.println("구슬의 숫자는 " + circle);
		
		String odd = circle % 2 ==1?"홀":"짝";
		System.out.println("구슬의 숫자는 " + odd + "수이다.");

	}

}
