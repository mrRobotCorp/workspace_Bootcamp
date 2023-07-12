package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.CarDriver;
import a01_diexp.z01_vo.HPUser;

public class DiExp12 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di12.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		HPUser u01 = ctx.getBean("u01", HPUser.class);
		System.out.println("컨테이너 객체 호출" + u01);
		u01.usingMyPhone();
		
		CarDriver d01 = ctx.getBean("d01", CarDriver.class);
		System.out.println("컨테이너 객체 호출" + d01);
		d01.driveCar();
		
		// ex) Car 차종 배기량 최고속도
		// 		CarDriver 자동차 기사 이름 Car 객체
		ctx.close();
		System.out.println("종료");
			
	}

}
