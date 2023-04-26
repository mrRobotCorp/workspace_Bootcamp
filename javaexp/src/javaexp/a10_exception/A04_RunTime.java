package javaexp.a10_exception;

public class A04_RunTime {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		// ex) A04_RunTime args[0]에 회원 아이디와 패스워드를 입력 받아 처리하는
		// 프로그램으로 입력이 안될 때 예외 처리하는 내용을 하고, 예외 처리 내용으로 아이디, 패스워드를 입력하세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("아이디를 입력하세요 : ");
//		String id = sc.nextLine();
//		System.out.print("패스워드를 입력하세요 : ");
//		String pw = sc.nextLine();
//		
//		try {
//			if(id.equals("hi")) {
//				System.out.println("아이디 일치");
//			} else {
//				System.out.println(args[0]);				
//			}
//			if(pw.equals("333")) {
//				System.out.println("비밀번호 일치");
//			} else {
//				System.out.println(args[0]);				
//			}
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("존재하지 않는 회원입니다.");
//		}
//		System.out.println("프로그램 종료");
		
//		-------------------------------------
		try {
			String id1 = args[0];
			String pw1 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 회원입니다.");
		}
		System.out.println("프로그램 종료");
		
	}

}
