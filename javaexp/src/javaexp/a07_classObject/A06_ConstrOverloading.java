package javaexp.a07_classObject;

public class A06_ConstrOverloading {

	public static void main(String[] args) {
		// 1. 클래스에서 선언된 생성자 중에 하나를 선택해서 객체 생성 가능.
		Person2 p01 = new Person2();
		System.out.println(p01.name + ", " + p01.age);
		
		Person2 p02 = new Person2("Elliot");
		System.out.println(p02.name + ", " + p02.age);
		
		Person2 p03 = new Person2("Elliot", 25);
		System.out.println(p03.name + ", " + p03.age);
		
		//-------------------------------------------------------
		
		Prod pro01 = new Prod("beer"); // 최하단 Prod class 안에 있는 Prod 매소드 안 내용 실행
		System.out.println(pro01.prod); // 바로 위 Prod 매소드 내용 실행 후 출력
		
		Prod pro02 = new Prod("wine", 200);
		System.out.println(pro02.prod + ", 가격 : " + pro02.price);
		
		Prod pro03 = new Prod(300, "vodka");
		System.out.println(pro03.price + "원, 물건명 : " + pro03.prod);
		
	}

}
// ex) 클래스에 물건명과 가격 속성 필드 선언. 생성자1 : 물건명 할당, 생성자2: 물건명, 가격, 
//		생성자3: 가격, 물건명으로 오버로딩 규칙으로 선언. 호출, 할당된 값 출력
class Prod {
	String prod;
	int price;
	
	Prod(String prod) {
		this.prod = prod;
		System.out.println("String 생성자 : " + prod);
	}
	
	Prod(String prod, int price) {
		// this(prod); 현재 선언된 생성자 중에 매개변수가 문자열로 선언된 것을 호출.
		this.prod = prod;
		this.price = price;
		System.out.println("String, int 생성자 : " + prod + ", " + price);
	}
	
	Prod(int price, String prod) {
		this.price = price;
		this.prod = prod;
		System.out.println("int, String 생성자 : " + price + ", " + prod);
	}
}

class Person2 {
	String name;
	int age;
	Person2() {
		System.out.println("매개변수가 없는 생성자");
	}
	// 오버로딩 규칙1 : 매개변수 갯수가 다르다.
	Person2(String name) {
		this.name = name;
		System.out.println("이름을 초기화하는 생성자 : " + name);
	}
	// 오버로딩 규칙2 : 매개변수의 데이터 유형이 다르다. 
	Person2(int age) {
		System.out.println("나이 초기화 생성자 : " + age);
	}
	// 오버로딩 규칙3 : 매개변수의 타입에 따른 순서가 다름
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("매개변수 타입 순서 변경1");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	Person2(int age, String name) {
		System.out.println("매개변수 타입 순서 변경2");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
	
}
