package javaexp.a10_exception;

public class A02_BasicException {

	public static void main(String[] args) {
		// ex) 1단계. A02_BasicException.java 생성 후, try{}catch 블럭 안에 각 라인 표시. 
		// 특정 라인에 1/0 코드를 넣어 에러 발생 시키기. 추리 내용을 수행 하게 할 것. 
		// 2단계. try{}안에 1~100 for문으로 처리하여 50일 때 1/0코드가 수행되게 할 것.
		
		try {
			System.out.println("line1");
			System.out.println("line2");
			System.out.println(1/0);
			System.out.println("line3");
			System.out.println("line4");
		} catch (Exception e) {
			System.out.println("line5");
			System.out.println("에러 내용 : " + e.getMessage());
			System.out.println("line6");
		}
		System.out.println("--- 예외 처리 후 내용 ---");
		System.out.println("line7");
		System.out.println("line8");
		
		try {
			for(int i=1; i<=100; i++) {
				System.out.println(i);
				if(i == 50) { 
					System.out.println(1/0);
				}
			}
		} catch(Exception e) {
			System.out.println("1/0을 처리하여 예외 발생");
		}

	}

}
