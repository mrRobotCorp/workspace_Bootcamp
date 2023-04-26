package javaexp.a05_process;

import java.util.Scanner;

public class A11_while {

	public static void main(String[] args) {
		/*
		 # While문 : 조건에 따라 반복을 계속할지 결정하는 경우 활용되는 반복문
		 1. 기본 형식
		 	while(반복할 조건) {
		 		반복 할 조건이 true일 때 처리 할 내용
		 	}
		 	무한 반복 안에서 break
		 	while(true {
		 		처리할 내용
		 		if(반복에서을 벗어 날 조건) {
		 			break;
		 		}
		 	}
	 	2. 처리 예시
	 		1) 메뉴가 입력받아서 Q를 누를 때까지 처리
	 		2) 구매한 과일의 가격을 입력 받아, -1이 입력될 때까지 처리
		 */
		Scanner sc = new Scanner(System.in);
		String fList = "";
		
		while(true) {
			System.out.print("구매 할 과일명 : ");
			String fruit = sc.nextLine();
			System.out.println("입력한 내용 : " + fruit);
			if(fruit.equals("Q")) {
				break;
			}
			if(!fruit.equals("Q")) {
				fList += fruit + " ";
			}
		}
		System.out.println("과일 리스트" + fList);
		System.out.println("종료");
		
		
		int cnt = 1;
		while(cnt<=10) {
			System.out.println((cnt++) + "번째 반복");
		}
		
		// ex1) 10~20까지 while문을 통해 출력
		int num01 = 10;
		while(num01 < 21) {
			System.out.println(num01);
			num01++;
		}
		
		// ex2) 구매 할 물건의 가격 입력, 종료 시 -1, 총 비용 출력
		Scanner sc2 = new Scanner(System.in);
		int total = 0;

		while(true) { // 일단 계속해서 반복 입력 받기
			System.out.print("물건의 가격 : ");
			int price = sc2.nextInt(); // 입력 받은 가격
			
			if(price == -1) { // -1이 입력되면 반복 끝. if문 안에 break 설정
				System.out.println("구매 끝");
				break;
			} else { // -1을 누른 경우가 아니면 총 비용에 입력된 값을 누적
				total += price;				
			}
		}
		
		System.out.println("총 비용 : " + total);
		
	}

}
