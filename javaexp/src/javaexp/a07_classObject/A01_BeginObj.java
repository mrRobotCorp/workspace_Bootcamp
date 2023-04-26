package javaexp.a07_classObject;

public class A01_BeginObj {

	public static void main(String[] args) {
		
		// 클래스를 통해 만들어진 객체
		// 클래스명 참조 변수 = new 클래스명();
		LotterTower seoul = new LotterTower();
		LotterTower busan = new LotterTower();
		LotterTower jeju = new LotterTower();
		
		// javaexp.a07_classObject.LotterTower@7c30a502
		// 패키지명.클래스명@16진수로 heap영역의 주소 값
		System.out.println(seoul);
		System.out.println(busan);
		System.out.println(jeju);
		
		// Book 클래스 선언하고 b01, b02, b03 객체를 생성, 각 참조주소를 확인
		Book b01 = new Book();
		Book b02 = new Book();
		Book b03 = new Book();
		
		System.out.println(b01); // javaexp.a07_classObject.Book@3ac3fd8b 
		System.out.println(b02); // javaexp.a07_classObject.Book@5594a1b5
		System.out.println(b03); // javaexp.a07_classObject.Book@6a5fc7f7 출력
		
	}

}
// *주의* class 안에 class 선언은 가능. but public 클래스는 1개 선언, public 클래스가
// 파일명.java로 사용되고, main()도 사용 가능함.
class LotterTower {
	
}

class Book {
	
}


