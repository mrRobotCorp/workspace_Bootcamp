package javaexp.z01_home;

import java.util.Scanner;

public class A04_0404 {

	public static void main(String[] args) {
		// 1. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
		// 기본 형식 - for(초기값; 반복 범위; 증감연산자) { 실행구문 }
			for(int i=1; i<=10; i++) {
				System.out.println("count : " + i);
			} // 1~10까지 범위의 숫자가 카운트 되어 차례로 출력
		
		// 2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
		// 1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
			
			for(int i = 200; i<=300; i+=10) {
				System.out.println("2-1:" + i);
			}
			
			System.out.println("-------------------------");
			
			for(int i = 1000; i >= 950; i-=3) {
				System.out.println("2-2:" + i);
			}
			
			System.out.println("-------------------------");
			
			for(int i = 100; i > 0; i--) {
				System.out.println("2-3:" + (i / 2));
			}
			
			System.out.println("-------------------------");
			
		// 3. for문의 지역변수와 전연변수의 개념을 예제를 통해서 설명하세요
			int tot = 0; // 아래 실행 구문 모두에 영향을 주는 전역 변수 tot
			for(int cnt=0; cnt<=5; cnt++) { // for문 안에서만 영향을 주는 지역 변수 cnt
				tot += cnt;
				System.out.println(cnt + " + ");
			}
			System.out.println("1~5까지의 총합 : " + tot);
			
		// 4. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요
			int tot2 = 0; // 누적처리 할 변수 초기값 선언
			for(int cnt=0; cnt<=5; cnt++) {
				tot2 += cnt;
			}
			System.out.println("\n1~5까지의 총합 : " + tot2);
			
		// 5. 입력할 과일 3개의 과일명과 과일 가격을 입력 받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//			no 과일명  가격
//			1 사과    3000
//			2 바나나   4000
//			3 딸기    12000
//			총계    19000
			Scanner sc = new Scanner(System.in);
			String fruit = "";
			String show = "";
			int fPrice = 0;
			int fTotal = 0;
			
			for(int cnt = 1; cnt <= 3; cnt++) {
				System.out.print(cnt + " 과일 입력 : ");
				fruit = sc.nextLine();
				System.out.print("가격 입력 : ");
				// nextLine() 이후 nextInt() 사용 시 에러 발생 - 문자열 이후 숫자 데이터도 문자로 인식시키기 때문(casting parseInt 사용)
				fPrice = Integer.parseInt(sc.nextLine()); 
				fTotal += fPrice;
				show += cnt + "\t" +fruit + "\t" + fPrice + "\n";
			}
			
			show += "총계\t\t" + fTotal;
			System.out.println("no\t과일명\t단가");
			System.out.println(show);
			
		// 6. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//			# 출력 형식
//			날짜  갯수 누적
//			1일차 2개  2개
//			2일차 4개  6개
//			3일차 6개 12개
			
			int bTotal = 0;
			
			for(int i = 1; i <=10; i++) {
				int bread = i*2;
				bTotal += bread;
				System.out.println(i + "일차\t" + bread + "개\t" + bTotal + "개");
			}
			
		// 7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
				int fourth = 0;
				for(int i = 1; i <= 100; i++) {
					if(i%4==0) {
						System.out.println("#");
						fourth += i;
						continue;
					}
					System.out.println(i);
				}
				System.out.println("4의 배수의 총합 : " + fourth);
			
				
			System.out.println("-------------------------");
		// 8. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
			for(int i = 1; i < 10; i++) {
				if (i % 3 == 0 ) {
					System.out.println("짝");
				} 
				System.out.println(i);
			}
			
			for(int i = 10; i <= 20; i++) {
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9  ) {
					System.out.println("짝");
				} 
				System.out.println(i);
			}
		
		// 9. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
			for(int i = 1; i <= 10; i++) {
				for( int j = 1; j <= 10; j++) {
					
				}
			}
			
		// 10. 아래 내용을 2중 for문을 활용하여
//			1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
			for(int i=0; i<=1; i++) {
				System.out.println();
				for(int j=0; j<=1; j++) {
					System.out.print("♥");
				}
			}
			
			System.out.println();
			
			for(int i=0; i<=1; i++) {
				System.out.println();
				for(int j=0; j<=2; j++) {
					System.out.print("♥");
				}
			}
			
			System.out.println();
			
			System.out.print("표시 기호 입력 : ");
			String symbol = sc.nextLine();
			System.out.print("행의 수 입력 : ");
			int row = sc.nextInt() - 1;
			System.out.print("열의 수 입력 : ");
			int col = sc.nextInt() - 1;
			
			for(int i=0; i<=row; i++) {
				System.out.println();
				for(int j=0; j<=col; j++) {
					System.out.print(symbol);
				}
			}
			
			
		System.out.println();
			
		// 11. while문의 기본 형식을 예제를 통해 설명하세요.
			String fList = "";
			while(true) {
				System.out.print("구매 물건 : ");
				String thing = sc.nextLine();
				System.out.println("입력한 내용 : " + thing);
				if(thing.equals("a")) {
					break;
				}
				if(!thing.equals("a")) {
					fList += thing + " ";
				}
			}
			System.out.println("물건 리스트" + fList);
			System.out.println("종료");
		
		System.out.println("-------------------------");
		// 12. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
			int cnt = 100;
			int cntTotal = 0;
			while(true) {
				System.out.println(cnt);
				cnt--;
				cntTotal += cnt;
				if (cnt < 90) {
					break;
				}
			}
			System.out.println("합산 결과 : " + cntTotal);
			
		System.out.println("-------------------------");
		// 13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
			int pTotal = 1;
			int stu = -1;
			
			while(true) {
				System.out.print("점수를 입력 : ");
				int point = sc.nextInt();
				pTotal += point;
				stu++;
				if(point == -1) {
					break;
				}
			}
			System.out.println("총점은 : " + pTotal + ", 평균은 " + (pTotal/stu));
			
			
			
		// 14. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
			for(int num = 1; num <=5; num++) {
				if(num == 4 ) { // 곱해지는 값이 8일 때 반복문 중단 - 9부터 실행되지 X
					break;
				}
				if (num == 2 ) { // 곱해지는 cnt가 5일 때 수행하지 않고 6부터 다시 실행
					continue;
				}
				// 열 단위가 먼저 수행됨
				for(int grade=2; grade<=9; grade++) {
					System.out.print(grade);
					System.out.print(" X ");
					System.out.print(num);
					System.out.print(" = ");
					System.out.print(grade*num + "\t");
				}
				System.out.println();
			}
		
	}

}