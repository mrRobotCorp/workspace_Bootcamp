package javaexp.z01_home.fruit;

public class Banana {
	public void callAll() {
		KoreanMelon km = new KoreanMelon();
//		System.out.println("private : " + km.name);
		System.out.println("default : " + km.cnt);
		System.out.println("protected : " + km.price);
		System.out.println("public : " + km.point);
	}
}
