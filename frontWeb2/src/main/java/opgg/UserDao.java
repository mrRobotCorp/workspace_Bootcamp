package opgg;

import java.sql.*;

import opgg.VO.User;

public class UserDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public User UserSearch(String id) {	// 메소드명 변경
		User userInfo=null;
		String sql = "";// sql문 입력
		try {
			con = OPGG_DB.con();
			// 로직 입력
			
			
			rs=pstmt.executeQuery();
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB예외 발생 : "+e.getMessage());
			OPGG_DB.rollback(con);
		} catch (Exception e) {
			System.out.println("일반 예외 처리 : "+e.getMessage());
		} finally {
			OPGG_DB.close(rs, pstmt, con);
		}
		return userInfo;
	}
	
}
