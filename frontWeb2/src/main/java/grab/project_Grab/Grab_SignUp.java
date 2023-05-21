package grab.project_Grab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 날짜 : 0514_17:20
// 작성자 : 김동현
public class Grab_SignUp{
	
	public static void main(String[] agrs) {
		
		SignUp s1 = new SignUp();
		s1.callMemDB();		
		s1.addSignUp();
		s1.showSignUp();
		
	}
}


class SignUp {	
	public static Map<String, Member> mMap = new HashMap<String, Member>();
	int cnt = 0;
	public static Scanner input = new Scanner(System.in);
	
	public void addSignUp() {
		System.out.println("회원가입을 시작하겠습니다.");
		
		while (true) {
			System.out.print("▶ 아이디 입력: ");
			String id = input.nextLine();
			System.out.print("# 아이디 중복 체크: ");
			if(mMap.containsKey(id)) {
				System.out.println("사용 불가!");
				continue;
			} else {
				System.out.println("사용 가능!");
			}
			System.out.print("▶ 패스워드 입력: ");
			String pw = input.nextLine();
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
			
			mMap.put(id,new Member(name, phone, pw));
			
			System.out.println("정보 입력이 완료되었습니다.");
			System.out.println("추가 회원가입을 하시겠습니까? Y/N");
			String answer = input.nextLine();
			if (answer.equals("N")) break;
		}
		System.out.println("▶ 회원가입 종료");
	}
	
	public void callMemDB() {
		mMap.put("dolmeng", new Member("박다솜","01015771577","dol123"));
		mMap.put("vanana", new Member("노현우","01035116533","va123"));
		mMap.put("ddong", new Member("김동현","01020003000","1111"));
	}
	
	public void showSignUp() {
		System.out.println("▼ 등록된 회원 리스트 출력 ▼");
		for (String id : mMap.keySet()) {
			Member mem = mMap.get(id);
			System.out.print("이름: "+mem.getName()+"\t아이디: "+id+"\n");

		}
	}
}

class Member {
	private String name;
	private String phone;
	private String pw;

	public Member(String name, String phone, String pw) {
		this.name = name;
		this.phone = phone;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}