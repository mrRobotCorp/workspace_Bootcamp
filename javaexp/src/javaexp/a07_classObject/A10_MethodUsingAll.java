package javaexp.a07_classObject;

public class A10_MethodUsingAll {

	public static void main(String[] args) {
		ShoppingMall sm = new ShoppingMall();
		
		String ret = sm.login("hi", "111");
		System.out.println("결과 : " + ret);
		System.out.println("결과 : " + sm.login("ji", "222"));
		
		// isAdult(나이 입력) 성인/미성년자 18세 이상을 기준으로 구분 출력
		System.out.println(sm.isAdult(20));
		System.out.println(sm.isAdult(49));
		System.out.println(sm.isAdult(14));
		
	}
	
}
class ShoppingMall {
	// 입력 id, pass
	String login(String id, String pass) {
		String result = "로그인 실패";
		// 로직 처리 : 아이디와 패스워드 맞을 때만 로그인 성공, 아니면 위 기본 값(로그인 실패) 리턴
		if(id.equals("hi") && pass.equals("111")) {
			result = "로그인 성공";
		}
		return result;
	}
	
	String isAdult(int age) {
		String result = "미성년자";
		
		if(age >= 18 ) {
			result = "성인";
		}
	
		return result;
	}
}
