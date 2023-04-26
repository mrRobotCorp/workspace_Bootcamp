package javaexp.a08_relation.a06_pck;

public class Bus {
	// 접근제어자 private 외부에서 *직접적인* 접근 불가능 (같은 package여도 불가능)
	private String driver;
	
	// 같은 패키지에 있기 때문에 public 아니어도 접근 가능
	Car c1 = new Car();
	
	public int no;
	String target;
	
	public Bus() {	}
	
	public Bus(String target, int no, String driver) {
		this.target = target;
		this.no = no;
		this.driver = driver; // 간접적 접근을 위한 데이터 할당
	}
	
	public void callInfo() {
		System.out.println("bus number : " + no);
		System.out.println("destination : " + target);
		// 기능 메서드를 통해 간접적인 접근. 해당 패키지에서 내용을 바로 출력해 보내기
		System.out.println("Driver : " + driver); 
	}
	
	Bus(int num) {
		
	}
	
	public Bus(String target, int no) {
		this.no = no;
		this.target = target;
	}
}
