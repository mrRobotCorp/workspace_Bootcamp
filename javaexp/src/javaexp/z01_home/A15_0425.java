package javaexp.z01_home;

import java.io.IOException;
import java.io.InputStream;

public class A15_0425 {

	public static void main(String[] args) {
		// 1. 예외 처리의 기본형식 코드는 수행시키고, 해당 코드가 의미하는 바를 구체적으로 기술하세요.
		
		// 예외 처리를 위한 try{}catch(){} 구문
		// try 안에 예외 가능성이 있는 코드를 입력
		try { 
			System.out.println("예외 코드 발생 전");
			System.out.println(1/0); // 예외 코드가 발생하는 즉시 try 안 내용 중단. 바로 아래 라인은 출력X.
			System.out.println("예외 코드 발생 후");
			
		// catch 안에 예외 발생 시 처리 할 내용 입력
		// 매개변수로 예외사항을 받고, 예외 처리를 위한 정보를 기능 메서드를 통해 처리.
		} catch (Exception e) { 
			System.out.println("예외 처리 후 출력");
			System.out.println(e.getMessage());
		}
		
		// 2. args로 입력 받게 하고, 물건명 가격 갯수를 입력 받게 하고 입력이 없을 시  "물건정보를 입력하세요!" 
		// 라고 예외 처리로 처리되게 하세요.
		
		try {
			System.out.println("물건명, 가격, 갯수를 입력하세요");
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("물건 정보를 입력하세요!");
		}
		
		
		// 3. 실행예외와 컴파일예외의 차이점을 예제로 설명하세요.
			
			// 실행 예외
			try {
				System.out.println(1/0);
			} catch(ArithmeticException e) {
				System.out.println("실행 예외 내용 : " + e.getMessage());
			}
			
			// 컴파일 예외
			InputStream is = System.in;
			
			try {
				System.out.print("데이터 입력");
				System.out.println(is.read());
				Class.forName("aa.bb");
			} catch(IOException e) {
				System.out.println("컴파일 예외 내용 : " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("컴파일 예외 내용 : " + e.getMessage());
			}
		
		// 4. 예외처리의 계층 구조에 따른 선언 순서를 기술하세요.
		
			String str01 = "abc";
			try{
				System.out.println(str01.toString());
				System.out.println(args[0]);			
				System.out.println(str01.charAt(4));
				System.out.println(1/0);
			} catch(NullPointerException e) { // 최하위
	
			} catch(ArrayIndexOutOfBoundsException e) { // 차상위
	
			} catch(Exception e) { // 상위
	
			} finally {
				// 예외 유무 상관없이 처리해야 할 코드
			}
			
		// 5. args[0], String name=null;name.toString(); 해당 내용을 구체적 예외는 처리하고, 
		// 그외는 Exception처리하는다중예외를 처리하세요.
			
			try {
				String name = null;
				System.out.println(args[0]);
				System.out.println(name.toString());
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println();
			} catch (NullPointerException e) {
				System.out.println();
			} catch(Exception e) {
				System.out.println("그 외의 예외 처리");
			}

	}

}
