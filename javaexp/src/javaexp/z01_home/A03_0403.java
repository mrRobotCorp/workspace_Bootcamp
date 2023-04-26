package javaexp.z01_home;

import java.util.Scanner;

public class A03_0403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 1. 3항 연산자의 기본형식을 새로운 예제로 설명하세요
			int num01 = 30;
		// 기본 형식 -> 비교연산자 | 논리연산자? true일 경우:false일 경우
			String result01 = num01 >= 40?"통과":"실패";
			
			System.out.println(result01); // 실패 출력
		
		// 2. 3항 연산자를 활용하여 문제(3+4=?)를 내고, 해당 문제의 정답이 맞을 때, 정답 그외는 오답으로 처리하세요
			System.out.print("3+4의 답 : ");
			int answer = sc.nextInt();
			String result02 = answer == 7?"정답":"오답";
			
			System.out.println(result02);
		
		// 3. Math.random 클래스와 메서드의 기능을 정수의 임의범위 처리 예제를 통해서 기술하세요
		// random 메서드의 기본 형식 - Math.random() * 경우의 수 + 시작하는 수
			int random = (int)(Math.random() * 10 + 1);  // 1부터 시작하는 10개의 경우의 수 랜덤으로 설정
			System.out.println(random);
			
		// 4. 두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 각각 나온 주사위 합을 출력하세요
			int diceSum01 = (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1);
			int diceSum02 = (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1);
			
			System.out.println("홍길동의 주사위 합 : " + diceSum01);
			System.out.println("김길동의 주사위 합 : " + diceSum02);
		
		// 5. if 조건 구문의 기본형식 3개를 예제를 만들어 기술하세요
			int i = 30;
			
			// 중괄호를 사용한 if문
			if (i > 20) {
				System.out.println("if 형식1");
			}
			// 중괄호 없이 실행문을 옆으로 나열한 if문
			if (i == 30) System.out.println("if 형식2");
			
			// 중괄호 없이 실행문을 바로 아래에 나열한 if문
			if (i >= 10) 
				System.out.println("if 형식3");
		
		// 6. 넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
			System.out.print("16 + 16 = ");
			int quiz = sc.nextInt();
			
			if(quiz == 32) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		
		
		// 7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
		// 0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
		// 1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
		// 2) 홀/짝을 입력하여, success/failure 처리하세요.
			int ranNum = (int)(Math.random() * 10 + 1);
			
			System.out.print("구슬 갯수 맞춰보기 : ");
			int inputNum = sc.nextInt();
			
			System.out.println("랜덤의 구슬 갯수 : " + ranNum);
			
			// --------- 3개의 다른 조건문 ---------
			if(ranNum == inputNum) {
				System.out.println("일치 success - 조건문1");
			} else {
				System.out.println("불일치 failure - 조건문1");
			}
			
			if(inputNum == 1) {
				System.out.println("1 입력 success - 조건문1");			
			} else if (inputNum == 0 ) {
				System.out.println("0 입력 failure - 조건문1");						
			}
			
			if(inputNum % 2 == 1) {
				System.out.println("홀 success - 조건문1");			
			} else {
				System.out.println("짝 failure - 조건문1");						
			}
			
			String str01 = inputNum % 2 == 1?"홀":"짝";
			System.out.println("삼항연산자 : " + str01);
			
			// --------- 중첩 조건문 ---------
			
			if(ranNum == inputNum) { // 입력 값과 랜덤 값이 일치할 때 실행
				System.out.println("일치 success");
			} else if(inputNum % 2 == 1) { // 나머지 값이 1일 때 실행(홀수)
				if(inputNum == 1) { // 홀수이면서 1과 일치할 떄 실행
					System.out.println("1 입력 success");
				} else { // 홀수이면서 1과 불일치할 때 실행
					System.out.println("홀 success");
				}
			} else { // 위 조건들 이외일 떄 실행 (랜덤 값과 불일치 & 홀수가 아닌 수)
				if(inputNum == 0) { // 0일 때 실행
					System.out.println("0 입력 failure");
				} else { // 위 조건들 모두 해당하지 않을 때 실행
					System.out.println("짝 failure");
				}
			}
		
		
		// 8. if else if 구문의 기본예제를 만들어 해당 구문의 기본형식을 설명하세요.
			int exAge = 22;
			
			if(exAge >= 65) { // exAge 값이 65 이상일 때만 실행
				System.out.println("65이상");
			} else if ( exAge >= 18) { // if 조건이 아니면서 exAge 값이 18이상일 때 실행
				System.out.println("18이상");
			} else { // 위 조건들에 모두 해당하지 않는 값일 때 실행
				System.out.println("17미만");
			}
		
		// 9. 주사위가 임의로 나오게 하여, 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를 비교하여, 승/무/패를 출력하세요.
			int dice = (int)(Math.random() * 6 + 1);
			System.out.print("주사위 값 입력 : ");
			int inputDice = sc.nextInt();
			
			System.out.println("랜덤 주사위 수 : " + dice);
			
			
			if (dice < inputDice) {
				System.out.println("승");
			} else if (dice == inputDice) {
				System.out.println("무");
			} else {
				System.out.println("패");
			}
		
		// 10. switch case문의 기본형식과 기능내용을 기본 예제를 만들어 설명하세요.
			int switchNum = (int)(Math.random() * 3 + 1);
	
			switch (switchNum) {
				case 1:
					System.out.println("case 1의 경우");
					break;
				case 2:
					System.out.println("case 2의 경우");
					break;
				case 3:
					System.out.println("case 3의 경우");
					break;
				default:
					System.out.println("위 case들에 해당되지 않는 경우");
			}
		
		// 11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, switch case처리하여 해당 최종 위치를 처리하고, 
		// 그외는 정보가 없습니다 라고 표시하세요.
			int bus = 504;
			
			switch (bus) {
				case 504 :
				case 506 :
					System.out.println("Seoul");
					break;
				case 3 :
					System.out.println("Busan");
					break;
				default:
					System.out.println("그외 정보가 없습니다.");
			}
		
	}

}