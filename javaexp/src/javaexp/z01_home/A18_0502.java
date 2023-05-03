package javaexp.z01_home;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A18_0502 {

	public static void main(String[] args) {
		
		// 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
		Scanner sc = new Scanner(System.in);
		System.out.println("홍대 어떻게 가요");
		System.out.println("1. 지하철  2. 버스  3. 뉴진스의 하입보이요  4. 자전거");
		System.out.print("정답 선택 : ");
		String answer = sc.nextLine();
		
		try {
			if(!answer.equals("3")) {
				throw new Ques();
			} else {
				System.out.println("정답입니다");
			}
		} catch(Ques e) {
			System.out.println("오답입니다.");
		}
		
		// 2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		int mran = (int)(Math.random());
		Random ranMeth = new Random();
		
		// 3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
		Random ran = new Random();
		int ranNum = ran.nextInt(10) + 1;
		String result= ranNum % 2 == 0?"짝":"홀";
		
		System.out.print("랜덤의 수 홀/짝 입력 : ");
		String input = sc.nextLine();
		
		if(input.equals(result)) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
		
		// 4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		String[] rps = {"가위", "바위", "보"};
		Random r1 = new Random();
		String com = rps[r1.nextInt(3)];
		
		Scanner sc2 = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.print("가위/바위/보 중 하나를 입력하세요 : ");
			String player = sc2.nextLine();
			
			if(player.equals(com)) {
				System.out.println("무");
			} else {
				System.out.println("졌거나 이겼거나");
			}
			
		}
		
		/*
		5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.

		4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
		*/
		
		// 1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
		List<String> numList = new ArrayList<String>();
		Random r2 = new Random();
		
		for(int i=1; i<=10; i++) {
			numList.add("숫자 카드 " + i);
		}
		System.out.println("임의의 숫자 카드 : " + numList.get(r2.nextInt(10) + 1));
		
		// 2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
		List<String> clist = new ArrayList<String>();
		
		// 3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
		char[] spc = new char[4];

	}

}
class Ques extends Exception {
	
	public Ques() {
		
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
