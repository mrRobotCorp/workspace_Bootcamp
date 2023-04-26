package javaexp.a05_process;

public class A04_if_elseif {

	public static void main(String[] args) {
		/*
		 # if else if 문
		 1. 여러가지 분기조건을 처리할 때, 사용되는 구문
		 2. 기본 형식
		 	if(조건1) {
			 	조건1에 해당하는 실행문
		 	} else if (조건2) {
		 		조건2에 해당하는 실행문
		 	} else if (조건3) {
		 		조건3에 해당하는 실행문
		 	} else {
		 		상단 조건들에 모두 맞지 않는 그외의 경우 실행문
		 	}
		 	
		 	
		 */
		int point = (int)(Math.random() * 101);
		System.out.println("점수 : " + point);
		
		if(point >= 90) {
			System.out.println("A 학점");
		} else if(point >= 80) {
			System.out.println("B 학점");			
		} else if(point >= 70) {
			System.out.println("C 학점");						
		} else if(point >= 60) {
			System.out.println("D 학점");						
		} else {
			System.out.println("Fail");
		}
		
//		ex) 0 1 2 가 랜덤으로 설정. 0이면 가위, 1이면 바위, 2면 보가 출력되도록 설정
		int rpc = (int)(Math.random() * 3 );
		System.out.println("숫자는 " + rpc);
		
		if(rpc == 0) {
			System.out.println("가위");
		} else if(rpc == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		
		
		
		
	}

}
