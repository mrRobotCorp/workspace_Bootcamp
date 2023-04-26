package javaexp.z01_util;

import java.util.Scanner;

public class A04_Scanner {

	public static void main(String[] args) {
//		1. 자바 내장 기본 입출력 객체
//			System.out -> 출력 처리 (콘솔)
//			System.in -> 입력 처리 (콘솔)
		System.out.println("#입력");
//		2. 내장된 Scanner 객체 이용 입력 처리
//			1) 기본 형식
		Scanner sc = new Scanner(System.in);
		System.out.println("write a name");
		
		String name = sc.nextLine();
		System.out.println("입력된 이름 : " + name ); // console 창에 입력된 내용 다시 출력
		
		String ageStr = sc.nextLine();
		System.out.println("입력된 나이 : " + ageStr); // 처음 입력한 내용은 이름, 두번째 입력 내용 나이로 출력
		
		int age = Integer.parseInt(ageStr);
		System.out.println("숫자형 나이(10년 후) : " + (age + 10)); // 위 나이로 입력한 두 번째 값에 연산되어 바로 출력
		
		System.out.println("구매한 물건의 개수 입력");
//		정수형 데이터를 입력 받을 수 있는 기능 메서드
		int pCnt = sc.nextInt();
		System.out.println("구매한 물건의 개수 (숫자 + 5) : " + (pCnt + 5)); // 콘솔에 숫자 입력 후 바로 연산되어 출력
		
		
	}

}
