package javaexp.y01_review;

public class A01_MultiArray {

	public static void main(String[] args) {
		// 다차원 배열 예제 - 기차 호차별 예상 내용 true, false
		
		// 6개 호차, 40개 좌석 설정, 예약 기본값 모두 false, 각 호차별 좌석에 예약 내용 출력
		boolean [][] train = new boolean [6][40]; 
		
		train[0][1] = true;
		train[1][20] = true;
		train[2][2] = true;
		train[5][39] = true;

		// for-if 반복 출력
		for(int i=0; i<train.length; i++) { // 배열 큰 단위인 호차 반복 출력
			System.out.println("----" + (i + 1) + " 호차----");
			for(int j=0; j<train[i].length; j++) { // 배열 작은 단위인 호차 안 좌석 반복 출력
				System.out.println(j + 1 + " 좌석");
					if(train[i][j] == true) { // 좌석을 출력하되, 그 작은 단위 값이 true일 경우 이선좌도 출력
						System.out.println("**이선좌**");
					}
			}
		}
		
		// for-삼항연산자 반복 출력
		for(int i=0; i<train.length; i++) { // 배열 큰 단위인 호차 반복 출력
			for(int j=0; j<train[i].length; j++) { // 배열 작은 단위인 호차 안 좌석 반복 출력
				System.out.print(i + 1 + " 호차\t");
				System.out.print(j + 1 + " 좌석");				
				System.out.println(train[i][j]==true?"  이선좌":"  예약가능");				
			}
		}
		
		// ex) 2개 과목에 3명의 학생의 점수를 2차원으로 할당. 출력.
		int [][] subjs = {{40, 50}, {90, 30}, {70, 80}}; // 3명 학생의 큰 단위 안에 2개 점수 작은 단위
		String[] names = {"frank", "omar", "carly"};
		String[] sub = {"kor", "math" };

		for(int i=0; i<subjs.length; i++) {
			for(int j=0; j<subjs[i].length; j++) {
//				System.out.print(i + 1 + "번째 학생의 ");
//				System.out.println(j + 1 + "번째 점수는 " + subjs[i][j]);
				System.out.print(names[i] + "'s point - ");
				System.out.println(sub[j] + " : " + subjs[i][j]);
			}
		}
		
//		int [][][] clsPt = new int[3][2][3];
		int [][][] clsPt = {
			{{40, 20, 60}, {60, 80, 90}},
			{{70, 50, 80}, {30, 50, 60}},
			{{100, 70, 90}, {40, 50, 70}}
		};

		for(int i=0; i<clsPt.length; i++) {
			for(int j =0; j<clsPt[i].length; j++) {
				for(int k =0; k<clsPt[i][j].length; k++) {
//					System.out.println(clsPt[i][j][k]);
					System.out.print(i + 1 + "반 ");
					System.out.print(j + 1 + "번 학생은 ");
					System.out.println(clsPt[i][j][k] + "점");
				}
			}
		}
		
	}
}
