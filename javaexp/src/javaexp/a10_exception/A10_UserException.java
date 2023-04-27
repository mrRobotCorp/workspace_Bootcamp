package javaexp.a10_exception;

public class A10_UserException {
	/*
	class Exceptinon {
		private String message;
		Exception() {}	
		Exception(String message) {
			this.message = message;
		}
		String getMessage() {
			return message;
		}
	}
	*/

	public static void main(String[] args) {
		System.out.println("- 사용자 정의 예외 시작 -");
		try {
//			for(int i=1; i<=10; i++) {
//				System.out.println("no." + i);
//				if(i ==5) {
//					throw new User01Exception(i + " 에서 예외 발생");
				System.out.println("line1");
				System.out.println("line2");
				throw new User01Exception("특정 라인 예외 발생");
//				}
//			}
		} catch (User01Exception e) {
			System.out.println("- 예외 발생 -");
			System.out.println(e.getMessage());
			e.call01();
		} finally {
			System.out.println("예외 상관없이 처리 될 내용");
		}
		System.out.println("사용자 정의 예외 종료");

	}

}
class User01Exception extends Exception {
	User01Exception() {
		// 생성자는 반드시 상위에 있는 생성자를 호출해야 함
		super();
	}
	
	User01Exception(String errMsg) {
		super("사용자 정의 에러 : " + errMsg); // 상위 생성자 중 매개변수가 문자열로 된 생성자 호출
	}
	@Override
	public String getMessage() {
		String msg = super.getMessage();
		System.out.println("예외 내용 : " + msg);
		return "재정의된 메서드 " + msg;
	}
	// 추가 기능 메서드 정의
	public void call01() {
		System.out.println("예외 처리 객체");
	}
}