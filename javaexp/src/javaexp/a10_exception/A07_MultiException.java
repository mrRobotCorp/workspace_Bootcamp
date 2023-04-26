package javaexp.a10_exception;

public class A07_MultiException {

	public static void main(String[] args) {
		// 다중 예외 처리
		String name = "Kim";
		try {
			System.out.println(name.toString());
			System.out.println(args[0]);			
			System.out.println(name.charAt(6));
			System.out.println(1/0);
			
		} catch(NullPointerException e) {
			System.out.println("데이터 입력 예외 : " + e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과 예외 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("기타 예외 : " + e.getMessage());
		} finally {
			System.out.println("예외 상관없이 처리 할 코드 블럭");
		}
		System.out.println("프로그램 종료");

		
	}

}
