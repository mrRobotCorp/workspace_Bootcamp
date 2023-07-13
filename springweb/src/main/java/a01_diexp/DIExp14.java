package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Gamer;
import a01_diexp.z01_vo.Monitor;
import a01_diexp.z01_vo.Sensor;
import a01_diexp.z01_vo.Student;

public class DIExp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di14.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);


		Sensor sensor01 = ctx.getBean("sensor01", Sensor.class);
		System.out.println(sensor01.getAgent());
		for(String str:sensor01.getAgent()) {
			System.out.println(str);
		}
		
		System.out.println(sensor01.getAddInfo());
		
		// class Gamer
		//		private Set<String> bead;
		//		public void setPocket(Set<String> bead)
		//		public Set<String> getPocket()
		//		xml에서 구슬을 저장하여 main()에서 getPocket() 을 통해 구슬 확인
		
		// private Properties beadCnt;
		//	구슬의 종류와 가진 갯수 설정
		//	set/get 선언 xml에서 처리
		
		Gamer g01 = ctx.getBean("g01", Gamer.class);
		System.out.println(g01.getBead());
		for(String str:g01.getBead()) {
			System.out.println(str);
		}
		System.out.println(g01.getBeadCnt());
		// 프로퍼티스객체.stringPropertyNames() : 해당 프로퍼티의 key들을 가져옴
		for(String key:g01.getBeadCnt().stringPropertyNames()) {
			String value = g01.getBeadCnt().getProperty(key);
			System.out.println(key + " : " + value);
		}
		
		Monitor monitor = ctx.getBean("monitor", Monitor.class);
		System.out.println(monitor.getConfig());
		
		/*
		Student 클래스 선언 
			private Map<String, Intger> records 메서드
			로 get/set 메서드 선언 후 호출
		*/
		
		Student s01 = ctx.getBean("stu", Student.class);
		System.out.println(s01.getRecords());
		
		ctx.close();
		System.out.println("종료");
	}

}
