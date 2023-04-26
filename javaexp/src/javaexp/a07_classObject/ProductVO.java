package javaexp.a07_classObject;

public class ProductVO {
	String name;
	int cnt;
	int price;
	
	// 매개변수가 있는 생성자가 있더라도 new ProductVO()의 호출이 필요할 시.
	public ProductVO() {
		super(); // 상속 시 상위객체를 지칭
		
	}
	
	// ProductVO p01 = new ProductVO("a");
	// p01.name에 데이터가 할당하여 사용할 수 있음
	public ProductVO(String name) {
		// String name : 지역변수
		// this.name : 전역변수/상수(필드)
		this.name = name;
	}

	public ProductVO(String name, int cnt, int price) {
		this.name = name;
		this.cnt = cnt;
		this.price = price;
	}
	
	
}
