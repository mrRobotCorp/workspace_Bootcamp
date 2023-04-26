package javaexp.a09_inherit;

public class A07_Poly_Parts {

	public static void main(String[] args) {
		Computer com1 = new Computer("삼성");
		com1.showInfo();
		// Part part = new Cpu("i7 3.4GHZ"); <- 가 되기 때문에 Part part를 참조변수(매개변수?)로 받는
		// addPart()에서 참조변수로 쓸 수 있음
		com1.addPart(new Cpu("i7 3.4GHZ"));
		com1.showInfo();
		System.out.println("----------------------------");
		com1.addPart(new Ram("8G"));
		com1.showInfo();
		
		// ex) SSD를 상속하여 main에서 호출
		System.out.println("----------------------------");
		com1.addPart(new Ssd("518GB"));
		com1.showInfo();
	
	}

}

class ComputerParts2 {
	private String company;
	private Part part;

	public ComputerParts2(String company) {
		this.company = company;
	}
	
	public void addPart(Part part) {
		this.part = part;
		System.out.println("부품이 장착되었음.");
	}
	
	public void showInfo() {
		System.out.println(company + " 회사의 컴퓨터");
		if(part != null) {
			part.showInfo();
		} else {
			System.out.println("부품이 장착되지 않았음.");
		}
	}
}
