package javaexp.a01_begin;

public class A11_TypeChange {

	public static void main(String[] args) {
		/*
		 * # 형변환
		 * 1. 데이터 타입을 다른 타입으로 변환
		 * 	1) 기본 데이터 타입끼리 - 작은 데이터에서 큰 데이터로, 실수에서 정수로
		 * 	2) 객체형끼리 - 문자열 데이터와 숫자 변경 ex) "301"과 301은 문자열과 숫자로 다름.
		 * 				 모든 데이터는 기본적으로 문자열 형태로만 전송하고 전달.
		 * 				내장된 객체에서 지원하는 기능 메서드를 통해서 전환이 가능함.
		 * 				-문자열을 정수형으로 변환 
		 * 					내장된 Inte 객체의 pareInt()를 메서드를 통해서 숫자로된 문자형("24.5" 등) 숫자형으로 변환해줌.
		 * 					Integer.pareInt("") -> ex) int num01 = Integer.parseInt("25");
		 * 				-문자열을 실수형으로 변환
		 * 					내장된 Double 객체의 parseDouble() 메서드를 통해 실수로된 문자형을 숫자로 변환.
		 * 					ex) double num01 = Double.parseDouble("25");
		 * 		상속 관계에서 형변환 (객체 이후 진행)
			2. 종류
				1) 자동형(묵시적) 형변환 - 작은 유형이 큰 유형으로 할당될 떄 (promotion)
				2) 강제형(명시적) 형변환 - 큰 유형이 작은 유형으로 할당될 때 (casting)
	 	*/
		System.out.println("2+3=" + 2+3); 
		int numex01 = 20;
		int numex02 = 30;
		String str = "" + numex01 + numex02;
		System.out.println(str); // 2030 출력
//		최대한 간단한 문자열 "" 을 선언하고 숫자를 뒤이어 붙이면 변환됨.
		
//		숫자 -> 문자 방법1
		int num20  = 25;
		System.out.println("" + num20 + 30); // 2530 출력
//		숫자 -> 문자 방법2		
		Integer i = num20;
		System.out.println(new String(i.toString() + 30)); // 2530 출력
		
		
		byte num01 = 30;
		int num02 = 230;
		// 주의 - 데이터는 할당값인 오른쪽에서 왼쪽으로 할당됨.
		num02 = num01; // 자동형(묵시적 형변환)
//		num01 = num02; 작은 단위 속에 큰 단위를 넣어서 에러 생성 - 자동형변환 불가
		
//		큰 단위가 bit단위로 어거지로 casting되기 때문에 연산결과가 정확화지 X. 예측 불가능.
//		01010100 8bit -> 0101 4bit 처럼 뒤 0100이 잘려지는 과정임.
		num01 = (byte)num02; // casting 작업으로 강제형(명시적) 형변환. 큰 단위의 값 앞에 (작은단위)를 작성하여 변환.
		
//	 	주의 - 해당 범위 안에 있으면 정상적으로 할당하지만, 해당 범위를 초과하는데 casting하는 경우,
//				정수의 경우에는 bit단위로 잘려져, 원치 않는 결과 도출
//		주의 - 캐스팅은 반드시 큰 데이터가 작은 데이터로 할당하는 것만 아닌, 작은 데이터가 큰 데이터로 강제변환해서 
//				연산을 해야하는 경우에도 사용됨. ex) 10/3 -> 10/(double)3 -> 3.3333
		System.out.println(num01);
		
		/* 
		 * 
		 * */
//		1) 정수 -> 실수 (promotion)
//		2) 실수 -> 정수 (casting하여 소수점 아래 내림)
		int num03 = 30; // promotion
		double num04 = num03;
		System.out.println(num04);
		
		double num05 = 3.64;
		int num06 = (int)num05;
		System.out.println(num06); // casting
		
//		*자바에서만 주의*
//		1. 소수점 이하를 처리하지 않음. -> 실수로 처리하기 위해서는 데이터 중 하나는 실수형으로 형변환해야 함.(casting) 
//		 	casting은 무조건 큰 데이터를 작은 데이터로의 할당이 아닌, 데이터 유형 크기/종류에 상관없이 강제 형변환 시 사용.
		
		int num07 = 10;
		int num08 = 3;
		
		System.out.println(num07/num08); // 3 출력 (정수)
		System.out.println(num07/(double)num08); // 3.333333...  출력 (실수)
		
//		ex) 25와 7을 정수로 선언, 소수점 이하가 나오지 않는 경우와 나오는 경우를 처리하여 출력.
		int ex01 = 25;
		int ex02 = 7;
		
		System.out.println(ex01 / ex02);
		System.out.println((double)ex01 / ex02);
		
	}

}
