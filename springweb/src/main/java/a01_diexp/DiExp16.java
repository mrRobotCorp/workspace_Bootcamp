package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.CarDriver;
import a01_diexp.z01_vo.HPUser;

public class DiExp16 {

	public static void main(String[] args) {
		
		String path = "a01_diexp\\di16.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		HPUser hu = ctx.getBean("hu", HPUser.class);
		System.out.println("컨테이너 객체 호출" + hu);
		hu.usingMyPhone();
		
		CarDriver cd = ctx.getBean("cd", CarDriver.class);
		cd.driveCar();
		
		ctx.close();
		System.out.println("종료");
			
	}

}
