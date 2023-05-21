package project_Grab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Grab_Standard {
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;


	public void closeDB(ResultSet rs, Statement stmt, Connection con) {	// DB 닫기
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
	
	public void insertID() {	// 멤버집어넣기
		try {
			con = Grab_DB.con();
			stmt = con.createStatement();
			String sql = "insert into 테이블명 values(?,?,?)";
			rs = stmt.executeQuery(sql);
			// 불러올 내용 집어넣기
			// while(rs.next()){}
			
		} catch (SQLException e) {
			System.out.println("SQL예외 발생 : "+e.getMessage());
		} finally {
			Grab_DB.close(rs, stmt, con);
		}
	}
	public void insertProduct() {	// 상품정보집어넣기
		try {
			con = Grab_DB.con();
			String sql = "insert into 테이블명 values(?,?,?)";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// 불러올 내용 집어넣기
			// while(rs.next()){}
			
		} catch (SQLException e) {
			System.out.println("SQL예외 발생 : "+e.getMessage());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Grab_Standard grab = new Grab_Standard();
		
	}
}
