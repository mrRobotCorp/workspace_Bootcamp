package javaexp.z01_util;

public class A01_Input {
	
	public static void main(String[] args) {
		System.out.println("test");

//		마우스 우클릭 run as - run configurations - arguments - program arguments - 배열 입력 - apply - run
//		console에 한 번 이상 결과가 나오는 실행을 거쳐야 가능
		
		System.out.println(args[0]); // 김윤아
		System.out.println(args[1]); // 17
		System.out.println(args.length); // 2
		
		String name = args[0];
		System.out.println(name=="김윤아"); // false
		System.out.println(name.equals("김윤아")); // true
//		String ageStr = args[1];
//		int age = Integer.parseInt(ageStr);
		
		int age = Integer.parseInt(args[1]);
		
//		System.out.println("2년 후 : " + (ageStr + 2)); // 172 
		System.out.println("2년 후 : " + (age + 2)); // 19
		
		
		/*
		 * # 자바의 입력 데이터 처리
		 * 1. String[] args 입력
		 * 	java A01_Input - 실행명령어
		 * 	실행 시, 입력 값을 전달 처리. 
		 * 	java A01_Input 김윤아 17
		 * 	main()의 매개변수로 String[] args = { "김윤아", "17" }; ( 주로 다른 언어의 배열 처리 [], 자바만 {} )
		 * 	배열명 [index 번호 - 0부터 시작]	
		 * 	args[0] -> "김윤아" , args[1] -> "17"
		 *	args.length -> 배열의 길이 2 
		 * 
		 * 
		 * 2. Scanner 객체(내장 api) 활용 
		 * 
		 * 
		 * */

	}

}
