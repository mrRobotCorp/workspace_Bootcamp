package javaexp.a11_api;

public class A03_StringMethod {

	public static void main(String[] args) {
		String greet = "Hi, Hru";
		// 문자열의 특정 위치 리턴
		System.out.println(greet.charAt(0));
		System.out.println(greet.charAt(1));
		
		for(int i=0; i<greet.length(); i++) {
			System.out.print(greet.charAt(i) + "\t");
		}
		System.out.println();
			
		// 생년월일 데이터를 charAt을 이용하여 연, 월, 일 출력
		String data = "1991/10/23";
		
		for(int i=0; i<data.length(); i++) {
			System.out.print(data.charAt(i));
			if(i == 3) System.out.print("년\t");
			if(i == 6) System.out.print("월\t");
			if(i == data.length()-1) System.out.print("일\t");
		}
		
		System.out.println();
		
		for(int i=0; i<4; i++) {
			System.out.print(data.charAt(i));
			if(i == 3) System.out.print("년\t");
		}
		for(int i=5; i<7; i++) {
			System.out.print(data.charAt(i));
			if(i == 6) System.out.print("월\t");
		}
		for(int i=8; i<data.length(); i++) {
			System.out.print(data.charAt(i));
			if(i == data.length()-1) System.out.print("일\t");
		}
		
		System.out.println();
//		-----------------------------------------------------------
		char[] birth = new char[11];
		birth[0] = data.charAt(0);
		birth[1] = data.charAt(1);
		birth[2] = data.charAt(2);
		birth[3] = data.charAt(3);
		birth[4] = '년';
		birth[5] = data.charAt(5);
		birth[6] = data.charAt(6);
		birth[7] = '월';
		birth[8] = data.charAt(8);
		birth[9] = data.charAt(9);
		birth[10] = '일';
		String birthStr = new String(birth);
		System.out.println(birthStr);
		
		String str1 = "Hello";
		byte[] bytes01 = str1.getBytes();
		for(byte b:bytes01) {
			System.out.print(b + " (" + (char)b + "), ");
		}
		System.out.println();
		
		

	}

}
