package javaexp.a07_classObject;

public class A02_ObjectField {

	public static void main(String[] args) {
		
		Bus b1 = new Bus();
		Bus b2 = new Bus();
		Bus b3 = new Bus();

		// 참조변수.필드 = 데이터;
		b1.nums = "8001";
		b2.nums = "9001";
		b3.nums = "7001";
		b1.target = "seoul-incheon";
		b1.target = "sadang-gangnam";
		b1.target = "busan-jeju";
		
		System.out.println(b1.nums);
		System.out.println(b2.nums);
		System.out.println(b3.nums);
		
		// ex) Cat : 종류, 이름 - 참조변수 3개 c1, c2, c3
		
		// 클래스 안 새 데이터 생성
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		
		// 필드 안 변수에 데이터 값 할당
		c1.spci = "러시안블루";
		c2.spci = "아메리칸숏";
		c3.spci = "페르시안";
		c1.names = "cat1";
		c2.names = "cat2";
		c3.names = "cat3";
		
		// 할당값 출력
		System.out.println(c1.spci + c1.names);
		System.out.println(c2.spci + c2.names);
		System.out.println(c3.spci + c3.names);
	}

}
class Bus {
	String nums;
	String target;	
}

class Cat {
	// 데이터 유형 별 필드(데이터값을 저장하는 곳) 설정
	String spci;
	String names;
	int age;
	boolean gender;
	String[] foods;
}


