package frontWeb2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 데이터 베이스 연결과 자원 해제 예외 처리를 위한 클래스
/*
	1. 이 클래스는 무엇을 위한 클래스인가
	2. DB 연결을 위해서 필요로 하는 순서는 무엇인가
	3. jdbc는 어떤 역할을 하는 클래스이고 이것을 실제 객체화를 위해서 어떤 처리 하는지
	4. DB 연결에 필요하는 정보는 무엇이고 이것을 어떤 클래스에 의해 처리되는가
	5. 데이터베이스 처리를 위해 예외 처리는 무엇을 해야되는가
*/
public class DB2 {
	
	// 연결 객체 선언
	public static Connection con() throws SQLException {
		Connection con = null;
		// 1. 메모리 로딩(ClassNotFoundingException 처리)
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 연결정보
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		// 2. 연결 정보 처리
		String info = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속정보
		con = DriverManager.getConnection(info, "scott", "tiger");
		return con;
	}
	// 자원 해제 예외 처리
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs!=null) {
				rs.close();				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(stmt!=null) {
				stmt.close();				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(con!=null) {
				con.close();				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

	}

}
