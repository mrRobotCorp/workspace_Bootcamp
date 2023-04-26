package javaexp.a06_memory;

public class A01_Start {

	public static void main(String[] args) {
		/*
		 # 자바에서 사용하는 대표적인 메모리 stack과 heap
		 1. 개요
		 	1) 한 공간에 데이터를 저장할 때 어떻게 저장하는 것이 효율적인가.
		 	2) 작은/큰 데이터, stick(내용붙임)
		 	3) 큰 데이터를 보관하는 공간을 따로 만들고, 작은 데이터는 바로 할당할 수 있게 처리. -> stack, heap
		 	4) 작은 데이터의 저장과 큰 데이터의 저장된 위치 -> stack의 메모리
		 	5) 큰 데이터의 실제 저장 -> heap 메모리
		 		cf) 도서관과 서점에 실제 도서가 있는 곳이 heap, 단말기(컴퓨터)에 위치값이 저장되어 그 위치값을 출력해주는 것이 stack
			6) stack 영역만 쓰는 데이터와 stack과 heap영역을 쓰는 데이터의 구분 기준은 일정하게 한정되어 있는 데이터(기본유형) /
				확장성이 있는 데이터(객체유형) 으로 나뉜다.
				객체 - 기본 유형이 배열로 선언 
					(문자열String, 내장된 api객체Scanner..Integer.Double. Math, class를 선언하여 호출하는 객체)
		2. 객체 유형의 데이터들
		 1) 메모리 - stack과 heap영역 모두 사용하는 데이터
		 2) 객체는 생성되면(new 키워드로) heap영역에 특정한 위치에 저장된다. 이 특정한 위치를 보통 16진수로 설정하고
		 	이 위치값을 저장하는 메모리가 stack 영역.
	 	 3) 종류
	 	 	- 배열형 데이터 
	 	 		ex) new int[5]; {100, 200} / new String(); 문자열(문자배열형) / new String[2]; {"a", "b"}
	 	 			new Person[2]; {new Person(), new Person()}
	 	 			array[0] : 배열은 index로 0부터 시작하는 번호로 구분 / array[1] / array.length : 배열의 길이를 나타냄
 			- 내장된 api 객체
 			- class로 선언하여 호출하는 사용자 정의 객체
 	
		 */

	}

}
