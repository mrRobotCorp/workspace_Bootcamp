package frontWeb2;

import java.util.Scanner;

import frontWeb2.vo.Member;

public class B01_ShoppingMall {
	
	private A05_MemberDao dao;
	
	public B01_ShoppingMall() {
		dao = new A05_MemberDao();
	}
	
	public static void loginMenu() {
		A05_MemberDao dao = new A05_MemberDao();
		Scanner sc = new Scanner(System.in);
		while(true) {			
			System.out.println("-- 로그인 시작 -- ");
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("패스워드를 입력 : ");
			String pass = sc.nextLine();
			Member mem = dao.login(id, pass);
			
			if(mem!=null) {
				System.out.println("로그인 성공");
				System.out.println(mem.getName() + "님 환영합니다.");
				break;
			} else {
				System.out.println("로그인 실패");
				System.out.println(id + " : ID는 인증 계정이 압니다.");
				System.out.print("로그인을 계속 진행하시겠습니다까?(Y/N) -> ");
				String isYN = sc.nextLine();
				
				if(!isYN.equals("Y")) {
					break;
				}	
			}
		}
		System.out.println("로그인 프로그램 종료");
	}
	
	public static void register() {
		A05_MemberDao dao = new A05_MemberDao();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-- 회원가입 시작-- ");
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호를 입력 : ");
			String pass = sc.nextLine();
			
			while(true) {
				System.out.print("비밀번호 확인 : ");
				String pass2 = sc.nextLine();
				if(pass2.equals(pass)) {
					System.out.println("비밀번호 일치");
					break;
				}
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();	
			
			Member mem = new Member(id, pass, name, 1001, "관리자");
			dao.InsertMem(mem);
			
			System.out.println("회원가입 종료");
			System.out.print("회원가입을 다시 진행하시겠습니까? (Y/N) -> ");
			String isYN = sc.nextLine();
			if(!isYN.equals("Y")) {
				break;
			}
			
		}

		
	}

	public static void main(String[] args) {
//		B01_ShoppingMall b = new B01_ShoppingMall();
//		b.loginMenu();
		register();
		loginMenu();
	}

}
