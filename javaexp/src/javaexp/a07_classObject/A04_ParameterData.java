package javaexp.a07_classObject;

public class A04_ParameterData {
	
	// 생성자, 메서드
	// static : 객체 생성 없이 사용 키워드
	// void : 리턴값 없이 사용 메서드
	static void call(int num01) {
		System.out.println("매개변수로 온 숫자 : " + num01);
	}
	// 하단에서 호출할 때, 어떤 메서드를 호출하지 구분이 안되기 때문에 선언 할 수 X.
	// 변수명은 이름만으로 식별하지만, 함수형은 이름+매개변수로 식별하여 호출할 수 있음.
	static void call(int num01, int num02) {
		System.out.println("매개변수로 온 숫자 : " + num01);
	} // 위 아래 call 매서드의 이름은 동일하지만 매개변수의 갯수가 다르므로 에러X, 선언 가능. -> overloading
	static void call(String num01) {
		System.out.println("매개변수로 온 숫자 : " + num01);
	} // 위 call함수의 매개변수는 int로 데이터 유형이 다르므로 선언 가능.
	
	
	static void call02 (double num02) {
		System.out.println("매개 변수로 온 숫자 : " + num02);
	}
	
	static void call03(String name, int age) {
		System.out.println("-- 두 개의 매개변수로 온 함수 --");
		System.out.print(name + ", ");
		System.out.println(age);
	}
	
	public static void main(String[] args) {
//		call("a"); -> X. == int num = "a";
		call(25); 
		call((int)25.5); // casting 하여 데이터 유형 맞춰서 매개변수로 설정
		call02(10.5);
		call02(10); // double이 int 보다 데이터 유형이 더 크기 때문에 실행 가능
		call03("a", 10); // 매개변수로 받는 데이터 유형과 갯수를 맞춰서 설정1
		
	}

}
