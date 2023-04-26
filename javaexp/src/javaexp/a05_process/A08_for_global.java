package javaexp.a05_process;

import java.util.Scanner;

public class A08_for_global {

	public static void main(String[] args) {
		/*
		 # for문에서 전역 변수 활용
		 1. 전역변수와 지역변수
		 	- 대상 구문
		 		class
		 		메서드
		 		조건문
		 		반복문
		 	- 중괄호로 구분된 계층적 구문의 데이터를 활용하는 경우에 사용됨.
		 		상대적 개념으로 상위 중괄호 블럭 안에서 선언되어 하위 중괄호 안에 영향을 주는 것이 전역변수.
		 		하위 중괄호 안에 선언되어 해당 중괄호 범위에서만 사용할 수 있는 것이 지역변수.
	 		- 전역변수는 선언한 하위 중괄호에 모두 영향을 미침.
	 		- 지역변수는 선언한 해당 중괄호 안에서만 사용. - 포함하고 있는 상위 블럭이나, 다른 블록에서 사
		 2. for문에서 전역변수를 사용하는 경우
		 	1) for문 안에서 반복적으로 활용
		 		- for문 들어가기 전 상단에 선언되어 for문에 데이터로 호추랗거나 재할당할 수 있음.
		 	2) for문에서 증감대입연산자와 함께 활용
		 		ex) 물건 구매 내역을 누적하여 총합 처리
		 		ex) 1-10 반복 카운트를 출력, 누적된 데이터의 총합을 출력.
		 	
		 */
		// 1-100까지 누적합계 처리
		int tot = 0; // 누적처리 할 변수 초기값 선언
		for(int cnt=0; cnt<=100; cnt++) {
			tot += cnt;
			System.out.println(cnt + " + ");
		}
		System.out.println("\n1~100까지의 총합 : " + tot);
		
		int totPay = 0;
		int price = 100;
		for(int cnt=1; cnt<=10; cnt++) {
			System.out.println(cnt + " 개 " + price*cnt);
			totPay += price*cnt;
		}
		// 1-10개까지 구매한 총계 누적 합산
		System.out.println("전체 총계 : " + totPay);

		int totPt = 0;
		Scanner sc = new Scanner(System.in);

		for(int cnt=1; cnt<=3; cnt++) {
			System.out.print(cnt + "번째 학생의 점수 입력 : ");
			totPt += sc.nextInt();
		}
		
		System.out.println("총점" + totPt);
		System.out.println("평균" + (totPt/3.0));
		
		// 구매한 과일 5개의 각각 가격을 입력. 가격들의 총비용 출력
		int totF = 0;
		for(int cnt = 1; cnt<=5; cnt++) {
			System.out.print("과일의 가격 : ");
			totF += sc.nextInt();
		}
		System.out.println("과일의 총 비용은 " + totF);	
		
	}

}
