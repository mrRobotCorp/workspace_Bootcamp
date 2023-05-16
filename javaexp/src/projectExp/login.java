package projectExp;
import java.util.Scanner;

class Login {
    private static int usernum = 0;
    private static UserK user[] = new UserK[10];
    private static Scanner sc = new Scanner(System.in);
    private static String inputId, inputPassword, inputNickname;
    
    public static void main(String[] args) {
    	
        for (int i=0;i<10;i++) { 
        	user[i] = new UserK(); 
    	} //NullpointerException방지 배열 초기화

        boolean run = true;

        do {
            System.out.println("원하는 메뉴를 숫자로 입력하여 선택하세요. ");
            System.out.println("1.회원가입 2.로그인 3.사용자조회 4.탈퇴 5.종료");
            System.out.print("선택 > ");

            int select = sc.nextInt();
            if (select == 1){ //회원가입 선택
                if (usernum == 10) {
                    System.out.println("10자 내로 입력해주세요.");
                    break;
                }
                else
                    createAccount();
            } else if (select == 2) { //로그인 선택
                loginAccount();
            } else if (select == 3) { //사용자조회 선택
                lookAccount();
            } else if (select == 4) { //탈퇴 선택
                deleteAccount();
            } else { //종료 선택
                run = false;
            }
        }while (run);
        System.out.println("프로그램 종료");
    }

    private static void createAccount() { //회원가입 선택
        System.out.print("아이디를 입력하세요 : ");
        inputId = sc.next(); 
		user[usernum].setId(inputId);
		
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = sc.next(); 
//		user[usernum].setPassword(inputPassword);
		// --------------
		while(true) {
			System.out.print("비밀번호 확인 : ");
			String pw2 = sc.next();
			try {
				if(!pw2.equals(inputPassword)) {
					throw new PwCheck(pw2);
				} else {
					user[usernum].setPassword(inputPassword);
					break;
				}
			} catch(PwCheck e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("비밀번호 일치. 입력 완료.");
		// ----------------
		
        System.out.print("닉네임을 입력하세요 : ");
        inputNickname = sc.next(); 
		user[usernum].setNickname(inputNickname);
		
		System.out.println(inputNickname + "님 회원가입을 환영합니다.");

        usernum++;
    }

    private static void loginAccount() { //로그인 선택
        System.out.print("아이디를 입력하세요 : ");
        inputId = sc.next();
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = sc.next();

        int loginSuccess = 0;
        
        for (int i=0;i < user.length;i++){
            if (inputId.equals(user[i].getId())&&inputPassword.equals(user[i].getPassword()))
            {
                System.out.println("로그인 성공");
                System.out.println(user[i].getId() + " " + user[i].getNickname());
                loginSuccess = 1;
                break;
            }
        }
        if (loginSuccess == 0)
            System.out.println("로그인 실패");
    }

    private static void lookAccount() {    //사용자조회 선택
        for (UserK users : user) {
            if (users.getNickname() != null)
                System.out.println(users.getNickname());
        }
    }

    private static void deleteAccount() {    //탈퇴 선택
        System.out.print("아이디를 입력하세요 : ");
        inputId = sc.next();
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = sc.next();
        
        int deleteSuccess = 0;
        
        for (int i=0;i < user.length;i++){
            if (inputId.equals(user[i].getId())&&inputPassword.equals(user[i].getPassword())) {
                System.out.println("탈퇴 성공");
                user[i].setId(null); user[i].setPassword(null); user[i].setNickname(null);
                deleteSuccess = 1;
            }
        }
        if (deleteSuccess == 0)
            System.out.println("일치하는 정보 없음");
    }
}


class UserK {
    private String id;
    private String password;
    private String nickname;

    
    public UserK() {
		// TODO Auto-generated constructor stub
	}
	
	public UserK(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}

class PwCheck extends Exception {
	PwCheck(String pw) {
		super("" + pw);
	}

	@Override
	public String getMessage() {
		String excep = "입력된 내용 : " + super.getMessage();
		System.out.println("비밀번호가 일치하지 않습니다.");
		return excep;
	}
	
}

