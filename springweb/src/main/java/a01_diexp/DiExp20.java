package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z04_vo.Code;
import a01_diexp.z04_vo.Emp;

public class DiExp20 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di10.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		Code obj1 = ctx.getBean("code", Code.class);
		System.out.println("컨테이너 객체 호출" + obj1);
		Emp obj2 = ctx.getBean("emp", Emp.class);
		System.out.println("컨테이너 객체 호출" + obj2);
		
		obj2.setEname("Mark");
		System.out.println(obj2.getEname());
		
		ctx.close();
		System.out.println("종료");
			
	}

}
