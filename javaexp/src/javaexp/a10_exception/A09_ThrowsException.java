package javaexp.a10_exception;

import java.io.IOException;

public class A09_ThrowsException {

	static void call01() throws ClassNotFoundException {
		// Class.forName("패키지.클래스") 해당하는 클래스가 있으면 메모리에 로딩 처리
		System.out.println("메서드1");
 		Class.forName("javaexp.a10_exception.A09_ThrowsException");
	}
	
	static void call02() throws IOException{
		System.in.read();
		System.out.println("입력한 문자 : " + (char)System.in.read());
	}
	
	static void call03() throws ClassNotFoundException{
		System.out.println("메서드2");
		Class.forName("javaexp.a10_exception.A09_ThrowsException");
	}
	
	static void call04() throws ClassNotFoundException{
		System.out.println("메서드3");
		Class.forName("ff.ee.ss");
	}
	
	static void call05() throws IOException{
		System.out.println("call05() 메서드");
		System.in.read();
		System.out.println("입력한 문자 : " + (char)System.in.read());
	}
	
	static void call06() throws IOException{		
		System.out.println("call06() 메서드");
		System.in.read();
		System.out.println("입력한 문자 : " + (char)System.in.read());
	}
	
	public static void main(String[] args) {
		
		try {
			// 위임을 했기에 호출하는 곳에 다시 예외를 처리해야 함
			call01();
		} catch (ClassNotFoundException e) {
			// 위임된 예외를 처리
			System.out.println("예외 내용(클래스 없음) : " + e.getMessage());
		}
		
		/*
		System.in.read();
		ex) call02() 메서드를 선언하고, System.in.read(); (컴파일에러) 코드를 포함하여 예외 위임 처리
		 */
		
//		try {
//			call02();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		// 한 번에 여러 가지 기능 메서드에 대한 예외를 처리
		System.out.println("예외 위임 처리 시작");
		try {
			// 위임된 예외를 처리
			call01();
			call03();
			call04();
			
		} catch (ClassNotFoundException e) {
			System.out.println("--- 예외 발생 ---");
			System.out.println("해당 클래스가 없음 -> " + e.getMessage());
		} finally {
			System.out.println("예외 상관없이 처리");
		}
		System.out.println("예외 위임 처리 종료");
		
		// ex) call02() 복사하여 call05(), call06()까지 기능 메서드를
		// 선언하고, 예외 위임을 아래 해서 한꺼번에 처리
		System.out.println("---------------------------");
		
		System.out.println("예제) 예외 위임 처리 시작");
		try {
			call02();
			call05();
			call06();
		} catch (IOException e) {
			System.out.println("예외 내용 : " + e.getMessage());
		} finally {
			System.out.println("예외 상관없이 처리");
		}
		System.out.println("예외 위임 처리 종료");
		

	}

}
