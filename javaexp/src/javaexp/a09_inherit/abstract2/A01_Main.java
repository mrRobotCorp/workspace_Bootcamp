package javaexp.a09_inherit.abstract2;

import java.util.ArrayList;

public class A01_Main {

	public static void main(String[] args) {
		

	}

}

abstract class Weapon {
	private String kind;

	public Weapon(String kind) {
		this.kind = kind;
	}
	
	// 공통 메서드
	public void adapt() {
		System.out.println(kind + " 장착하다.");
	}
	
	// 추상 메서드
	public abstract void attack();

	public String getKind() {
		return kind; // 상속관계에 있을 때, 상위 생성자 반드시 호출
	}
	 
}

class Rocket extends Weapon {

	public Rocket() {
		super("로켓포");
	}

	@Override
	public void attack() {
		System.out.println(getKind() + " 로 공격력 20으로 공격하다.");
	}
}

class Robot {
	private String kind;
	private ArrayList<Weapon> wlist;

	// 생성 시, 로봇의 종류와 물건 리스트를 추가할 수 있게 초기 생성
	public Robot(String kind) {
		this.kind = kind;
		wlist = new ArrayList<Weapon>();
	}
	
	public void addWeapon(Weapon w) {
		wlist.add(w); // list에 하나씩 물건을 추가
		System.out.print(kind + " 로봇에 ");
		w.adapt(); // 무기 추가 기능 공통 메서드 호출
	}
	
	public void showAllWeapon() {
		System.out.println(kind + " 로봇이 가진 무기들.");
		for(Weapon wp:wlist) {
			System.out.println(wp.getKind());
		}
		System.out.println(wlist.size() + " 개의 무기 장착.");
	}
	
	public void randomAttack() {
		System.out.print(kind + " 로봇이 가진 무기 중 임의의 무기로 공격");
		int ranIdx = (int)(Math.random() * wlist.size());
		wlist.get(ranIdx).attack();
	}
}


