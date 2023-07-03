package backendWeb2.a01_dao;
// backendWeb2.a01_dao.A05_MemberDao
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backendWeb2.z01_vo.Member;

public class A05_MemberDao {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<Member> mlist() {
		List<Member> memlist = new ArrayList<Member>();
		String sql = "SELECT * FROM member\r\n"
				+ "order by regdate desc";
		//1. 연결(기본예외/자원해제)
		try {
			con = DB.con();
			// 2. 대화(sql 전달 후, 매개변수로 전달)
			pstmt = con.prepareStatement(sql);
			// 3. 결과
			rs = pstmt.executeQuery();
			// 4. (ResultSet ==> VO) ? 단일/여러개 if/while
			// Member(String id, String pass, String name, int point, String auth, Date regdate)
			while(rs.next()) {
				memlist.add(new Member(
					rs.getString("id"),
					rs.getString("pass"),
					rs.getString("name"),
					rs.getInt("point"),
					rs.getString("auth"),
					rs.getDate("regdate")
				));
			}
			// 
		} catch (SQLException e) {
			System.out.println("DB:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("기타:"+e.getMessage());
		}finally {
			DB.close(rs, pstmt, con);
		}
		return memlist;
	}
	
	public Boolean getMember(String id) {
		boolean isMember = false;
      String sql = "SELECT * FROM member\r\n" + "WHERE id=?";

	
		try {
	         con = DB.con();
	         pstmt = con.prepareStatement(sql);

	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         
	         if (rs.next()) { 
	            String yn = rs.getString("id"); 
	            if (yn.equals(id)) {
	             isMember = true; 
	             } 
	         }

		
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());

		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}
		
		return isMember;
	}
	
	public Member checkMem(String id) {
		Member mem = null;		
		String sql = "SELECT * FROM member\r\n"
				+ "WHERE id = ?";
	
		try {
			con = DB.con();
			pstmt = con.prepareStatement(sql);
			
			// 대화(sql 전달 후, 매개변수로 전달)
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			// ResultSet -> VO 단일(if)/여러 개(while)
			if(rs.next()) {
				mem = new Member(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getDate(6)
					);
			}
		
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());

		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}
		
		return mem;
	}
	
	
	public void InsertMem(Member mem) {
		int isIns = 0;
		
		String sql = "INSERT INTO member02 values(?, ?, ?, ?, ?, sysdate)";
		try {
			con = DB.con();
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPass());
			pstmt.setString(3, mem.getName());
			pstmt.setInt(4, mem.getPoint());
			pstmt.setString(5, mem.getAuth());
			
			isIns =  pstmt.executeUpdate();
			
			if(isIns == 1) {
				con.commit(); 
				System.out.println("등록 성공");
			}
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		} finally {
			DB.close(rs, pstmt, con);
		}
	}
	
	public Member login(String id, String pass) {
		Member mem = null;		
		String sql = "SELECT * FROM member\r\n"
				+ "WHERE id = ? AND pass = ?";
	
		try {
			con = DB.con();
			pstmt = con.prepareStatement(sql);
			
			// 대화(sql 전달 후, 매개변수로 전달)
			pstmt.setString(1, id);
			pstmt.setString(2, pass);	
			rs = pstmt.executeQuery();
			
			// ResultSet -> VO 단일(if)/여러 개(while)
			if(rs.next()) {
				mem = new Member(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getDate(6)
					);
			}
		
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
	
		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}
		
		return mem;
	}

	public static void main(String[] args) {
		// (String id, String pass, String name, int point, String auth)
		Member mem = new Member("pieceOfpeace", "0000", "Dalyne", 2000, "사용자");
		A05_MemberDao dao = new A05_MemberDao();
//		dao.InsertMem(mem);
		dao.getMember("himan");
		
		
	}
	

}
