package javaexp.a05_process;

import java.util.Scanner;

public class A12_do_while {

	public static void main(String[] args) {
		/*
		 # do while
		 1. 모든 반복문은 반복조건일 때, 해당 반복 구간이 수행. but, 조건이 아니라도 최소 한 번은 실행되는 반복문이 do while.
		 2. 기본 형식
		 	do {
			 	최소 한 번은 실행되는 반복 구문
		 	} while(반복할 조건);
		 */
		
		int cnt = 1;
		
		do {
			System.out.println("count : " + cnt++);
		} while(cnt<=10);
		
		System.out.println("반복문 종료 cnt : " + cnt);
		
		do {
			// cnt 아래 조건에 맞지 않지만 최소 한 번 수행
			System.out.println("count : " + cnt++);
		} while(cnt<=10);
		
		Scanner sc = new Scanner(System.in);
		String menu = ""; // 주문 메뉴
		String orders = ""; // 메뉴 리스트
		
		do {
			System.out.print("주문을 입력 : ");
			menu = sc.nextLine();
			if(!menu.equals("a")) {
				orders += menu + " ";				
			}
		}while (!menu.equals("a")); // a가 입력되지 않으면 계속 반복
		
		System.out.println("메뉴 리스트 : " + orders);
		
		// ex) 홀/짝을 랜덤으로 설정하고, 수를 입력해서 랜덤의 수랑 일치할 때까지 반복하는 프로그램.
		// 랜덤의 수 홀짝 반복문 전 처리
		Scanner sc3 = new Scanner(System.in);
		
		/*
		 # do 외부 / 내부의 랜덤 데이터 -> 전역 변수 / 지역 변수의 차이
		 1. 전역변수로 선언하여 사용
		 	1) 1번 랜덤으로 수가 정해지고, 반복문으로 정해진 그 수가 홀짝인지 구분할 수 O.
		 2. do 안에 지역변수 사용
		 	1) 계속 랜덤 수가 만들어지고, 반복문에 의해 다른 랜덤 수의 홀짝을 맞추는 프로그램
		 */
		
		// 1-10 범위의 랜덤의 수 설정
		int ran = (int)(Math.random() * 10 + 1);
		// 랜덤의 수를 홀짝으로 구분한 새로운 String 변수에 설정
		String ranO = ran%2==0?"짝":"홀";
		
		do {
			// 숫자를 입력 받고 랜덤의 수와 마찬가지로 삼항연산자로 홀짝 구분
			System.out.print("숫자 입력 : ");
			int inputNum = sc3.nextInt();
			String inputO = inputNum%2==1?"홀":"짝";
			
			// 랜덤의 홀짝과 입력한 수의 홀짝이 동일하면 실행
			if(ranO.equals(inputO)) {
				System.out.println("랜덤의 수 : " + ran);
				System.out.println("일치");
				break; // 일치하면 반복 종료
			} System.out.println("불일치. 다시.");
		} while (true); // 무한루프기 때문에 break 필요
		

	}

}
