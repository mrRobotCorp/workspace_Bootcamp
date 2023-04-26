package javaexp.a01_begin;

public class A10_DataType {

	public static void main(String[] args) {
		/*
		 * # 자바의 데이터 유형
		 * 1. 기본 데이터 유형 (primitive data type )
		 * 	1) stack 영역에서 바로 할당 사용하는 데이터
		 * 	2) 숫자형
		 * 		- 정수 byte(8bit) - 영문문자를 나타내는 word단위 / char (2byte) / short(2byte) / int(4byte-32) \*default* 
					long(8byte-64)
		 * 		- 실수 - float / double *d* 주의 - 정수의 디폴트는 int, 실수의 디폴트는 double
		 * 		연산자가 포함되면 int 유형 이상으로 사용해야 함.
		 * 		
		 * 	3) 문자형 - 형태는 숫자형 /주의/ 문자형은 기본 데이터 유형, 문자열은 객체 유형.
		 * 		char 2byte 16bit 0~65535
		 * 	4) 논리형 boolean - true / false
		 * 
		 * 2. 객체형 데이터 유형 (object type)
		 * 	1) stack 영역, heap 영역을 사용하는 객체형 데이터 유형
		 * */
		
		
//		int num01 = 999999999999999999999; - 정수 21억을 넘으므로 에러.
		long num01 = 9999999999999999l; // 정수 21억을 넘어선 경우 L을 붙여서 할당
		
//		실수 유형의 경우 기본 유형이 double이기에 float으로 선언하여 할당할 경우 마지막에 f 붙여서 표시.
		float num03 = 3.33f;
		byte num04 = 127; 
		
//		char는 각 코드 값을 가지고 있음.
		for ( int i=0; i<=300; i++) {
			System.out.print(i + ":");
//			번호가 char 에 의해 코드값 변환. 나타나는 코드, char 문자는 숫자로 저장된 후 char로 코드를 나타냄.			
			System.out.println((char)i);
		}
		
		System.out.print("48번 문자 : ");
		System.out.println((char)48);
		System.out.print("문자 '0'의 코드 번호 : ");
		System.out.println((int)'0');
		
//		실무적으로 숫자/알파벳/대소문자 랜덤(random 메소드) 8자 발송하는 임시 비밀번호 시에 활용됨.
		boolean isPass01 = true;
		boolean isPass02 = false;
		boolean isPass03 = 25 > 60;
		System.out.println(isPass01);
		System.out.println(isPass02);
		System.out.println(isPass03);
		
//		자바에서 char유형과 String 구분.
		char code01 = 'A'; // '한 글자만'
		char[] code02 = {'H', 'a', 's', 'e'};
//		자바에서 {}를 통해 배열을 나타냄.
		String str01 = "abc"; // "" 한 글자를 포함한 문자열
		
//		ex) byte 유형으로 25를 할당, int유형으로 3000을 할당. long유형으로 30억 할당, float으로 3.14 할당, 
		byte ex01 = 25;
		int ex02 = 3000;
		long ex03 = 3000000000l;
		float ex04 = 3.14f;
		
		System.out.println("byte 값은 : " + ex01);
		System.out.println("int 값은 : " + ex02);
		System.out.println("long 값은 : " + ex03);
		System.out.println("float 값은 : " + ex04);
		
		for ( int j=48; j<=57; j++) {
			System.out.print(j + ":");
			System.out.println((char)j);
		}
		
		
		
		
		
		
		
	}

}
