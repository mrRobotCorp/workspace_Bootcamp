package javaexp.z01_home;

public class A07_0410 {

	public static void main(String[] args) {
		// 1. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
		//	여러 데이터와 기능을 처리할 수 있도록 해주는 한 단위를 객체라고 하고,
		//	클래스는 사용자 정의 객체를 위한 선언 부분이다.
		//	비유했을 때 클래스는 실제 건물을 세우기 위한 설계도, 틀에 해당하고 실제 세워지는 건물이 객체라고 볼 수 있다.
		
		// 2. 필드의 특성을 예제를 통해 기술하세요
		//	메모리가 저장되는 필드는 클래스 내의 모든 구성요소에 영향을 미침
		Ex02 num01 = new Ex02();
		num01.exNum = 10; // 필드는 자동으로 초기화됨. 객체의 참조 변수와 함께 사용할 때는 객체 생성 후 바로 사용 가능.
		System.out.println(num01.exNum);
		
		// 3. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
		// 생성자는 저장 기능을 주로 처리하며 로직 기능도 처리하지만, 리턴은 사용되지 않는다.
		//	일반 메서드는 저장, 로직, 리턴 기능을 모두 처리한다.
		
		// 4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
		// 기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 객체를 생성하고 확인하세요.
		Computer cp01 = new Computer("Dell", "뭐지", 16);
		Computer cp02 = new Computer("몇인데", 8, "apple");
		
	}

}

class Ex02 {
	int exNum;
}

class Computer {
	
	String corp;
	String cpu;
	int ram;
	int ssd;
	
	Computer(String corp, String cpu, int ram) {
		this.corp = corp;
		this.cpu= cpu;
		this.ram = ram;
		System.out.println(corp + " 제품의 cpu는 " + cpu + ", ram은 " + ram);
	}
	
	Computer(String cpu, int ram, String corp) {
		this.cpu= cpu;
		this.ram = ram;
		this.corp = corp;
		System.out.println(corp + " 제품의 cpu는 " + cpu + ", ram은 " + ram);
	}
}
