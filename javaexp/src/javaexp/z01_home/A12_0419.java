package javaexp.z01_home;

public class A12_0419 {

	public static void main(String[] args) {
		Team t = new Team("one", 3, 3, 3, 3.3);
		Yellow y1 = new Yellow();
		y1.result();

	}

}

class Team {
	String name;
	int win;
	int same;
	int loose;
	double percent;
	
	public Team(int win) {
		this.win = win;
		System.out.println("Team 생성자");
	}

	public Team(String name, int win, int same, int loose, double percent) {
		this.name = name;
		this.win = win;
		this.same = same;
		this.loose = loose;
		this.percent = percent;
	}



	public Team(String name) {
		this.name = name;
	}
	
	public void result() {
		System.out.println("--- Team 메서드 ---");
	}
}

class Yellow extends Team {
	
	Yellow() {
		// 상위 생성자 호출 필수 (상위 클래스와 동일 이름의 메서드 - 매개변수 맞춰서)
		super(3);
		System.out.println("Yellow 생성자");
	}
	
	Yellow(String name) {
		this();
	}

	
	public void result() {
		System.out.println("--- Yellow 메서드 ---");
		super.result();
	}
	
}