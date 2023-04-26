package javaexp.a07_classObject;

public class A07_Method {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int re01 = c1.plus(30, 25);

		System.out.println("최종 리턴값 : " + re01);
		
		MRExp r1 = new MRExp();
		System.out.println("문자열 리턴값 : " + r1.reStr01());
		
		String calRet = r1.reStr01();
		System.out.println(calRet);
		
		// 바로 출력
		System.out.println(r1.intExp());
		// 변수에 넣고 출력
		int intEx = r1.intExp();
		System.out.println(intEx);
		
		MRExp m01 = new MRExp("user", 20);
		System.out.println("이름 메서드의 리턴 값 : " + m01.getName());
		System.out.println("나이 메서드의 리턴 값 : " + m01.getAge());		
		int intAge = m01.getAge();
		System.out.println(intAge);
		
		MRExp2 ex01 = new MRExp2("nameJoe", "pizza");
		System.out.println("getId의 출력 값 : " + ex01.getId());
		System.out.println("getPw의 출력 값 : " + ex01.getPw());
		System.out.println("getIdPw의 출력 값 : " + ex01.getIdPw());
		
		
	}

}
// ex) class MRExp2 선언하고 필드로, 회원의 아이디, 패스워드 설정. 생성자로 초기화.
//		매서드1 getId(), 메서드2 getPass(), 메서드3 getIdPw() id, pw를 ##/## 형식으로 가져오기
//		main()에서 호출 출력

class MRExp2 {
	String id;
	String pw;
	
	String getId() {
		return id;
	}
	
	String getPw() {
		return pw;
	}
	
	String getIdPw() {
		return(id + " / " + pw) ;
	}
	
	public MRExp2() {
	}
	
	public MRExp2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}

class MRExp {
	String name;
	int age;
	
	public MRExp() {
	}
	
	public MRExp(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String getName() {
		return name;
	}
	// 나이를 리턴하는 메서드 생성, main()에서 호출 + 출력
	int getAge() {
		return age;
	}
 	
	// 문자열 리턴
	String reStr01() {
		return "abcdefu";
	}
	
	// 정수 100을 리턴하는 메서드 정의, 위 메인 메서드에서 바로 출력. + 변수에 넣고 호출
	int intExp() {
		return 100;
	}
}

class Calculator {
	int num01;
	int num02;
	
	public Calculator() {
	}
	
	public Calculator(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	
	int plus(int num01, int num02) {
		// 위 () 속 지역변수를 아래 전역변수에 할당
		this.num01 = num01;
		this.num02 = num02;
		
		// 덧셈 결과를 total 지역변수에 할당
		int total = this.num01 + this.num02;
		// 합산 결과를 return 처리. 이 메서드를 호출한 곳에 전달
		return total;
		
	}
	
}

