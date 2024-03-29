package javaexp.a10_exception;

public class A01_Basic {

	public static void main(String[] args) {
		// 1. 예외 처리 기본 1단계 처리
		System.out.println("line1");
		System.out.println("line2");
		try { // 예외 처리 블럭으로 만약 처리하지 않으면 에러 발생과 동시에 해당 라인에서 진행 중단
			  // 하지만 try{} catch 문으로 인해 계속 수행 가능
			System.out.println("--- 코드 블럭 ---");
			System.out.println("line3");
			System.out.println("line4");
			// ArrayIndexOutOfBoundsException, 예외 발생. 아래 line5,6 실행X
			System.out.println(args[0]); 
			// throw new Exception() 내부적으로 예외 객체를 던짐.
			// 예외를 던지면 이후 내용이 수행되지 않음.
			System.out.println("line5");
			System.out.println("line6");
			
			// 상위 관계의 최상위이기에 모든 예외를 받을 수 있음.
		} catch(Exception e) { // 예외 처리가 없을 시엔 실행 X
			System.out.println("--- 예외 처리 블럭 ---");
			// e.XXX : 여러 기능 메서드를 통해서 예외에 대한 상세 내용을 처리
			System.out.println(e.getMessage());
			System.out.println("line7");
			System.out.println("line8");
		}
		
		System.out.println("--- 예외 처리 후 블럭 ---");
		System.out.println("line9");
	}

}
