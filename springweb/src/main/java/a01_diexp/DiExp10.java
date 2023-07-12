package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DiExp10 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di10.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너 객체 호출" + obj);
		
		ctx.close();
		System.out.println("종료");
			
	}

}
