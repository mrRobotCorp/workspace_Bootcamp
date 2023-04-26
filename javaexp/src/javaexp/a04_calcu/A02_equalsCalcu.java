package javaexp.a04_calcu;

import java.util.Scanner;

public class A02_equalsCalcu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("획득한 점수를 입력 : ");
//		int point = Integer.parseInt(sc.nextLine());
//		boolean isPass = point >= 60;
//		System.out.println("합격여부 : " + isPass); // 점수 입력 후 합격 여부까지 모두 출력
		
		System.out.print("등록할 회원 아이디 입력 : ");
		String inputId = sc.nextLine();
//		==의 비교연산자는 동일한 문자열을 입력해도 자바에서는 false. 문자열 비교는 equals 메소드를 사용해야 함.
		boolean hasMember = inputId.equals("hi");
		System.out.println("등록된 회원 여부 : " + hasMember); // hi 입력 시 true, 이 외는 false 출력
		
		int chNum = 3;
		boolean isCorrect = chNum == 2; 
		System.out.println("정답 여부 : " + isCorrect); // false 출력
		
		String idInput = null;
//		문자열 데이터의 입력 여부에 따른 boolean 처리
		System.out.println("입력 여부 : " + (idInput != null)); // false 출력
		
		
	
	}

}
