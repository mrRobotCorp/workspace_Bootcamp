package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Dept;
import a01_diexp.z01_vo.Person;
import a01_diexp.z01_vo.Product;
import backendWeb.z01_vo.Calculator;
import backendWeb.z01_vo.Music;

public class DiExp15 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di15.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너 객체 호출" + obj);
		
		Person p01 = ctx.getBean("p01", Person.class);
		Product prod1 = ctx.getBean("prod1", Product.class);
		Product prod2 = ctx.getBean("prod2", Product.class);
		
		System.out.println(p01.getName());
		System.out.println(prod1.getName());
		System.out.println(prod2.getName());
		
		Dept d01 = ctx.getBean("d01", Dept.class);
		System.out.println(d01.getDeptno());
		System.out.println(d01.getDname());
		System.out.println(d01.getLoc());
		
		Calculator c01 = ctx.getBean("c01", Calculator.class);
		System.out.print(c01.getNum01() + "\t");
		System.out.print(c01.getCal() + "\t");
		System.out.print(c01.getNum02() + "\t");
		System.out.println(" = " + c01.getTot());
		// ex) Music m01, m02, m03
		// 		프로퍼티 생성자1 생성자 방식으로 xml 선언 후 호출
		
		Music m01 = ctx.getBean("m01", Music.class);
		Music m02 = ctx.getBean("m02", Music.class);
		Music m03 = ctx.getBean("m03", Music.class);
		System.out.print(m01.getMname() + "\t");
		System.out.print(m01.getSinger() + "\t");
		System.out.println(m01.getPubyear());
		
		System.out.print(m02.getMname() + "\t");
		System.out.print(m02.getSinger() + "\t");
		System.out.println(m02.getPubyear());
		
		System.out.print(m03.getMname() + "\t");
		System.out.print(m03.getSinger() + "\t");
		System.out.println(m03.getPubyear());
		
		
		ctx.close();
		System.out.println("종료");
			
	}

}
