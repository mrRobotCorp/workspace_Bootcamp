//package javaexp.z01_home;
//
//import java.util.Scanner;
//
//public class A16_0426 {
//	static void ex03(String[] arry) throws ArrayIndexOutOfBoundsException {
//		String name = arry[0];
//	}
//	
//	public static void main(String[] args) {
//
//		// 1) 예외 처리를 왜 하는지 알고 있나요?
//		/*
//			프로그래밍을 하면서 생기는 여러가지 오류로 인해 신뢰성에 치명적인 문제가 생길 수 있다.
//			이런 위험을 방지하기 위해 오류를 예외 처리하여 대응한다.
//		*/
//		
//		// 2) 예외 처리를 하는 기본 단계별 구조를 설명할 수 있고, 코드할 수 있는지?
//		
//		//	1단계
//			try {
//				System.out.println(1/0); // 예외가 발생할 수 있는 코드
//			} catch(Exception e) {
//				System.out.println("예외 발생하여 처리되는 내용");
//				System.out.println(e.getMessage()); // 예외에 대한 정보를 처리하는 기능 메서드
//			}
//			
//		// 2단계
//			/*
//			try{
//				System.out.println(1/0); // 예외가 발생할 수 있는 코드
//			} catch(최하위 예외 클래스) { // 메모리가 가장 작고 범위가 좁은 클래스 부터
//
//			} catch(차상위 예외 클래스) { 
//
//			} catch(상위 예외 클래스) { // 메모리가 가장 크고 범위가 넓은 클래스
//
//			} finally { // 예외가 발생 상관없이 처리해야 할 지역 영역 처리
//			}
//			*/
//			
//		// 3단계
//			/*
//			void 메소드명() throws 위임 할 예외1, 위임 할 예외2… {
//				예외 처리 가능성이 있는 코드
//			}
//			
//			try {
//				메소드명1() 예외가 위임되어서 호출되는 내용
//				메소드명2()
//			} catch (위임된 예외 처리 클래스1) {
//			} catch(위임된 예외 처리 클래스2) {
//			}
//			*/
//			
//		// 4단계
//			/*
//			class 사용자 정의 예외 클래스 extends Exception {
//				// 생성자 호출 super() : 상위 생성자 활용
//				// 재정의를 통해 기능적 변경 (super.메서드().. )
//				// 추가 기능 메서드 선언
//			}
//			
//			try {
//				if(조건) { // 특정 조건에 사용자 정의 예외를 던지는 코드 처리
//					throw new 사용자 정의 예외();	
//				}
//			} catch(사용자 정의 예외) {
//			}
//			*/
//		// 3) args값이 입력하지 않을 때, 처리되는 메서드를 선언하고, 예외를 위임하세요.
//			try {
//				ex03(args);				
//			} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("예외 위임 처리");
//			}
//			
//		
//		// 4) 아이디 입력시 8자미만 이거나 16자이상시 사용자 정의 예외를 발생하게 처리하세요
//			Scanner sc = new Scanner(System.in);
//			System.out.print("아이디를 입력하세요 : ");
//			String id = sc.nextLine();
//			
//			try {
//				if(id.length() < 8 || id.length() >= 16) {
//					throw new Ex04();
//				}
//				System.out.println("로그인 성공");
//			} catch(Ex04 e) {
//				System.out.println("아이디 값 오류");
//				System.out.println(e.getMessage());
//			} finally {
//				System.out.println("그 외 예외 처리");
//			}
//			
//		// 6. 예외 위임을 코드를 기본 예제와 함께 설명하세요.
//			
//			try {
//				// 위임된 예외를 처리
//				call();
//				
//			} catch (ClassNotFoundException e) {
//				System.out.println("--- 예외 발생 ---");
//				System.out.println("해당 클래스가 없음 -> " + e.getMessage());
//			} finally {
//				System.out.println("예외 발생 상관없이 처리");
//			}
//			
//		// 7. 1~10까지 출력할 때, 짝수인 경우에 사용자 정의 예외가 처리되게 하세요.
//			try {
//				for(int i=1; i<=10; i++) {
//					if(i % 2 == 0) {
//						throw new Ex07("throw 처리");						
//					}
//					System.out.println(i);
//				}
//			} catch (Ex07 e) {
//				System.out.println(e.getMessage());
//			} finally {
//				System.out.println("그 외 예외 처리");
//			}
//			
//	}
//	
//	static void call() throws ClassNotFoundException {
//		System.out.println("ex06");
// 		Class.forName("javaexp.z01_home.A16_0426");
//	}
//
//}
//
//class Ex04 extends Exception {
//	Ex04() {
//		super();
//	}
//	
//	public String getMessage() {
//		String su = super.getMessage();
//		System.out.println("아이디 오류 발생 -> " + su);
//		return su;
//	}
//}
//
//class Ex07 extends Exception {
//	Ex07(String str) {
//		super("짝수 " + str);
//	}
//	
//	public String getMessage() {
//		System.out.println("짝수 발생");
//		return super.getMessage();
//	}
//}
//
//
