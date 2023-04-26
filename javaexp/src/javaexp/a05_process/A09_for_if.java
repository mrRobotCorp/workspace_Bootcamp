package javaexp.a05_process;

public class A09_for_if {

	public static void main(String[] args) {
		/*
		 # for 문에서 if문 활용
		 1. 반복처리시, 여러가지 화면 처리나 로직에 의해서 조건문을 활용할 수 있다.
		 2. 대부분의 조건 처리를 통해 원하는 결과를 알고리즘에 의해 처리되는 경우 많음.
		 3. for문에서 if문 처리 유형
		 	1) 화면 처리 형식 변경 - 출력 형식의 내용을 변경 처리하는 경우를 말함.
		 */
		// 출력형식 변경 1~100까지 출력하되, 5단위로 줄바꿈 처리
		// for문(1~100), if(cnt%5==0) 5로 나누었을 때 나머지 0 활용
		for(int cnt =1; cnt<=100; cnt++) {
			System.out.println(cnt + "\t");
			// 5단위로 줄바꿈 출력
			if(cnt%5 == 0) {
				System.out.println("\n");
			}
		}
		
//		 2. 연산처리 결과 형식 / 1+2+3+4+5 ... 10 =55
//		기본적인 데이터는 +로 출력 마지막 데이터는 =으로 처리
		int tot = 0;
		
		for(int cnt=1; cnt<=10; cnt++) {
			tot += cnt;
			// 10이 됐을 때 뒤에 =, 총합 tot 출력
			if(cnt == 10) {
				System.out.print(cnt + " = " + tot);
			} else {
				System.out.print(cnt + " + ");				
			}
		}
		System.out.println();
		
//		ex) 1-20까지 출력하되, 3의 배수에는 숫자 대신 짝 출력
		
		for(int i=1; i <=20; i++) {
			if(i % 3 == 0) {
				System.out.println("짝☆");
			} else {
				System.out.println(i);				
			}
		}
		
//		ex) 1-100까지 출력하되, 홀수의 합산과 짝수의 합산을 따로 출력
		
		int odd = 0;
		int dou = 0;
		
		for(int cnt = 1; cnt<=100; cnt++) {
			System.out.println(cnt);
			if(cnt % 2 == 1) {
				odd += cnt;
			} else {
				dou += cnt;
			}
		}
		System.out.println("홀수의 합 : " + odd + ", 짝수의 합 : " + dou);
		
		
	
		
		
		
	}

}
