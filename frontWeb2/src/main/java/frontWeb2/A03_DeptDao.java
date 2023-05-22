package frontWeb2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A03_DeptDao {
	
	// 부서정보 처리 dao
	// 1. 공통 필드 선언
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void showDeptList() {
		// 2. 연결 처리
		String sql = "select * from dept01";
		
		try {
			// 3. 대화처리
			con = DB2.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			int row = 0;
			while(rs.next()) {
				row++;
				System.out.print("no." + row);
				System.out.print("\t" + rs.getInt("deptno"));
				System.out.print("\t" + rs.getString("dname"));
				System.out.println("\t" + rs.getString("loc"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 처리" + e.getMessage());
		} catch (Exception e) {
			System.out.println();
		} finally {
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
			} finally {
				// 5. 자원해제
				DB2.close(rs, stmt, con);
			}
		}
		// 4. 실행결과
		
	}
	
	public void param(int deptno) {
		String sql = "SELECT * FROM emp02\r\n"
				+ "WHERE DEPTNO \r\n"
				+ "LIKE '%' || " + deptno + " || '%'";
		
		try {
			con = DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getInt("deptno"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		A03_DeptDao dao = new A03_DeptDao();
//		dao.showDeptList();
		Scanner sc = new Scanner(System.in);
		System.out.print("부서 번호를 입력 : ");
		int deno = sc.nextInt();
		dao.param(deno);
	}

}
