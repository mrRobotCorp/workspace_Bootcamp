package project_Grab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Grab_DB {

	public static Connection con() throws SQLException {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class 예외 발생 : "+e.getMessage());
		}
		
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("DB 접속 성공");
		return con;

	}
	
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		// 해제 전에 예외가 발생한 것을 처리
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

}
