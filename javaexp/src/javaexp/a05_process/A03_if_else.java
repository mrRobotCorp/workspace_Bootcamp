package javaexp.a05_process;

import java.util.Scanner;

public class A03_if_else {

	public static void main(String[] args) {
		/*
		 #if else 구문
		 1. 특정 조건이 true / false에 분기하여 처하는 경우
		 2. 기본 형식
		 	if(조건문) {
		 		조건문이 true일 때, 처리할 구문
	 		} else {
		 		조건문이 false 일 때, 처리할 구문
	 		}
	 		ex) if(iNum==3) {
	 				System.out.println("정답");
 				} else {
	 				System.out.println("오답");
 				}
		 */
		Scanner sc = new Scanner(System.in);

//		System.out.print("3 + 4 = ? 정답을 입력 :");
//		int input = sc.nextInt();
//		
//		if(input == 7) { // 입력한 값이 7일 경우 정답 출력
//			System.out.println("정답");
//		} else { // 7이 아닌 모든 경우 오답 출력
//			System.out.println("오답");
//		}
//		--------------------------------------------------------
//		int ranNum1 = (int)(Math.random() * 9 + 1);
//		int ranNum2 = (int)(Math.random() * 9 + 1);
//		int corNum = ranNum1 + ranNum2;
//		System.out.print(ranNum1 + " + " + ranNum2 + " = " );
//		int inputA = sc.nextInt();		
//		
//		if(inputA == corNum) {
//			System.out.println("정답");
//		} else { 
//			System.out.println("오답");
//		}
		
//		ex) 랜덤의 구구단 문제를 내고 입력할 수 있도록 처리. 정답/오답 결과까지 출력. grade(2~9) cnt(1~9)
		int grade = (int)(Math.random() * 8 + 2);
		int cnt = (int)(Math.random() * 9 + 1);
		
		System.out.print(grade + " X " + cnt + " = ");
		int inputEx = sc.nextInt();
		
		int result = grade * cnt;
		
		if (inputEx == result) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
		

		

	}

}
