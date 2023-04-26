package javaexp.a01_begin;

public class A12_StringTypeChange {

	public static void main(String[] args) {
		
//		ex) 파일에 저장된 숫자, 네트워크를 통해 전달되는 숫자 -> 문자열형 (3000^2000^4000 -> "3000" -> 3000 )
		
		int num01 = Integer.parseInt("25");
		System.out.println(num01);
		
		String num02Str = "30.5"; // 반드시 정수형 문자열이어야 함
//		int num02 = Integer.parseInt(num02Str);
//		컴파일은 가능하지만 실행 시 에러 발생 - 런타임 에러
//		System.out.println(num02+20);
		
//		문자형인 숫자를 parseDouble로 실수 숫자 데이터로 형변환
		double num02 = Double.parseDouble(num02Str);
		
//		형변환된 값은 숫자이므로 연산이 되어져 출력
		System.out.println(num02+30.7); // 61.2 출력
		
//		실수형변환에서 정수형문자열 전환 가능
//		실수를 연산해야 하므로 앞의 값도 parseDouble을 토해 실수형 데이터로 변환
		System.out.println(Double.parseDouble("30")+0.7); // 30.7 출력
		
//		ex) 문자열 "70", "20"을 정수형으로 형변환, 합산된 결과를 출력.
//		ex02) 문자열 "30.7"과 "40.2"를 실수형으로 형변환하여 합산
		
		String ex101 = "70";
		String ex102 = "20";
		
		int ex1011 = Integer.parseInt(ex101);
		int ex1022 = Integer.parseInt(ex102);
		
		System.out.print("ex1 : ");
		System.out.println(ex1011 + ex1022);
		
//		------------------------------------------
		String ex201 = "30.7";
		String ex202 = "40.2";
		
		double ex2011 = Double.parseDouble(ex201);
		double ex2022 = Double.parseDouble(ex202);
		
		System.out.print("ex2 : ");
		System.out.println(ex2011 + ex2022);

		
	}

}
