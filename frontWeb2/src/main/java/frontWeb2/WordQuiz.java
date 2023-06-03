package frontWeb2;

import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Word> v = new Vector<Word>();
		
		int chNum01[] = new int[4];
		int chNum02[] = new int[3];
		
		v.add(new Word("apple", "사과"));
		v.add(new Word("grape", "포도"));
		v.add(new Word("milk", "우유"));
		v.add(new Word("carrot", "당근"));
		v.add(new Word("watermelon", "수박"));
		v.add(new Word("peach", "복숭아"));
		
		int num = 0;
		System.out.println("단어 테스트 시작. (-1을 입력하면 종료)");
		
		while(true) {
			
			int addP = 0;
			int lossP = 0;
			
			for(int i=0; i<chNum01.length; i++) {
				num++;
				chNum02[i] = (int)(Math.random() * chNum02.length) + 1;
	            
				for(int j=0; j<i; j++) {
					if(chNum02[i] == chNum02[j]) {
						i--;
						break;
					}
				}
				
				
				System.out.println(num + "번. " + v.get(chNum01[3]).getEng() + "의 뜻은?");
				
				System.out.print("(1)" + v.get(chNum01[chNum02[0]]).getMean() + "\t");
				System.out.print("(2)" + v.get(chNum01[chNum02[1]]).getMean() + "\t");
				System.out.print("(3)" + v.get(chNum01[chNum02[2]]).getMean() + "\t");
				System.out.println("(4)" + v.get(chNum01[chNum02[3]]).getMean());
				System.out.print("정답 >> ");
				
				
				int input = sc.nextInt();
				
				if(input == -1) {
					System.out.println("--- 단어 테스트를 종료합니다 ---");
					System.out.println("맞춘 갯수 : " + addP + ", 틀린 갯수 : " + lossP);
					break;
				}
				
				
				if(v.get(chNum01[chNum02[input-1]]).getMean() == v.get(chNum02[i]).getMean()) {
					System.out.println("정답입니다");
					addP++;
				} else {
					System.out.println("틀렸습니다.");
					lossP++;
				}
			}

			
		
			break;
		}
		
		
	}
	
	

}
