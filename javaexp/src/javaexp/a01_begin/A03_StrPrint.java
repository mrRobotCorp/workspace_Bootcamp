package javaexp.a01_begin;

public class A03_StrPrint {

	public static void main(String[] args) {
		/*
		 # 문자열 출력 특수 문자
		 1. \t -> 탭간격 출력명령어
		 2. \n -> 줄바꿈 명령어
		 3. \" -> ""사이 문자열 안에 " 표시 
		
		 */
		System.out.println("김윤아\t엥\t엥");
		System.out.println("100\t90\t80");
		System.out.println("hi\nhello\nbye");
		System.out.println("takeMeHome\"please\"");
//		ex) 다음과 같이 출력
//		국어	영어	수학
//		90	80	90
//		-------------------------
//		내가 아는 학교 친구들
//		1. 한소희
//		2. 송혜교
//		3. 김혜수 -> 한라인에 문자열 표현
//		---------------------------
//		오늘은 "자바프로그래밍 과정 시작"
		
		System.out.println("국어\t영어\t수학");
		System.out.println("90\t80\t90");
		System.out.println("내가 아는 학교 친구들\n1.한소희\n2.송혜교\n3.김혜수");
		System.out.println("오늘은 \"자바프로그래밍 과정 시작\"");
		
		
	}

}
