package javaexp.z01_home;

public class A06_0406 {

	public static void main(String[] args) {
		// 7. 2차원배열의 선언과 할당에 대하여 기본 코드로 설명하세요.
			
			int [][] ary01 = new int[2][2]; // 선언 
			ary01[0][0] = 10; // 할당
		
		// 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리할려고 한다.
		// 초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요.
			String [][]members = new String[3][3];
			
			String[][] users = new String[2][3];
			
			users[0][0] = "anne";
			users[0][1] = "이름";
			users[0][2] = "2";
			users[1][0] = "joe";
			users[1][1] = "이름";
			users[1][2] = "3";
			
			for(int i=0; i<users.length; i++) {
				for(int j=0; j<users[i].length; j++)
					System.out.print(users[i]);
					System.out.println(users[i]);
			}
			
			
		//  9. 반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
		// 1반 1번 @@ 점...
			int [][]stu = new int[5][30];
			int point = (int)(Math.random() * 101);
			
			for(int i=0; i<stu.length; i++) {
				for(int j=0; j<stu[0].length; j++) {
					System.out.println(i + "반 " + j + "번 "+ point + "점");
				}
			}
			
		// 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  
		// 호출의 각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요.
			// 선언
			int[] intAry; 
			// 초기화
//			arry = null; null로 초기화하여 사용 가능해짐
//			arry = new int[3];
			
			// 선언, 데이터 할당 초기화
//			int [] arry2 = {200, 300, 400};
//			str01 = new String(”안녕”);
			
			// 사용(호출/할당)
//			System.out.println(arry[0]);
//			arry[0] = 500;
			
			// 선언
			String str01;
			
			// 초기화
			str01 = null;
			// 초기화2
			str01 = "hello";
			String str02 = new String("hello");
			
			// 사용 (호출/재할당)
			System.out.println(str01);
			str01 = "nuts";
			
			// 문자열의 경우 문자열 자체에 대한 비교 시 equals()사용
			System.out.println(str01.equals(str02));
			
			
			
			
			
	}

}