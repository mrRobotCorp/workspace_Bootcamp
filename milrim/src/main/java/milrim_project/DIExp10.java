package milrim_project;
// milrim_project.DIExp10
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIExp10 {

	public static void main(String[] args) {
		// 컨테이너 경로
		String path = "milrim_project\\di10.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		Object obj = ctx.getBean("obj",Object.class);
		System.out.println("컨테이너 객체 호출"+obj);
		
		
		
		
		
		ctx.close();
		System.out.println("종료");
		
	}

}
