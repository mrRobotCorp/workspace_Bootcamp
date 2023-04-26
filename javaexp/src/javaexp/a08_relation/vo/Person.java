package javaexp.a08_relation.vo;
//javaexp.a08_relation.vo.Person
public class Person {
	public String getName() {
		return name;
	}

	// 일반적으로 필드는 직접 호출이 불가능하게 private으로 설정
	// 한 번에 읽기 쓰기를 못하게 처리
	private String name;
	private int age;
	private String loc;
	
	public Person() {
		
	}
	
	public Person(int age) {
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

	// p01.setAge(25); 필드에 있는 값 간접적으로 할당
	// p01.getAge(); 필드에 있는 값을 간접적으로 호출
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

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public Person(int age, String loc) {
		this.age = age;
		this.loc = loc;
	}

	// String name 매개변수를 가진 메서드가 위에 있기 때문 (오버로딩 규칙에 의해 식별 불가능)
	// new Person("hi"); <- 이 같은 경우 매개변수가 달라도 같은 유형이 같은 갯수를 가진 메서드면 겹치기 때문에 생성 X.
//	public Person(String loc) {
//		this.loc = loc;
//	}
	
	
	
	
}
