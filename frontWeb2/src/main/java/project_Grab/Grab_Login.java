package project_Grab;

import java.util.Scanner;
// 날짜 : 0514_17:20
// 올린이 : 김동현
// Grab_Login, Grab_Product, Grab_Search, Grab_SignUp, **(응용)Grab_Cart
public class Grab_Login{
	
	public static void main(String[] args) {
		
		Login l1 = new Login();
		l1.callMemDB();
		l1.doLogin();
	}
}


class Login {
//	public static Map<String, Member> mMap = new HashMap<String, Member>();
	Scanner input = new Scanner(System.in);
	
	public void callMemDB() {
//		mMap.put("dolmeng", new Member("박다솜","01015771577","dol123"));
//		mMap.put("vanana", new Member("노현우","01035116533","va123"));
//		mMap.put("ddong", new Member("김동현","01020003000","1111"));
	}
	
	public void doLogin() {
		System.out.println("로그인을 시작합니다.");
		
		while(true) {
			System.out.println("▶ 아이디를 입력하세요.");
			String id = input.nextLine();
			System.out.println("▶ 패스워드를 입력하세요.");
			String pw = input.nextLine();
			
//			if(mMap.containsKey(id)) {
//				if(mMap.get(id).getPw().equals(pw)) {
//					System.out.println("▷ 로그인 성공");
//					break;
//				} else {
//					System.out.println("▷ 비밀번호가 틀렸습니다.");				
//				}
//			} else {
//				System.out.println("▷ 존재하지 않는 아이디 입니다.");
//			}
		}
	}
		
			
	

}
