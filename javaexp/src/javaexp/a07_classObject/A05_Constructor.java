package javaexp.a07_classObject;

public class A05_Constructor {

	public static void main(String[] args) {

		Person_ p01 = new Person_("abc", 25, "efg"); // class 내부에 Person_() {}로 이미 선언
		Person_ p02 = new Person_("ooo", 25, "xxx");
		System.out.println(p01.name);
		System.out.println(p01.age);
		System.out.println(p01.loc);
		System.out.println(p02.name);
		System.out.println(p02.age);
		System.out.println(p02.loc);
		
		System.out.println("-----------------------");
		
		Product_ prd1 = new Product_ ("jelly", 200, 2);
		Product_ prd2 = new Product_ ("candy", 400, 3);
		System.out.println(prd1.name);
		System.out.println(prd1.price);
		System.out.println(prd1.cnt);
		System.out.println(prd2.name);
		System.out.println(prd2.price);
		System.out.println(prd2.cnt);
		
		ProductVO p100 = new ProductVO("a");
		// p100 : 객체의 특정한 heap 영역의 주소를 간단하게 선언할 것. 참조변수
		ProductVO p101 = new ProductVO("b");
		ProductVO p102 = new ProductVO("c", 2000, 5);
		
		System.out.println("-- 물건 객체 --");
		System.out.println(p100);
		System.out.println(p100.name);
		System.out.println(p101.price);
		System.out.println(p102.cnt);
		
	}

}
// ex) Product_ 클래스 선언 필드로 물건, 가격, 갯수 영문으로 선언
// 생성자로 초기화, main()에서 참조 변수 prd1 prd2 객체 생성해서 필드값 출력
class Product_ {
	// 필드로 물건, 가격, 갯수 선언
	String name;
	int price;
	int cnt;
	
	Product_(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
}


// class 선언 시 에러가 발생하면 package javaexp.a07_classObject;
// 동일한 패키지명 하위에 동일한 클래스 선언 시 에러 발생. Person {} 은 a03에 있기 때문에 에러.
class Person_ {
	String name;
	int age;
	String loc;
	
	// default 생성자는 사용자 정의 생성자를 선언하는 순간 사라짐.
	// 1. 생성자의 핵심 임무 - 필드의 초기화 처리
	Person_ (String name, int age, String loc) {
		// field로 선언한 name 과 매개변수로 전달된 name 구분. 그 구분자 this
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
}
