package javaexp.a11_api;

import java.util.Random;

public class A08_Random {

	public static void main(String[] args) {
		Random r1 = new Random(); // util import
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		// r1.nextInt(경우의 수) + 시작수
		System.out.println(r1.nextInt(5) + 1);
		System.out.println("주사위 : " + (r1.nextInt(6) + 1));
		System.out.println("0 ~ 100 : " + r1.nextInt(101));
		
		System.out.println("-----------------------------");
		// ex) 위 Random 기능메서드를 이용해서 
		// 1. 임의로 합격 /불합격 출력하게 하고
		// 2. 주사위 2개의 합계
		// 3. 학생의 점수 국어/영어/수학 과목 임의로 처리하여 평균 출력

		Random r2 = new Random();
		Random r3 = new Random();
		Random r4 = new Random();
		
		
		System.out.print("합격 여부 : ");
		if(r2.nextBoolean() == true) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");			
		}
		
		int dice01 = r2.nextInt(6) + 1;
		int dice02 = r3.nextInt(6) + 1;
		System.out.println("주사위 1번 :" + dice01);
		System.out.println("주사위 2번 :" + dice02);
		System.out.println("주사위 2개의 합 : " + (dice01 + dice02));
		
		int kor = r2.nextInt(100);
		int eng = r3.nextInt(100);
		int math = r4.nextInt(100);
		int aver = (kor + eng + math) / 3;
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("과목 평균 : " + aver);
		
	}

}
