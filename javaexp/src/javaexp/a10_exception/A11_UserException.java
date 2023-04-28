package javaexp.a10_exception;

public class A11_UserException {

	public static void main(String[] args) {
		int ran = (int)(Math.random() * 2 + 1);
		
		try {
			System.out.println("임의의 수 : " + ran);
			System.out.println("예외 발생 전");
			if(ran == 1) {
				throw new User02Exception("throw 라인, 예외 발생");
			}
		}catch (User02Exception e) {
			System.out.println("예외 발생 후");
			System.out.println("재정의 메서드 -> " + e.getMessage());
		} 
//		finally { // 생략
//			System.out.println("예외 발생 상관없이 처리 finally");
//		}

	}

}
// ex) User02Exception으로 예외 클래스를 사용자 정의로 선언.
// 		main()에서 임의의 수((int)Math.random() * 2 + 1))가 발생 할 때,
// 		1이 나오면 예외 객체를 던져 처리할 것
class User02Exception extends Exception {
	User02Exception(String str) {
		super("랜덤의 수 1 / " + str);
	}
	
	public String getMessage() {
		String ss = super.getMessage();
		System.out.println("발생된 예외 내용 : " + ss);
		return ss;
	}
}