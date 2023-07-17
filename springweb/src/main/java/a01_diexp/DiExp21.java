package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp_z05_mvc.A01_Controller;
import a01_diexp_z05_mvc.A02_Service;
import a01_diexp_z05_mvc.Web_Controller;
import backendWeb.z01_vo.Dept;

public class DiExp21 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di21.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// DL (Dependency Loopup) 객체 찾는 처리
		Web_Controller obj = ctx.getBean("web_Controller", Web_Controller.class);
		System.out.println("컨테이너 객체 호출" + obj);
		
		for(Dept d:obj.getDeptList(new Dept())) {
			System.out.print(d.getDeptno() + "\t");
			System.out.print(d.getDname() + "\t");
			System.out.println(d.getLoc());
		}
		
		A01_Controller a01_Controller = ctx.getBean("a01_Controller", A01_Controller.class);
		System.out.println(a01_Controller.callCtrl());
		
		A02_Service a02_Service = ctx.getBean("a02_Service", A02_Service.class);
		a02_Service.callService();
		
		ctx.close();
		System.out.println("종료");
			
	}

}
