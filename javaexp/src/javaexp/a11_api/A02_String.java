package javaexp.a11_api;

public class A02_String {

	public static void main(String[] args) {
//		char [] arr = {'H', 'e', 'l', 'l', 'o'};
//		String str = new String(arr);
//		System.out.println("문자열 데이터 생성 : " + str);
//		byte [] arr1 = new byte[8];
//		
//		for(int i = 0; i <= 255; i++) {
//			System.out.println(i + "\t" + (char)i);
//		}
//		
//		// 대문자의 범위 65 - 90, 소문자 범위 97 - 122, 숫자 48 - 57
//		// 65 - 90 -> (int)(Math.random * 26 + 65)
//		for(int i = 1; i <= arr1.length; i++) {
//			int num = (int)(Math.random() * 26 + 65);
//			System.out.print(i + "번째 임의의 수 : " + num);
//			System.out.println("\t" + (char)num);
//		}
//		
//		for(int i = 1; i <= arr1.length; i++) {
//			byte num = (byte)(Math.random() * 26 + 65);
//			System.out.print(i + 1 + "번째 임의의 수 : " + num);
//			System.out.println("\t" + (char)num);
//			arr1[i] = num;
//		}
//		String str2 = new String(arr1);
//		System.out.println("알파벳 임의 문자 : " + str2);
//		
//		char [] arr2 = new char[8];
//		for(int i =0; i<arr2.length; i++) {
//			arr2[i] = (char)(Math.random() * 26 + 65);
//		}
//		
//		String str3 = new String(arr2);
//		System.out.println("알파벳 임의 문자 : " + str3);
//		
//		// 알파벳 대문자 A-Z 임의로 8자리 생성
//		// 알파벳 소/대문자
//		// 알파벳 소/대문자/숫자 -> 과제
//		// 대문자의 범위 65 - 90, 소문자 범위 97 - 122, 숫자 48 - 57
//		
//		char[] arr3 = new char[8];
//		for(int i=0; i<arr3.length; i++) {
//			int ranNum = (int)(Math.random() * 52 + 65); // 대문자, 소문자 26자 합쳐서 52개의 경우의 수
//			// 특수문자인 91~96의 범위는 제외하고 출력
//			// 랜덤 수가 90이 넘어가면 6을 더하여 소문자 범위 코드로 설정
//			if(ranNum > 90) {
//				ranNum+= 6;
//			}
//			arr3[i] = (char)ranNum;
//			
//		}
//		String str4 = new String(arr3);
//		System.out.println("알파벳 대소문 임의 : " + str4);
		
//		--------------------------------------------------------
		char [] arr = {'H','e','l','l','o'};
		String str = new String(arr);
		System.out.println("문자열 데이터 생성:"+str);
		byte [] arr1 = new byte[8];
		for(int cnt=0;cnt<=255;cnt++) {
			System.out.println(cnt+"\t"+(char)cnt);
		}
		//   숫자 48~57 대문자의 범위 65~90, 소문자의 범위 97~122,
		// 65~90 ==> (int)(Math.random()*26 + 65)
		for(int idx=0;idx<arr1.length;idx++) {
			byte num = (byte)(Math.random()*26 + 65);
			System.out.print(idx+1+"번째 임의의 수:"+num);
			System.out.println("\t"+(char)num);
			arr1[idx] = num;
		}
		String str2 = new String(arr1);
		System.out.println("알파벳 임의 문자:"+str2);
		// char[] 8들어 갈수 있는 배열
		char [] arr2 = new char[8];
		for(int idx=0;idx<arr2.length;idx++) {
			                  // 65~90 
			arr2[idx] = (char)(Math.random()*26 + 65);
		}
		String str3 = new String(arr2);
		System.out.println("알파벳 임의 문자:"+str3);	
		// 알파벳 대문자 A~Z임의로 8자리 생성..: 대문자의 범위 65~90,
		// 알파벳 소/대문자   대문자의 범위 65~90, 소문자의 범위 97~122 
		char [] arr3 = new char[8];
		for(int idx=0;idx<arr3.length;idx++) {
			int ranNum = (int)(Math.random()*52+65);
			// ranNum  65 ~ 116
			if(ranNum>90) ranNum+=6;
			arr3[idx] = (char)ranNum;
		}
		String str4 = new String(arr3);
		System.out.println("알파벳 대소문 임의:"+str4);	
		// 알파벳 소/대문자/숫자 ==> 과제?? 
		// 숫자 48~57 대문자의 범위 65~90, 소문자의 범위 97~122,
		
		
	}

}
