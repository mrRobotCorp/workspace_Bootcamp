package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z06_callMvc.A01_Controller;
import a01_diexp.z06_callMvc.A02_Service;
import a01_diexp.z06_callMvc.A03_Dao;

public class DiExp22 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di22.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// z06_callMvc
		// @Controller
		// @Service
		// @Repository
		// 해당 클래스 3개 만들어 di22.xml에서 객체화하여 특정 메서드 호출
		A01_Controller a01_Controller = ctx.getBean("a01_Controller", A01_Controller.class);
		System.out.println(a01_Controller.callCtrl());
		a01_Controller.controllMsg();
		
		A02_Service a02_Service = ctx.getBean("a02_Service", A02_Service.class);
		a02_Service.serviceText();
		
		A03_Dao a03_Dao = ctx.getBean("a03_Dao", A03_Dao.class);
		a03_Dao.daoMsg();
		
		ctx.close();
		System.out.println("종료");
		
		
		
	}

}
