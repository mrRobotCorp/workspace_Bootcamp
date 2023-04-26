package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A04_Zerg_Users {

	public static void main(String[] args) {
		ZergUser z01 = new ZergUser("blue");
		ZergUser z02 = new ZergUser("white");
		
		z01.makeUnit(new Zerggling());
		z01.makeUnit(new Zerggling());
		z01.allAttack();
		
		System.out.println("------------------------------------");
		z02.makeUnit(new Dron());
		z02.makeUnit(new Dron());
		z02.makeUnit(new Hydralisk());
		z02.makeUnit(new Hydralisk());
		z02.allAttack();

	}

}
// 1:다관계 추상클래스 포함 객체 처리
class ZergUser {
	// 사용자 색상으로 식별
	private String color;
	private ArrayList<Larba> units;
	public ZergUser(String color) {
		this.color = color + " 색 저그";
		units = new ArrayList<Larba>();
	}
	
	// ArrayList<Larba>에 하나씩 추가하여 과정 처리
	public void makeUnit(Larba larba) {
		units.add(larba);
		System.out.println(color + " 유닉 " + larba.getUnit() + " 생산하다");
	}
	
	public void allAttack() {
		System.out.println(color + " 모든 유닉이 공격을 한다");
		if(units.size() > 0) {
			System.out.println("전체 유닉 " + units.size() + " 공격을 한다. ");
			for(Larba l:units) {
				l.move(); // 공통메서드
				l.attack(); // 재정의 메서드
			}
		} else {
			System.out.println("공격할 유닉이 없다");
		}
	}
	
	
	
}
