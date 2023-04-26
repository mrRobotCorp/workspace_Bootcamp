package javaexp.a09_inherit;

public class A01_Basic {

	public static void main(String[] args) {
		Person p01 = new Person("Joe", 25, "Seoul");
		Product pr01 = new Product("apple", 1500, 2);
		
	}

}
// this()로 정의된 생성자 호출
class Person{
	String name;
	int age;
	String loc;
	
	public Person() {
		System.out.println("객체 생성 : " + this);
	}
	
	public Person(String name) {
		this(); // 생성자를 호출하면서 매개변수가 없는 생성자도 호출
		this.name = name;
		System.out.println("매개변수 1개");
	}
	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("매개변수 2개");
	}
	
	
	public Person(String name, int age, String loc) {
		this(name, age);
		this.loc = loc;
		System.out.println("매개변수 3개");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}

class Product {
	String pName;
	int price;
	int pCnt;
	
	public Product(String pName, int price, int pCnt) {
		this(pName, price);
		this.pCnt = pCnt;
		System.out.println("객체 cnt 할당 : " + pCnt);
	}
	
	public Product(String pName) {
		this();
		this.pName = pName;
		System.out.println("객체 name 할당 : " + pName);
	}
	
	public Product(String pName, int price) {
		this(pName);
		this.price = price;
		System.out.println("객체 price 할당 : " + price);
	}


	public Product() {
		System.out.println("객체 생성 : " + this);
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getpCnt() {
		return pCnt;
	}
	public void setpCnt(int pCnt) {
		this.pCnt = pCnt;
	}
	
	
}


