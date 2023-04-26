package javaexp.a05_process;

import java.util.Scanner;

public class A07_forUsing {

	public static void main(String[] args) {
		/*
		 # for의 활용
		 1. 여러가지 출력형식 처리
		 2. for문과 전역변수 사용
		 3. for문에서 조건문 사용
		 4. for문 안에서 for문(이중 for문) 사용
		 
		 */
		 for(int cnt = 1; cnt <=10; cnt++) {
			 System.out.print(cnt + "\t");
		 }
		 
		 System.out.println(); // 공백. 줄바꿈 용도
		 
		 // 1 + 2 + 3 ... 반복문
		 for(int cnt = 1; cnt <=10; cnt++) {
			 System.out.print(cnt + " + ");
		 }
		 
		 System.out.println();
		 
		 // ex) 1. 카운트다운 10, 9 ,8 ... 0까지 출력. 마지막 완료
		 for(int cnt = 10; cnt >=0; cnt--) {
			 System.out.print(cnt + ", ");
		 }
		 System.out.println("완료\n");
		 
		 
		 // 	2. 100부터 120까지 합산 처리 100+101+102 ... 합산처리 완료 출력
		 int start = 100; // 변수의 밤위에 따라 for문 처리
		 int end = 120;
		 
		 for(int cnt = start; cnt <=end; cnt++) {
			 System.out.print(cnt+ " + ");
		 }
		 System.out.println();
		 System.out.println();
		 
		 // 	3. 학생 번호와 점수(랜덤점수0~100) - 번호	점수 /줄바꿈/ 1	78 / 2	59 ...
		 int pointRan = (int)(Math.random() * 101);
		 System.out.println("번호\t점수");
		 
		 for(int cnt = 1; cnt <=3; cnt++) {
			 System.out.println(cnt + "\t" + pointRan);
		 }
		 System.out.println();
		 
		 //		4. 랜덤의 구구단 출력. 단수 : nn단 (2-9단) / nn X 1 = nn / nn X 2 = nn ...
		 int mix = (int)(Math.random() * 8 + 2);
		 for(int cnt = 1; cnt <=9; cnt++) {
			 System.out.println(mix +" X " + cnt + " = " + (mix*cnt));
		 }
		 System.out.println();
		 
		 // 과일의 단가를 입력하고 해당 과일의 1-10까지 갯수 구매
		 // 총계를 이 형식으로 출력 -> 단가 : @@ / 갯수 	총계 / n개 @@원
		 Scanner sc = new Scanner(System.in);
		 System.out.print("과일의 단가 : ");
		 int price = sc.nextInt();
		 
		 System.out.println("단가:\t" + price);
		 System.out.println("갯수\t총계");

		 for(int cnt = 1; cnt <=10; cnt++) {
			 System.out.println(cnt + "개\t" + (price*cnt));
		 }

	}

}
