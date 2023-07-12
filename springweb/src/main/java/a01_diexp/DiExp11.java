package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import backendWeb.z01_vo.Music;
import backendWeb.z01_vo.Person;
import backendWeb.z01_vo.Product;

public class DiExp11 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di11.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너 객체 호출" + obj);
		Person p01 = ctx.getBean("p01", Person.class);
		System.out.println("-- 컨테이너 안 객체 호출 p01 --");
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		
		Product prod = ctx.getBean("prod01", Product.class);
		System.out.println("-- prod 객체 호출 --");
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getCnt());
		
		Person p02 = ctx.getBean("p02", Person.class);
		System.out.println("-- 생성자 객체 선언 --");
		System.out.println(p02.getName());
		System.out.println(p02.getAge());
		System.out.println(p02.getLoc());
		
		// ex) Music 을 생성자에 의해 컨테이너에서 선언.
		// 		main()에 호출
		Music m01 = ctx.getBean("m01", Music.class);
		System.out.println("-- music 객체 호츌 --");
		System.out.println(m01.getMname());
		System.out.println(m01.getSinger());
		System.out.println(m01.getPubyear());
		
		ctx.close();
		System.out.println("종료");
			
	}

}
