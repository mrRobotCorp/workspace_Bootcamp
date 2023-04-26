package javaexp.a10_exception;

import java.util.Scanner;

public class A05_RunTimeError {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아 숫자형이 아닐 때는 숫자를 입력하새요 예외 처리.
		// 정상적 입력 시 nn + nn = nn 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("프로그램 시작");
		
		try {
			System.out.print("첫 번째 숫자 입력 : ");
			int num01 = Integer.parseInt(sc.nextLine());
			System.out.print("두 번째 숫자 입력 : ");
			int num02 = Integer.parseInt(sc.nextLine());
			System.out.println("두 수의 합산 결과 : " + (num01 + num02));
			
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}
		System.out.println("프로그램 종료");
		
	}

}
