package javaexp.a10_exception;

import java.io.IOException;
import java.io.InputStream;

public class A06_CompileException {

	public static void main(String[] args) {
		try {
			System.out.println("-- 컴파일 시 예외 발생 --");
//			Class.forName("javaexp.a10_exception.A06_CompileException"); // 존재하는 class이기에 에러X.
			Class.forName("aa.bb"); // class 이름 탐색하는 메서드
		} catch (ClassNotFoundException e) {
			System.out.println("예외 내용 : " + e.getMessage());
			System.out.println("예외가 처리되는 경로 trace");
//			e.printStackTrace(); -> 예외(에러) 내용 출력
		}
		System.out.println("프로그램 종료");
		
		// 아래 코드를 이용하여 컴파일 예외 처리
		InputStream is = System.in;
		
		// 컴파일 예외는
		// 1. throws를 통해 예외를 메서드 옆에서 위임하여 처리하거나
		// 2. try{}catch 구문으로 예외를 바로 처리하는 코드가 자동으로 생성됨.
		
		try {
			is.read();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("그 외 모든 예외 처리");
		}
		
		try {
			System.out.print("데이터 입력");
			System.out.println(is.read());
		} catch(IOException e) {
			System.out.println("예외 내용 : " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");
		
		
	}

}
