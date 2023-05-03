package javaexp.z01_home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A18_0502 {

	public static void main(String[] args) {
		
		// 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
		Scanner sc = new Scanner(System.in);
		System.out.println("css 속성이 아닌 것은?");
		System.out.println("1. font-size  2. display  3. caption  4. cursor");
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
		
		System.out.println("랜덤의 수는 " + ranNum);
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
			
			if(player.equals("가위") || player.equals("바위") || player.equals("보")) {
				
				if(player.equals("가위")) {
					System.out.print("컴퓨터는 " + com + " , 결과 -> ");
					if(com == "가위") {
						System.out.println("무");
					}
					if(com == "바위") {
						System.out.println("패");
					}
					if(com == "보") {
						System.out.println("승");
					}
				}
				if(player.equals("바위")) {
					System.out.print("컴퓨터는 " + com + " , 결과 -> ");
					if(com == "가위") {
						System.out.println("승");
					}
					if(com == "바위") {
						System.out.println("무");
					}
					if(com == "보") {
						System.out.println("패");
					}
				}
				if(player.equals("보")) {
					System.out.print("컴퓨터는 " + com + " , 결과 -> ");
					if(com == "가위") {
						System.out.println("패");
					}
					if(com == "바위") {
						System.out.println("승");
					}
					if(com == "보") {
						System.out.println("무");
					}
				}
				
			} else {
				System.out.println("잘못 입력되었습니다.");
			}
			
		}
		
//		----------------------------------------------------------------------

		int win, eq, loo; win=eq=loo=0;
				
		for(int i=1; i<=3; i++) {
			System.out.print("가위는 1번, 바위는 2번, 보는 3번을 입력 : ");
			int comRe = r1.nextInt(3);
			int player = sc2.nextInt()-1;
			System.out.println("컴퓨터 : " + rps[comRe] + ", 유저 : " + rps[player]);
			
			if(comRe == player) {
				System.out.println("무승부");
				eq++;
			} else if(((comRe + 1) % 3) == player) {
				System.out.println("승리");
				win++;
			} else {
				System.out.println("패");
				loo++;
			}
		}
		System.out.println("승 : " + win + ", 무 : " + eq + ", 패 : " + loo);
		
		
		
		
		/*
		5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
		*/
		
		// 1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
		List<String> numList = new ArrayList<String>();
		Random r2 = new Random();
		
		for(int i=1; i<=10; i++) {
			numList.add("카드 no." + i);
		}
		System.out.println("임의의 숫자 카드 : " + numList.get(r2.nextInt(10) + 1));
		
		// 2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
		List<String> clist = new ArrayList<String>();
		
		clist.add("A");
		clist.add("J");
		clist.add("Q");
		clist.add("K");
		
		for(int i=2; i<=10; i++) {
			clist.add("" + i);
		}
		
		for(int i=1; i<=7; i++) {
			System.out.println(i + "번 랜덤 카드 : " + clist.get(r2.nextInt(9) + 2));
		}
		
		// 3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
		// class Card를 만들고 속성을 2가지 담을 수 있게 선언
		List<Card> cardL = new ArrayList<Card>();
		List<String> card = new ArrayList<String>();
		Card cd = new Card();
		String [] shapes = {"♣","♥","♠","◆"};
		
		// 2단계와 동일. A~10,J,Q,K만 추가
		for(int i=2; i<=10; i++) {
			card.add("" + i);
		}
		card.add("A");
		card.add("J");
		card.add("Q");
		card.add("K");
		
		System.out.println("--- 카드 52개 ---");
		// 상위 반복은 모양(특수기호)
		for(String sha:shapes) {
			// 하위 반복은 숫자
			for(String num:card) {
				System.out.print(sha + num + "  ");
				cardL.add(new Card(sha,num));
				
			}
		}
		
		for(Card c:cardL) {
			System.out.println(c.getSpe() + c.getNo() + "  ");
		}
		
		System.out.println("카드의 총 갯수 : " + cardL.size());
		
		
		// 4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
		Collections.shuffle(cardL);
		System.out.println("\n섞은 후 카드들");
		List<Card> mem01 = new ArrayList<Card>();
		List<Card> mem02 = new ArrayList<Card>();
		List<Card> mem03 = new ArrayList<Card>();
		List<Card> mem04 = new ArrayList<Card>();
		
//		for(Card c:cardL) {
//			System.out.println(c.getSpe() + c.getNo() + "  ");
//		}
		// 4명에게 각 7장씩 카드 전달
		for(int i=0; i<28; i++) {
			Card d = cardL.get(i);
			if(i%4 == 0) mem01.add(d);
			if(i%4 == 1) mem02.add(d);
			if(i%4 == 2) mem03.add(d);
			if(i%4 == 3) {
				mem04.add(d);				
				System.out.println((i/4) + 1 + "번째 카드 배부");
			}
		}
		
		System.out.println("-- 각 플레이별 카드 내용 --");
		for(Card c:mem01) {
			System.out.print(c.getSpe() + c.getNo());
		}
		System.out.println();
		
		for(Card c:mem02) {
			System.out.print(c.getSpe() + c.getNo());
		}
		System.out.println();
		
		for(Card c:mem03) {
			System.out.print(c.getSpe() + c.getNo());
		}
		System.out.println();
		
		for(Card c:mem04) {
			System.out.print(c.getSpe() + c.getNo());
		}
		System.out.println();
		
		
		
	}

}
class Card {
	private String spe;
	private String no;
	public Card(String spe, String no) {
		this.spe = spe;
		this.no = no;
	}
	public String getSpe() {
		return spe;
	}
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public void setSpe(String spe) {
		this.spe = spe;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
