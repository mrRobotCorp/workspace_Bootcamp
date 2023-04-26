package javaexp.z01_home.fruit;

public class KoreanMelon {
	private String name  = "k-melon";
	int cnt = 3;
	protected int price = 2000;
	public String point = "389";
	
	public void callAll() {
		System.out.println("private : " + name);
		System.out.println("default : " + cnt);
		System.out.println("protected : " + price);
		System.out.println("public : " + point);
	}
}
