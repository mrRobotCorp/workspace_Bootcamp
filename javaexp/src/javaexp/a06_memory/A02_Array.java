package javaexp.a06_memory;

public class A02_Array {

	public static void main(String[] args) {
		/*
		 # 배열이란.
		 1. 같은 타입의 데이터를 연속된 공간에 저장하는 자료 구조
		 2. 배열의 구성 요소
		 	1) 배열의 데이터 유형
		 		기본데이터 유형, 문자열, 사용자 정의 클래스로 만들어진 객체
	 		2) 배열의 index
	 			각 데이터 저장 위치는 인덱스(0부터 시작)부여해서 접근할 수 있음.
	 			배열명[0] : 호출 / 배열명[1] = "할당";
 			3) 배열의 크기
 				배열명.length 배열의 전체 길이를 가져올 수 있음. 
		3. 배열의 활용
			1) 배열의 선언
				데이터 유형 [] 배열명;
				데이터 유형 배열명[];
				ex) int [] array;  / String array2[];
			2) 배열의 초기화
				배열은 초기화해야만 사용할 수 있음.
				- 배열명 = null;
					heap영역에는 할당하지 않고, stack 영역에서 선언한 형태
				- 배열명 = new 데이터유형[배열의 크기];
					heap영역에 할당은 했지만 실제 default형 데이터로 구성됨. 
					** 구성요소가 숫자형 or boolean 형이면 0/false로 해당 크기만큼 할당됨.
						객체 유형은 null로 할당됨. **
				- 데이터를 할당해서 초기화한 경우
					배열명 = new 데이터 유형[] {
						데이터1, 데이터2, 데이터3
					}
					데이터 유형 배열명 = {데이터1, 데이터2} --> 선언과 할당 동시에 처리
			3) 배열의 데이터 활용
				- 배열이 크기로 초기화가 되거나 선언과 동시에 할당한 경우(heap영역에 생성된 경우)
				- 배열명[index번호] : 호출
				- 배열명[index번호]=데이터 : 할당
		 */
		// 배열의 선언
		int[] array01;
		String[] array02;
		Math[] array03; // 내장된 api 객체
		Person[] array04; // 사용자 정의 클래스 객체
		
		// 초기화 처리
		// 1. null;
		array01 = null; // heap영역에 메모리 없음. 각 구성요소를 호출해서 사용할 수 없음.
		
		// 2. 크기에 default로 값 설정
		// 배열명 = new 데이터유형[데이터값]; / heap 영역에 메모리가 생성.
		array01 = new int[3];
		
		// 3. 배열의 데이터 확인 배열명[index번호]
		System.out.println(array01[0]);
		System.out.println(array01[1]);
		System.out.println(array01[2]);

		array02 = new String[2]; // index값 2개로 설정. 0,1까지.
		System.out.println("문자열 배열의 초기값 확인");
		System.out.println(array02[0]);
		System.out.println(array02[1]);
		
		// ex) 다음의 배열 데이터를 선언하고, 크기를 지정하여 초기화하고 해당 데이터를 출력
		// 1) 정수형 크기가 3 실수형(double) 크기 2
		// 2) 문자형String 크기 5 정수형(long) 선언만.
		int[] intArry = new int[3];
		System.out.println("정수형(int) 크기 3개 배열");
		for(int idx=0; idx<intArry.length; idx++) {
			System.out.println(intArry[idx]);
		}
		
		double[] douArry = new double[2];
		System.out.println("실수형 배열");
		System.out.println(douArry[0]);
		System.out.println(douArry[1]);
		
		String[] strArry = new String[5];
		System.out.println("문자열형 배열");
		for(int idx=0; idx<strArry.length; idx++) {
			System.out.println(strArry[idx]);
		}
		
		// 객체가 heap영역에 생성되지 않음. 배열의 속성을 접근할 수 X.
		long[] lgArry = null;
		
		/*
		 # 배열 데이터의 활용
		 1. new를 통해 초기화된 배열은 데이터를 index로 접근해서 할당(변경) 가능
		 */
		
		String[] arry01 = new String[3];
		System.out.println("배열의 활용");
		System.out.println(arry01[0]);
		arry01[0] = "사과";
		arry01[1] = "바나나";
		arry01[2] = "딸기";
		System.out.println("두번째 데이터 : " + arry01[1]);
		
		for(int idx=0; idx< arry01.length; idx++) {
			System.out.println(idx+1+"번째 데이터");
			System.out.println(arry01[idx]);
		}
		// ex1) 물건가격 3개 선언하고 데이터를 할당 출력
		
		int[] payList = new int[3];
		payList[0] = 100;
		payList[1] = 200;
		payList[2] = 300;
		
		System.out.println("ex1 - 물건가격 출력");
		for(int i = 0; i < 3; i++) {
			System.out.println(payList[i]);
		}
		
		// ex2) 학생의 몸무게(소숫점이하) 3명 선언 및 할당 출력
		double[] weightList = new double[3];
		weightList[0] = 20.2;
		weightList[1] = 30.2;
		weightList[2] = 14.3;
		
		System.out.println("ex2 - 몸무게 목록 출력");
		for(int i = 0; i < 3; i++) {
			System.out.println(weightList[i]);
		}
		
		
		
	}

}

class Person{}


