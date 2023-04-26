package javaexp.a05_process;

public class A06_for {

	public static void main(String[] args) {
		/*
		 # for문을 통한 반복문
		 1. 특정 step 단위로 반복문을 수행할 때 사용됨.
		 2. 기본 형식
		 	for(초기값; 반복조건; 증감연산자) {
			 	반복해서 수행 할 실행문
		 	}
	 	3. 기본 구성 요소 내용
	 		1) 초기값 : 1번만 수행, for문 안에서 사용할 변수 선언(최대, 최소값을 선언) ex) cnt = 100; cnt = 0;
	 		2) 반복 조건 : for문을 반복할 조건 ex) cnt<=10 : 증가 처리 사용(최고값 설정), cnt>= : 감소처리할 떄 사용
	 		3) 반복해서 수행 할 구문 : 실제 반복 처리 할 내용
		 	4) 증감연산자 : 증가하거나 감소 처리 ex) cnt++ (1씩 증가), cnt-- (1씩 감소)
		 	
		 */
		// int cnt는 for문 안에서만 해당되는 지역변수이기 때문에 동일하게 선언해도 실행 가능
		for(int cnt=1; cnt<=10; cnt++) {
			System.out.println("count : " + cnt);
		}
		
		System.out.println("# 감소 데이터 처리 #");
		for(int cnt=10; cnt>=0; cnt--) {
			System.out.println("카운트 다운 : " + cnt);
		}
		
		// 15~40까지
		for(int cnt = 15; cnt<=40; cnt++) {
			System.out.println(cnt + ", ");
		}
		System.out.println();
		
		// 20 ~ 100까지 출력하되, 3단위로 증가 처리
		for(int cnt = 20; cnt <=100; cnt+=3) {
			System.out.print(cnt + " , ");
		}
		System.out.println();
		
		// ex1) 20~30까지 출력 
		for(int cnt = 20; cnt <=30; cnt++) {
			System.out.println("ex1) " + cnt);
		}
		System.out.println("-----------------------------");
		// ex2) 100 ~ 70까지 출력 
		for(int cnt = 100; cnt >=70; cnt--) {
			System.out.println("ex2) " + cnt);
		}
		System.out.println("-----------------------------");
		// ex3) 1부터 20까지 2개씩 증가 처리하여 출력
		for(int cnt = 1; cnt <=20; cnt+=2) {
			System.out.println("ex3) " + cnt);
		}
		System.out.println("-----------------------------");
		// ex4) 50부터 30까지 5개씩 감소 처리하여 출력
		for(int cnt = 50; cnt >=30; cnt-=5) {
			System.out.println("ex4) " + cnt);
		}
		System.out.println("-----------------------------");
			
		
		
		
		
		
		
	}

}
