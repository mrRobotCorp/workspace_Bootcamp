package javaexp.z01_util;

import java.util.Scanner;

public class A05_Scanner {

	public static void main(String[] args) {
//		가계부 지출금액 표기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액을 입력하세요 : ");
		int rest = Integer.parseInt(sc.nextLine());
		System.out.println("현재 잔액 : " + rest + "원");
		
		System.out.print("지출할 내용 입력 : ");
//		String content = sc.next(); // 입력된 내용으로 뒤 모두 출력
		String content = sc.nextLine();
		System.out.print("지출할 금액 입력 : ");
		int spent = Integer.parseInt(sc.nextLine());
		
		System.out.println("지출 내역 : " + content);
		System.out.println("지출 금액 : " + spent);
		
		rest -= spent;
		System.out.println("현재 잔액 : " + rest);
		
	}

}
