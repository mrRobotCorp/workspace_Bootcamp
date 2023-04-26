package javaexp.a08_relation;
// 외부 패키지에서 사용 할 객체 package 밑에 
import javaexp.a02_begin.A01_HelloJava;

// 1. 모든 클래스는 패키지를 가지고 있음
// 2. 순수한 객체는 패키지명.클래스가 실제 객체의 이름.

public class A01_Begin {

	public static void main(String[] args) {
		A01_Begin b1 = new A01_Begin();
		// 패키지명.클래스명@16진수주소값
		System.out.println(b1);
		// 같은 곳에서 동일 이름의 class를 호출할 때는 패키지.클래스명

	}

}
