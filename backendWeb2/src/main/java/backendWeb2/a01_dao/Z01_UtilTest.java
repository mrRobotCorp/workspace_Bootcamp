package backendWeb2.a01_dao;

import java.util.List;

import com.google.gson.Gson;

import backendWeb2.z01_vo.Emp;
import backendWeb2.z01_vo.Person;

public class Z01_UtilTest {

	public static void main(String[] args) {

		Gson gson = new Gson();
		// 객체 --> json 데이터 변환
		Person p01 = new Person("Amy", 24, "seoul");
		String jsonData = gson.toJson(p01);
		
		System.out.println(jsonData);
		// {"name":"Amy","age":24,"loc":"seoul"} 출력
		
		A04_PreParedDao dao = new A04_PreParedDao();
		List<Emp> empList = dao.getEmpList();
		System.out.println(gson.toJson(empList));
		
		
	}

}
