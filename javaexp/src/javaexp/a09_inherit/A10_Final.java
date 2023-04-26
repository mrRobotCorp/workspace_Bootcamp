package javaexp.a09_inherit;

public class A10_Final {

	public static void main(String[] args) {
		

	}

}

final class Riger {
	
}

// final 클래스는 상속해 줄 수 없음. 최종 클래스로 취급됨
//class NewSpec extends Riger {}

class Book {
	void showAll() {
		System.out.println("책 정보 보여주기");
	}
	
//	final void showAll() {
//		System.out.println("책 정보 보여주기");
//	}
}

class SubBood extends Book {

	// overriding으로 final showAll을 가져올 수 없음. 한 번만 쓸 수 있는 final 선언 메서드기 때문
	@Override
	void showAll() {
		super.showAll();
	}
	
}
