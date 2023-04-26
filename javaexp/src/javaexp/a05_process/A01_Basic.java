package javaexp.a05_process;

public class A01_Basic {

	public static void main(String[] args) {
		/*
		 # 코드 실행 흐름 제어
		 1. 정상적인 코드 실행 흐름
		 	1) main() 메소드의 시작인 중괄호{}에서 시작하여 끝까지 진행.
		 	2) 위에서부터 아래로 코드 흐르메 따라 진행
		 	3) 대입연산자의 경우엔 흐름이 오른쪽에서 왼쪽.
		 	4) 그외에는 대부분 왼쪽에서 오른쪽 흐름. ex) 조건문/논리연산식/다항연산식
		 2. 제어문의 역할
		 	코드의 실행 흐름을 개발자가 원하는 방향으로 변경할 수 있게 해줌
		 	
		 */
		
		System.out.println("#순차 구조에 의한 처리 흐름#");
		System.out.println("그냥 집에 가면 안될까?");
		System.out.println("1. take me home");
		System.out.println("1-1. if문 처리");
		System.out.println("2. i wanna go home");
		System.out.println("3. i miss my home sweet home");
		System.out.println("4. it's so boring and exhausting");
		System.out.println("5. Noooooo");
		
		/*
		 #제어문의 종류
		 1. 조건문 
		 	1) if, switch문
		 	2) 기본 형식
		 		if(비교연산식|논리연산식) {
		 			true일 경우 실행문
		 		} else {
		 		
		 		}
		 		
		 		switch(기준데이터) { 
		 			25/100 특정 변수에 할당된 수/문자열을 기준으로 실행
		 			case 데이터1: 처리 할 실행문 break;
		 			case 데이터2: 처리 할 실행문 break;
		 			default: 위체 지정한 case에 해당하지 않을 때 처리 할 실행문
		 		}
 		2. 반복문
 		 1) for문, while문, do-while문
 		 2) 기본형식
 		 	- for문 : 같은 조건을 반복해서 실행할 때 사용
 		 		for(초기값; 반복조건; 증감연산자) {
 		 			반복처리할 실행문
 		 		}
 		 		ex) for(int = 0; i <= 10; i++) {
 		 				Systen.out.println(i);
	 				} // 0부터 10까지 증가되어 출력
			- while : 특정 조건일 떄, 반복을 중지하는 내부 데이터 처리에 따른 반복 여부를 실행할 때 주로 사용.
				while(반복조건) {
					반복실행할 내용
				}
				ex) while(data != -1) { // 입력한 값이 -1이 아닐 때만 반복
						data = sc.nextLine();
				}
			- do-while : while문과 비슷하나, 반복처리할 구문을 최소 한 번은 수행해야 할 때 주로 사용.
				do {
					// 일단 1번은 수행, 마지막 반복 수행할 조건일 때, 수행 처리
				} while (반복할 조건);
				ex) do {
						menu = sc.nextLine();
						// 일단 메뉴를 한 번 입력 가능하게 하고,
						// Q가 아닐 때까지 반복 실행
					} while ( !menu.equals("Q"));
	 		3) continue, break;
	 			1) continue - 반복문 안에서 반복 단계 중 특정 조건 구문을 만날 때 continue 이후,
	 			내용을 수행하지 않고, 다음 반복을 처리할 때 사용.
	 			ex) for(int i = 0; i <= 10; i++) {
	 					if(i == 5) {
	 						continue;
	 					}
	 					System.out.println("count : " + i);
	 				} // 1부터 10까지 카운트 되어 출력 - 5일 때는 continue기에 제외.
				
				2) break - 특정 반복 구문에서 조건과 함께 처리되어 반복 수행을 중단함.
					while(true) {
						menu = sc.nextLine();
						if(menu.equals("Q)) {
							break;
						}
						System.out.println("선택된 메뉴 : " + menu);
					} // true 상황일 때 반복해서 입력받고 출력하다가 Q가 입력됐을 때 반복이 중단됨.
				
		3. 중첩 조건문/반복문 
			1) 제어문의 중괄호 내부, 다른 제어문 작성 가능.
				- 다양한 흐름 발생 가능
			2) 유형
				- 조건문
					ex) if(gender.equals("여")) {
							if (age>=18) {
								woman
							} else {
								girl
						} else {
							if(age>=18) {
								man
							} else {
								boy
							}
						}
				- 반복문
					for (int grade=2; grae <=9; grade++) {
						System.out.println(grade+"단");
						if (int cnt =1; cnt<=9; cnt++;) {
							System.out.prinln(grade);
							System.out.prinln("*");
							System.out.prinln(cnt);
							System.out.prinln("=");
							System.out.prinln(grade*cnt);
						}
					}
				
				
				
		 */

		
	}

}
