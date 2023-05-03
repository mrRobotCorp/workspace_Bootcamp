package javaexp.a12_collection;

import java.util.Set;
import java.util.HashSet;

public class A02_Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("오렌지");
		set.add("오렌지");
		set.add("수박");
		set.add("수박");
		set.add("딸기");
		set.add("딸기");
		System.out.println("-- 저장된 set 데이터 --");
		for(String f:set) {
			System.out.println(f);
		}
		
		// ex) 주머니 속에 빨강 구슬 2개, 파랑 구슬 3개, 노랑 구슬 2개 넣기
		// Set으로 할당하여 현재 주머니 속 구슬의 종류 출력
		Set<String> pocket = new HashSet<String>();
		pocket.add("red");
		pocket.add("red");
		pocket.add("blue");
		pocket.add("blue");
		pocket.add("blue");
		pocket.add("yellow");
		pocket.add("yellow");
		
		for(String c:pocket) {
			System.out.println(c);
		}

	}

}