package javaexp.z01_home;

public class A08_0411 {

	public static void main(String[] args) {
		// 7. 매서드의 구성요소와 해당 구성요소의 특징을 기본 예제를 만들어서 설명하세요.
		Ex07 ex07 = new Ex07();
		System.out.println(ex07.ex07i()); // 출력되는 것이 Ex07 class 안 ex07i() 메서드의 리턴된 값
		
		// 8. 메서드의 리턴유형을 정수,실수,문자열,boolean을 선언하여 실제 데이터를 리턴하고, 메인메서드에서 호출하세요
		Ex08 content = new Ex08(3, 3.14, "문자열", true);
		
		System.out.println(content.ex08i());
		System.out.println(content.ex08d());
		System.out.println(content.ex08s());
		System.out.println(content.ex08b());
		
		// 9. Product88이라는 클래스를 선언하고, 생성자를 통해 물건명, 가격, 갯수를 초기화하게 했다.
//		이 때, 메서드1 물건명 리턴, 메서드2 가격리턴, 메서드3는 가격과갯수를 연산한 총계를 리턴하게
//		선언하고 해당 메서드를 호출하여 리턴값을 확인하세요.
		Product88 product = new Product88("jelly", 300, 4);
		System.out.println("물건은 : " + product.pName());
		System.out.println("갯수는 : " + product.pPrice());
		System.out.println("가격은 : " + product.pCnt());
		System.out.println("총계는 : " + product.total());
		
		
		// 10. BBPlayer라는 클래스를 선언하고, 생성자를 통해 필드값 이름, 팀명, 타석, 안타를 초기화하게 하고,
//		메서드1에서는 이름과 팀명을 리턴, 메서드2에서는 타율(안타/타석)을 리턴하여 호출되게 하여
//		메인메서드를 통해서 출력하세요.
		BBPlayer player = new BBPlayer("Sam", "LG", 3, 12 );
		
		System.out.println("이름과 팀명은 : " + player.nameT());
		System.out.println("타율은 : " + player.percent());
		
	}

}

class Ex07 {
	int num01;
	String st01;
	
	int ex07i() {
		return 20;
	}
}

class Ex08 {
	int i01;
	double d01;
	String str01;
	boolean b01;
	
	public Ex08() {
	}
	
	public Ex08(int i01, double d01, String str01, boolean b01) {
		this.i01 = i01;
		this.d01 = d01;
		this.str01 = str01;
		this.b01 = b01;
	}

	int ex08i() {
		return i01;
	}
	

	double ex08d() {
		return d01;
	}
	
	String ex08s() {
		return str01;
	}
	
	boolean ex08b() {
		return b01;
	}
	
}

class Product88 {
	String prod;
	int price;
	int cnt;
	
	public Product88(String prod, int price, int cnt) {
		this.prod = prod;
		this.price = price;
		this.cnt = cnt;
	}
	
	String pName() {
		return prod;
	}
	
	int pPrice() {
		return price;
	}
	
	int pCnt() {
		return cnt;
	}
	
	int total() {
		return price*cnt;
	}

	public Product88() {
	}
	
	
}

class BBPlayer {
	String name;
	String team;
	int t;
	int a;
	
	public BBPlayer() {
	}

	public BBPlayer(String name, String team, int t, int a) {
		this.name = name;
		this.team = team;
		this.t = t;
		this.a = a;
	}
	
	String nameT() {
		return (team + "팀의 " + name);
	}
	
	int percent() {
		return a/t;
	}
	
	
}
