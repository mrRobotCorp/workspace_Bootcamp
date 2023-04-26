package javaexp.a06_memory;

public class A05_MultiArray {

	public static void main(String[] args) {
		
		// 숫자로 기차에 좌석이 예약되어 사용되면 1, 
		// 사용되고 있지 않으면 0으로 처리
		int [][] train = new int[8][50]; // 50개의 데이터가 총 8개의 묶음 처리된 것
		// train[0] : 각 1차원의 구역 안에 50개 정수
		System.out.println(train.length); // 8 출력
		System.out.println(train[0].length); // 50 출력
		
		train[0][0] = 1;
		train[0][4] = 1;
		train[7][49] = 1;
		
		// train2 = {{1,0}, {0,0,1}, {0,0,1,1}}
		// 큰 단위(상위 배열) 반복
		for(int i =0; i<train.length; i++) {
			// 작은 단위 (하위) 배열 반복
			for(int j=0; j<train[i].length; j++) {
				System.out.print(i + 1 + "호차\t");
				System.out.print(j + 1 + "좌석 : ");
				// 배열명[호차[index][좌석index]
				System.out.println(train[i][j]);
			}
		}
		
		// ex) 학생 3명의 국어, 영어, 수학 점수 2차원 배열에 할당
		// 초기는 모두 다 0점, 1번째 학생의 국어점수 90, 2번의 영어 점수 80, 3번의 수학 점수 80 할당
		// 2중 for문을 통해서 학생의 점수 출력
		
		int[][] stu = new int[3][3];
//		int[][] stu = new int[3][5]; // 학생 3명에 과목 5개
//		int[][] stu = new int[3][]; // 학생 3명에 과목을 동적
//		int[][][] stu = new int[3][5][3]; // 3개의 반마다 5명의 학생 3개의 과목. - 3차원
//		int[][][][] stu = new int[3][5][3][3]; // 3개 학년 5개의 반마다 3명의 학생 3개의 과목. - 4차원
		
		stu[0][0] = 90;
		stu[1][1] = 80;
		stu[2][2] = 80;
		
		String []subj = {"국어", "영어", "수학"};
		
		for(int i =0; i<stu.length; i++) {
			for(int j =0; j<stu[0].length; j++) {
				System.out.print(i + "번째 학생\t");
				System.out.println(subj[j] + " 점수 : " + stu[i][j]);
			}
		}
		

	}

}
