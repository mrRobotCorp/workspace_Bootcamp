package javaexp.a05_process;

public class A02_if {

	public static void main(String[] args) {
		/*
		 # if문
		 1. 조건문 결과에 따라 중괄호{} 내용 처리. 중괄호가 없을 경우 바로 다음 내용을 수행함.
		 2. 형식
		 	1) 중괄호 블럭 : 여러 라인이 있는 경우.
		 		if(조건문) {
		 			조건문에 해당할 때 실행 내용
	 			}
 			2) 바로 옆에 있는 내용 수행
 				if (조건문1) 조건문1일 때, 처리할 내용;
 				if (조건문2) 조건문2일 때, 처리할 내용;
			3) 바로 밑 한 라인에 내용 수행
				if(조건문1)
					조건문1일 때 수행할 내용;
				if(조건문2)
					조건문2일 때 수행할 내용;
		 */
		int cnt = 1;
		System.out.println("flow 진행 : " + cnt++);
		System.out.println("flow 진행 : " + cnt++);
		if (cnt == 3) {
			System.out.println("#cnt가 3일 때 처리할 내용1");
			System.out.println("#cnt가 3일 때 처리할 내용2");
			System.out.println("#cnt가 3일 때 처리할 내용3");
		}
		System.out.println("flow 진행 : " + cnt++);
		System.out.println("flow 진행 : " + cnt++);
		System.out.println("flow 진행 : " + cnt++);
		System.out.println("flow 진행 : " + cnt++);
		System.out.println("flow 진행 : " + cnt++);
		
		// ex) 과일 갯수를 2개씩 증가하게 처리. 곰돌이가 사과를 몇 개 먹었다 10번 반복해서 처리.
		// 갯수가 4개, 6개일 때 바나나도 먹었습니다. 출력

		 int fruit = 0;
		 System.out.println("곰돌이가 사과를 " + (fruit+=2) + "개 먹었다.");
		 System.out.println("곰돌이가 사과를 " + (fruit+=2) + "개 먹었다.");
		 System.out.println("곰돌이가 사과를 " + (fruit+=2) + "개 먹었다.");
		 if	(fruit == 4 || fruit == 6) {
			 System.out.println("4개를 먹고 바나나도 먹었다.");
		 }
		 System.out.println("곰돌이가 사과를 " + (fruit+=2) + "개 먹었다.");
		 if	(fruit == 6) {
			 System.out.println("6개를 먹고 바나나도 먹었다.");
		 }
		 System.out.println("곰돌이가 사과를 " + (fruit+=2) + "개 먹었다.");

		 
		 System.out.println("------------for--------------");
		 
		 for (int f=2; f <= 12; f+=2 ) {
			 System.out.println("곰돌이가 사과를 " + f + "개 먹었다.");
			 if	(f == 4) {
				 System.out.println("4개를 먹고 바나나도 먹었다.");
			 } else if ( f == 6) {
				 System.out.println("6개를 먹고 바나나도 먹었다.");
			 }
		 }
		 
		 //바로 옆라인에 중괄호 블럭 없이 사용되는 경우
		 int breadCnt = 0;
		 System.out.println("빵 " + (++breadCnt) + "개 먹었다.");
		 System.out.println("빵 " + (++breadCnt) + "개 먹었다.");
		 if(breadCnt == 2) 
			 System.out.println("\t수박도 같이 먹었다."); // 조건문에 해당하는 실행문 (조건 바로 다음에 오기 때문에 속해짐)
			 System.out.println("\t바나나도 같이 먹었다."); // 조건문에 속하지 않는 실행문
		 System.out.println("빵 " + (++breadCnt) + "개 먹었다.");
		 System.out.println("빵 " + (++breadCnt) + "개 먹었다.");
		 if(breadCnt == 4) System.out.println("\t오렌지도 같이 먹었다.");
		 System.out.println("빵 " + (++breadCnt) + "개 먹었다.");
		 
		 // ex) 바로 옆이나 아래 중괄호 없이 조건문 처리. 카운트없 1-10까지 출력하되, 3일 때 ### 3입니다 ### 추가 처리.
		 int exCnt = 0;
		 System.out.println(++exCnt); // 1
		 System.out.println(++exCnt); // 2
		 System.out.println(++exCnt); // 3
		 if (exCnt == 3) System.out.println("### " + exCnt + " 입니다###");
		 System.out.println(++exCnt);
		 System.out.println(++exCnt);
		 System.out.println(++exCnt);
		 System.out.println(++exCnt);
		 System.out.println(++exCnt);
		 System.out.println(++exCnt);
		 if (exCnt == 9) 
			 System.out.println("@@@ " + exCnt + " 입니다@@@");
		 System.out.println(++exCnt);
		 

	}

}
