package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Dept;
import a01_diexp.z01_vo.Member;
import a01_diexp.z03_vo.Music;

public class DiExp19 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di19.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너 객체 호출" + obj);
		
		/*
		z03_vo
			Music, Dept, Member 해당 위치에 복사
		해당 패키지에 있는 개체를 사용할 수 있게 처리한 후 호출
		*/
		Music m01 = ctx.getBean("m01", Music.class);
		Dept d01 = ctx.getBean("d01", Dept.class);
		Member mem = ctx.getBean("mem01", Member.class);
		
		m01.setMname("plan");
		m01.setSinger("Travis scott");
		d01.setDname("IT");
		d01.setLoc("Ohio");
		mem.setId("skrr");
		mem.setPw("1111");

		
		ctx.close();
		System.out.println("종료");
			
	}

}
