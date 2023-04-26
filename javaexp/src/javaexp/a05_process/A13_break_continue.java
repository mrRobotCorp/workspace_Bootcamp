package javaexp.a05_process;

public class A13_break_continue {

	public static void main(String[] args) {
		/*
		 # 반복문에서 break와 continue
		 1. 반복문에서 반복을 중단 처리해줌
		 2. 반복 수행을 중단 처리할 때의 2가지 형식
		 	1) 반복 자체를 완전 중단 시켜주는 break문
		 	2) 해당 반복 단계를 실행, 나머지 라인을 중단하고 다음 단계로 진행		
		 */
		for(int cnt = 1; cnt <=9; cnt++) {
			if(cnt == 8 ) { // 곱해지는 값이 8일 때 반복문 중단 - 9부터 실행되지 X
				break;
			}
			if (cnt == 5 ) { // 곱해지는 cnt가 5일 때 수행하지 않고 6부터 다시 실행
				continue;
			}
			// 열 단위가 먼저 수행됨
			for(int grade=2; grade<=9; grade++) {
				System.out.print(grade);
				System.out.print(" X ");
				System.out.print(cnt);
				System.out.print(" = ");
				System.out.print(grade*cnt + "\t");
			}
			System.out.println();
		}
		
		// ex) 카운트업으로 1-10까지 출력, 3의 배수는 continue 처리
		
		for (int i = 1; i <=10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
			
	}

}
