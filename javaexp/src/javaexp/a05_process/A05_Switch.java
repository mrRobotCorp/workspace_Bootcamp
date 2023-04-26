package javaexp.a05_process;

import java.util.Scanner;

public class A05_Switch {

	public static void main(String[] args) {
		/*
		 # Switch 비교조건이 아닌 특정 데이터 기준으로 조건문을 처리
		 1. 특정 경우에 해당 실행문을 처리
		 2. switch 단어와 같이 어떤 room에서 switch 버튼을 1, 2, 3번에 따라 점등하는 위치가 달라지듯이
		 	특정 데이터를 기준으로 처리됨.
	 	3. 기본형식
	 		switch(변수) {
	 			case 경우1:
	 				처리할 내용
	 				break;
 				case 경우2:
 					처리할 내용
 					(break가 없을 경우 switch문을 벗어나지 않고 다른 조건인 바로 밑 case3내용을 수행처리함.)
				case 경우3:
					처리할 내용
					break;
				default;
					상단 경우1,2,3이 아닌 그외 경우 처리 내용
					
		 */
		
		int switchBtn = (int)(Math.random() * 5);
		// 0, 1, 2, 3, 4 번호
		System.out.println("클릭한 버튼 번호 : " + switchBtn);
		switch(switchBtn) {
			case 1:
				System.out.println("A 구역 선택");
				break;
			case 2:
				System.out.println("B 구역 선택");
				break; // break가 없으면 만날 때까지 아래로 실행 순서가 계속해서 내려감
			case 3:
				System.out.println("C 구역 선택");
				break;
			default: // case에서 나열된 데이터가 아닐 때
				System.out.println("해당 버튼은 사용하지 X");
		}
		
//		ex) Scanner를 통해서 번호를 입력 받기. 3은 정답. 1,2,4는 오답. 그 외 숫자는 1~4까지만 가능. 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~4중 번호 하나를 입력 : ");
		int inputNum = sc.nextInt();
		
		switch(inputNum) {
			case 1:
			case 2:
			case 4:
				System.out.println("오답");
				break;
			case 3:
				System.out.println("정답");
				break;
			default:
				 System.out.println("해당되지 않는 범위의 숫자");
		}
		
//		ex) 월을 입력받아 해당 월의 마지막 일자를 출력. 31일-1,3,5,7,8,10,12 / 30일-4,6,9,11 / 28일 - 2 (월은 1-12까지)
		System.out.print("월 을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("마지막 일자는 31일");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("마지막 일자는 30일");
				break;
			case 2:
				System.out.println("마지막 일자는 28일");
				break;
			default:
				System.out.println("12개월 안에 해당하는 숫자를 입력하세요.");
		}

	}

}
