package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z07_mvcAuto.A01_EmpController;
import a01_diexp.z07_mvcAuto.A02_EmpService;
import a01_diexp.z07_mvcAuto.A03_EmpDao;

public class DiExp23 {

	public static void main(String[] args) {
		// 컨테이너 경로 
		String path = "a01_diexp\\di23.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		A03_EmpDao dao = ctx.getBean("a03_EmpDao", A03_EmpDao.class);
		A02_EmpService service= ctx.getBean("a02_EmpService", A02_EmpService.class);
		A01_EmpController controller = ctx.getBean("a01_EmpController", A01_EmpController.class);
		
		dao.callDao();
		service.callService();
		controller.callEmpService();
		
		ctx.close();
		System.out.println("종료");
			
	}

}
