package javaexp.a06_memory;

public class A06_NullPointer {

	public static void main(String[] args) {
		
		int [] intAry;
		String str01;
		String str02;
		// System.out.println(str01); - 해당 단계에서는 에러. 
		// 객체는 초기화하고 해야만 컴파일(기계어)로 바뀌어서 메모리에 올릴 수 있음
		
		// 초기화
		intAry = null;
		str01 = null;
		str02 = "tayolr";
		
		// 전체 해당 객체의 이름으로 호출하면 null로 표기
		System.out.println(intAry);
		System.out.println(str01);
		System.out.println(str02);
		// heap 영역에 할당되지 않는 구성요소 호출
		System.out.println("-- heap 영역 --");
		// 배열의 경우 index 번호
		// java.lang.NullPointerException
//		System.out.println(intAry[0]);
		
		// 객체의 경우 기능 메서드, 필드 (객체의 전역 데이터)
		// heap 영역에 할당한 경우 정상 처리
		// taylor -> 기능메서드가 지원하는 메모리 범위까지만 호출됨
		System.out.println(str02.charAt(0));
		System.out.println(str02.charAt(2));		
		System.out.println(str02.charAt(5));
//		System.out.println(str02.charAt(6));

		intAry = new int[3];
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		// System.out.println(intAry[3]); index 범위 벗어난 에러 발생
		
		// ex) 문자열로 물건 3개를 할당하는 배열을 선언. 각 index별로 호출하고 
		// index 범위가 초과할 때 나오는 에러 확인 -> java.lang.ArrayIndexOutOfBoundsException
		String[] proList = {"a", "b", "c"};
		
		System.out.println(proList[0]);
		System.out.println(proList[1]);
		System.out.println(proList[2]);
		// ArrayIndexOutOfBoundsException <- 배열의 범위 초과 에러
		// NullPointerException <- 해당 데이터 구성요소에 대한 메모리가 없는 에러
		// System.out.println(proList[3]);
		
	}

}
