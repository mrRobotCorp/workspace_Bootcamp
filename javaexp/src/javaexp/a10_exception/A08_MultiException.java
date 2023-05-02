package javaexp.a10_exception;

public class A08_MultiException {

	public static void main(String[] args) {

		/*
		A08_MultiException
			NumberFormatException	Integet.parseInt("이십")
			ArithMethicException 	1/0
			Exception				args[0]
		위와 같은 예외 처리를 다중으로 처리하고 최종적으로 finally까지 처리하여 예외를 계층적, 순차별로 처리
		*/
		
		System.out.println("-- 프로그램 시작 --");

		try {
			System.out.println(Integer.parseInt("이십"));
			System.out.println(1/0);
			System.out.println(args[0]);
			
		} catch(NullPointerException e) {
			// 최상위가 아닐 때 특정한 예외에 대한 처리에 구체화가 필요할 때
			System.out.println("데이터 입력 예외 : " + e.getMessage());
		} catch(ArithmeticException e) {
			// 최상위가 아닐 때 특정한 예외에 대한 처리에 구체화가 필요할 때
			System.out.println("수학 연산 예외 : " + e.getMessage());
			
		} catch (Exception e) {
			// 기타 모든 내용을 한꺼번에 처리
			System.out.println("기타 예외 : " + e.getMessage());
			
		} finally {
			System.out.println("예외 처리 상관없이 출력");
		}

	}

}
