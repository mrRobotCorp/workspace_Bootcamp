package javaexp.a08_relation;

import javaexp.a08_relation.vo.Car;
import javaexp.a08_relation.vo.CarRacer;
import javaexp.a08_relation.vo.Computer;
import javaexp.a08_relation.vo.Cpu;
import javaexp.a08_relation.vo.HPUser;
import javaexp.a08_relation.vo.HandPhone;
import javaexp.a08_relation.vo.Ram;

public class A03_ObjVsObj {

	public static void main(String[] args) {
		HandPhone hp = new HandPhone("삼성", 1200000);
		
		HPUser hs = new HPUser("Amy");
		
		String name = "Amy";
		hs.setName(name);
		hs.setName("Joe");
		
		hs.buyPhone(hp);
		hs.buyPhone(new HandPhone("애플", 150000));
		
		System.out.println("--------------------------------");
		
		hs.callByPhone(); // hp 데이터 할당 전. hp는 null 값
		hs.buyPhone(hp);
		hs.callByPhone();
		
		System.out.println("--------------------------------");
		
		CarRacer cr = new CarRacer("Sam");
		cr.buyCar(new Car("그랜저", 3500));
		cr.drivingCar();
		
		System.out.println("--------------------------------");
		
		Cpu cp1 = new Cpu("intel", "i7");
		Ram rm1 = new Ram(8);
		Computer comp = new Computer("조립");
		comp.addCpu(cp1);
		comp.addRam(rm1);
		comp.showCom();
		
		
		
		
		
		// ex) 1:1 관계. package javaexp.a08_relation.vo 에 추가
		// Cpu(제조사, 사양, showInfo() 메서드, 제조사 사양 출력)클래스 선언, 
		// Computer(종류(조립/완성품 둘 중 하나), Cpu, addPart() 메서드, showCom - 컴퓨터가 cpu 없다 있다 cpu의 정보())
		
		// 1) Cpu 클래스 선언 및 필드, 생성자, 메서드 추가 - 주의 메서드 : showInfo()에서 제조사 사양 출력
		// 2) Computer 클래스 선언 Cpu 클래스를 포함한 필드 선언 생성자 기능메서드 선언
		//		주의 메서드 : Cpu 객체 할당 뭘 통해서 cpu 객체가 할당되어 있을 때와 그러지 않을 때 구분하여 출력
		
	}

}
