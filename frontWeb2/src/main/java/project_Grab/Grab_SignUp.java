package project_Grab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// 날짜 : 0514_17:20
// 작성자 : 김동현
public class Grab_SignUp {
	
	public static void main(String[] agrs) {
		
		SignUp s1 = new SignUp();
		s1.addSignUp();
	}
}

class SignUp {
	int cnt = 0;
	String pw = null;
	char[] arry;
	public static Scanner input = new Scanner(System.in);
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void addSignUp() {
		int point = 0;
		try {
			con = Grab_DB.con();
			stmt = con.createStatement();
			System.out.println("회원가입을 시작하겠습니다.");
			
			while (true) {
				System.out.print("▶ 아이디 입력: ");
				String id = input.nextLine();
				System.out.print("# 아이디 중복 체크: ");
				String chechId = "select * from grab_member where mem_id = '"+id+"'";
				rs = stmt.executeQuery(chechId);
				if(rs.next()) {
					System.out.println("이미 사용중인 아이디 입니다.");
					continue;
				}

				System.out.println("사용가능한 아이디입니다.");
				while(true) {
					System.out.print("▶ 패스워드 입력: ");
					String pw = input.nextLine();
					this.pw = pw;
					
					if(pw.length()<8) {		
						System.out.println("8자 이상 16자 이하로 입력해주세요.");
						continue;
					} else if(pw.length()>=8&&pw.length()<17) {
						break;
					} else {
						System.out.println("8자 이상 16자 이하로 입력해주세요.");
					}
				}
				while(true) {
					System.out.print("▶ 패스워드 확인: ");
					String corPw = input.nextLine();
					if(pw.equals(corPw)) {
						System.out.println("일치!");
						break;
					}	
					System.out.println("불일치!");
					cnt++;
					if(cnt==3) break;
				}
				if(cnt==3) {
					System.out.println("\n▶ 패스워드 확인 3회 틀리셨으므로 회원가입 처음으로 이동합니다.");
					cnt=0;
					continue;
				}
				
				System.out.print("▶ 이름 입력: ");
				String name = input.nextLine();
				System.out.print("▶ 번호 입력: ");
				String phone = input.nextLine();
				
				if (name.equals("") || phone.equals("") || id.equals("") || pw.equals("")) {
					System.out.println("정보입력이 잘못되었습니다.");
					continue;
				}
				System.out.println("▶ 본인 인증 절차");
				while(true) {	
					arry = new char[6];
					for(int idx=0; idx<arry.length; idx++) {
						int ranCode = (int)(Math.random()*36+48);
						if(ranCode>57&&ranCode<=65) ranCode+=7;
						arry[idx] = (char)ranCode;
					}
					String st = new String(arry);
					System.out.println("인증 코드를 문자로 전송하였습니다.");
					System.out.println("핸드폰을 확인한다 Y/N");
					String check = input.nextLine();
					if(check.equals("Y")) {
						System.out.println("인증코드는 ["+st+"] 입니다.");
					}
					System.out.print("인증코드를 입력: ");
					check = input.nextLine();
					if(check.equals(st)) {
						System.out.println("인증 성공!");
						break;
					} else {
						System.out.println("인증 실패!");
						System.out.println("새 인증코드를 생성합니다.");
					}
					
				}
				String addmem = "insert into grab_member "
						+ "values('"+id+"','"+pw+"','"+name+"','"+phone+"','"+point+"')";
				int res = stmt.executeUpdate(addmem);
				if(res > 0) {
					System.out.println("# 등록 성공");
				} else {
					System.out.println("# 등록 실패");
				}
				System.out.println("정보 입력이 완료되었습니다.");
				System.out.println("추가 회원가입을 하시겠습니까? Y/N");
				String answer = input.nextLine();
				if (answer.equals("N")) break;
			}
			System.out.println("▶ 회원가입 종료");
		
		}catch(SQLException e){
			System.out.println("SQL예외 발생 : "+e.getMessage());
		} finally {
			Grab_DB.close(rs,stmt,con);
		}
	}
}
	