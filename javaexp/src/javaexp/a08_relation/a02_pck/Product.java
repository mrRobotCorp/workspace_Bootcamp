package javaexp.a08_relation.a02_pck;

public class Product {
	
	public static String pCode="제품코드";
	static int no = 101;
	// 모든 외부 패키지에서 접근 가능
	public String name;
	// 같은 패키지만 접근 가능
	int age;
	// 현재 클래스 내에서만 사용 가능
	private String loc;
	
	// default 생성자의 접근 범위는 !!public!! 
	// 그러므로 Person 클래스에서 Person p01 = new Product(); 처럼 객체 생성 가능
	
	public Product() {}
	public Product(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// X -> 다른 패키지에서 접근 불가
	Product(String name) {
		this.name = name;
	}
	
	// public -> 다른 패키지에서 접근 가능
	public Product(int age) {
		this.age = age;
	}
	
	
	
	
}

// public아닌 class
class Fruit{
	
}
