package javaexp.a01_begin;

public class A09_UsingVar {
	int num02; // 클레스명 바로 밑에 있는 변수가 클래스의 전역변수
	
	public static void main(String[] args) {
		/*
		 * #변수명 사용
		 * 1. 변수는 초기화하여 읽기, 쓰기 가능 - 클래스 안에서는 자동 초기화됨
		 *  ps) 초기화란 변수에 데이터를 처음 할당하는 것. 숫자형 데이터 0 할당이 일반적.
		 *  	그외 boolean은 false 이외는 모두 객체형, 객체형 초기값은 null로 설정.
		 * 
		 * */
		
		int num01; // 지역변수

//		int -> char -> char[] -> String
		String name = null;
		Person p01 = null;
		Person p02 = new Person();
		
		System.out.println(p01);
		System.out.println(p02);
		
		long ex = 2100000000l; long exx = 1500000000l;

		long total = ex+exx;

		System.out.println(total);

	}

}


class Person {}
