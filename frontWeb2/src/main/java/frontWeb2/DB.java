package frontWeb2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB 연동 공통 클래스
public class DB {
	// DB.con(); <- 호출 방식
	public static Connection con() throws SQLException {
		Connection con = null;
		// 1. jdbc 메모리 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 예외 : " + e.getMessage());
		}
		
		// 2. 연결 정보 처리
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		// DriverManager : kdbc 드라이버 클래스 중 특정한 객체가 메모리에 로딩된 상황
		// 접속 정보를 매개변수로 계정과 비번을 받아서 특정 서버에 접속하고 그 접속한 객체를
		// 호출하는 곳에 리턴처리
		con = DriverManager.getConnection(info, "scott", "tiger");
		
		System.out.println("DB 접속 성공");
		
		return con;
	};
	

}
