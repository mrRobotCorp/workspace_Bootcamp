package javaexp.a08_relation.a01_pck;

import javaexp.a08_relation.a02_pck.Product;

public class Person {
	
	// 외부 패키지에 있는 public class인 경우 호출
	Product p01; // ctrl+shift+o
	
	void call() {
		// public + static이므로 객체 생성 필요없이 바로 호출 가능
		System.out.println(Product.pCode);
		
		// static이지만 public이 아니므로 접근 불가능
//		System.out.println(Product.no);
		
		p01 = new Product(); // default가 public이기에 생성 가능
		
		// String 매개변수를 넣은 메서드는 public 표시를 안 한 private이기 때문에 접근 X.
//		p01 = new Product("apple");
		
		// int 매개변수를 넣은 메서드는 public 유형이기 때문에 접근 가능
		p01 = new Product(20);
		
		p01 = new Product("apple", 3000);
		
		// public 필드인 name은 접근 가능하지만 따로 언급 안 한 default 타입 age는 접근 불가능
		System.out.println(p01.name);
//		System.out.println(p01.age);
		
		
		
	}
	
	// 외부 패키지에 public이 아닌 클래스는 호출을 할 수 없음
//	Man m01;
	
	// ex) a08_realtion 패키지 하위에 a03_pak, a04_pck 생성.
	//		Computer class, public인 Mouse와 아닌 KeyBoard
	//		Computer에서 필드로 해당 객체를 선언.

}
