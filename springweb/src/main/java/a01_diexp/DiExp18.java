package a01_diexp;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z02_vo.Car;
import a01_diexp.z02_vo.CarDriver;
import a01_diexp.z02_vo.Person;

public class DiExp18 {

	public static void main(String[] args) {
		
		String path = "a01_diexp\\di18.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Person ob = ctx.getBean("person", Person.class);
		System.out.println("컨테이너 객체 호출" + ob);

		ob.setName("Amy");
		ob.setAge(30);

		Car c01 = ctx.getBean("car", Car.class);
		CarDriver cardriver02 = ctx.getBean("cardriver02", CarDriver.class);
		
		c01.setCname("SM5");
		c01.setCc(2500);
		c01.setSpeed(300);
		cardriver02.setCar(c01);
		cardriver02.setDriver("Max");
		cardriver02.driveCar();
			
		
		ctx.close();
		System.out.println("종료");
			
	}

}
