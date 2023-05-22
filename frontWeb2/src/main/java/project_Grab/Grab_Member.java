package project_Grab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Grab_Member {
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	
	public static void closeDB(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(stmt!=null) stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(con!=null) con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("#자원 해제 완료#");
	}
	
	
	public void signUp() {	// 멤버집어넣기
		try {
			con = Grab_DB.con();
			stmt = con.createStatement();
			while(true) {
				System.out.println("▶ 회원가입");
				Scanner sc = new Scanner(System.in);
				System.out.print("# 아이디 입력: ");
				String mem_id = sc.nextLine();
				System.out.print("# 패스워드 입력: ");
				String mem_pw = sc.nextLine();
				System.out.print("# 이름 입력: ");
				String mem_name = sc.nextLine();
				System.out.print("# 연락처 입력: ");
				String mem_phone = sc.nextLine();
				int mem_point = 0;
				
				String sql = "insert into grab_member "
						+ "values('"+mem_id+"','"+mem_pw+"','"+mem_name+"','"+mem_phone+"','"+mem_point+"')";
				
				// insert 메서드라서 ResultSet을 사용하지 않음			
				int res = stmt.executeUpdate(sql);
				if(res > 0) {
					System.out.println("# 입력 성공");
				} else {
					System.out.println("# 입력 실패");
				}
				System.out.println("추가 회원 입력 시: Y ");
				String input = sc.nextLine();
				if(input.equals("Y")) {
					continue;
				}
				break;
			}
			System.out.println("▶ 회원 가입 종료");
			
		} catch (SQLException e) {
			System.out.println("SQL예외 발생 : "+e.getMessage());	
			
			
		} finally {
			closeDB(rs,stmt,con);
			
		}
		
		
	}
	
	public void login(){
		
		while(true) {
			try {	
				con = Grab_DB.con();
				stmt = con.createStatement();
				System.out.println("▷ 로그인");
				Scanner sc = new Scanner(System.in);
				System.out.print("# 아이디 입력: ");
				String input_id = sc.nextLine();
				System.out.print("# 패스워드 입력: ");
				String input_pw = sc.nextLine();
				String sql = "select * from grab_member where mem_id = '"+input_id+"'";
				// insert 메서드라서 ResultSet을 사용하지 않음			
				ResultSet res = stmt.executeQuery(sql);
				res.next();
				if(input_id.equals(res.getString("mem_id"))) {
					if(input_pw.equals(res.getString("mem_pw"))) {
						System.out.println("▷ 로그인 성공!");
						break;
					}else {
						System.out.println("▷ 비밀번호를 잘못 입력하셨습니다.");
						System.out.println("▷ 다시 입력해주세요!");
					}
				}
			}catch(SQLException s) {
				System.out.println("▷ 존재하지 않는 아이디입니다.");
				System.out.println("▷ 다시 입력해주세요!");
			}finally {
				closeDB(rs,stmt,con);
			}
				
		}
	}		
	
	public static void main(String[] args) {
		Grab_Member grab = new Grab_Member();
		grab.signUp();
		grab.login();
	}
}



