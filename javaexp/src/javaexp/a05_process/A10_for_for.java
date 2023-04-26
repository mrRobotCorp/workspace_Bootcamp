package javaexp.a05_process;

public class A10_for_for {

	public static void main(String[] args) {
		/*
		 # for문 안에 for문 활용하기
		 1. 반복문의 각 단위별로 반복문을 수행하여 여러가지 복잡한 알고리즘을 만들 수 o.
		 2. 기본형식
		 	for(int cnt = 1; cnt <=10; cnt++) {
		 		for (int i=2; i<=10; i++) {
		 		}
		 	} // 상위 for문의 cnt변수가 1-10 범위를 반복, 각 단위별로 다시 1-10까지 반복처리하는 것을 말한다.
		 */
		for (int grade = 2; grade <=9; grade++) {
			System.out.println(grade + "단");
			for(int cnt =1; cnt<=9; cnt++) {
				System.out.print(grade);
				System.out.print(" X ");
				System.out.print(cnt);
				System.out.println(" = " + (grade*cnt));
			}
		}
		
//		ex) 행열 표현 테이블을 아래와 같이 처리 실행
		// (1행1열) (1행2열) (1행3열)
		// (2행1열) (2행2열) (2행3열)
		// (3행1열) (3행2열) (3행3열)
		for(int cnt = 1; cnt<=3; cnt++) {
			System.out.println();
			for(int i = 1; i<= 3; i++) {
				System.out.print( "(" + cnt + "행 " + i +"열) ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
