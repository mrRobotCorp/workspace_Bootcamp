package javaexp.y01_review;

public class A02_Constructor {

	public static void main(String[] args) {
		Person p01 = new Person("joe", 10);
		System.out.println(p01.name);
		
		
	}

}
class Person {
	String name;
	int age;
	// 보이진 않지만 생성자가 없을 때, 컴파일시 default
	// 생성자가 자동으로 생성되어 실행 시 호출하여 사용함.
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
