package javaexp.a09_inherit;

public class A04_Polymorphism {

	public static void main(String[] args) {
		Animal an01 = new Cat();
		an01.sound();
		
		// ex) 하위 클래스 Dog을 재정의하고 main()에서 위와 같이 다형성 처리(상위=하위)
		// 오버라이딩 메서드로 호출
		Animal an02 = new Dog();
		an02.sound();

	}

}
class Animal {
	private String kind;

	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void sound() {
		System.out.println(kind + "가 소리를 내다");
	}
	
}

class Cat extends Animal {
	
	@Override
	public void sound() {
		super.sound(); // kind가 소리를 내다
		System.out.println("meow meow");
	}

	public Cat() {
		super("고양이");
	}
	
}

class Dog extends Animal {

	public Dog() {
		super("강아지");
	}
	
	public void sound() {
		super.sound();
		System.out.println("왕왕");
	}
	
}
