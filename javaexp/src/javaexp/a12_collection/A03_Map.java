package javaexp.a12_collection;

import java.util.HashMap;
import java.util.Map;

public class A03_Map {

	public static void main(String[] args) {
		//문자열 key, 문자열 value로 설정 map 선언과 할당
		Map<String, String> map01 = new HashMap<String, String>();
		map01.put("1000", "name1");
		map01.put("1000", "name2"); // 키를 중복 처리
		map01.put("1002", "name3");
		map01.put("1003", "name3"); // 값을 중복 처리
		
		// map01.keySey() 키를 Set 객체로 가져오는 메서드
		for(String key:map01.keySet()) {
			System.out.print(key + "\t");
			// map01.get(key) : 해당 키의 값을 가져옴
			System.out.println(map01.get(key));
		}
		// 중복된 키 값은 마지막에 정의된 키값으로 출력(중복 키 모두 출력X) 값은 중복되어 모두 가져옴.
		// 키의 중복은 최종 입력된 것을 기준으로 처리됨.
		
		// ex) 물건명과 가격을 key/value 형식으로 설정해서 Map에 할당
		// 물건명이 중복된 것과 가격이 중복된 것을 입력하고 그 결과 출력
		Map<String, Integer> prod = new HashMap<String, Integer>();
		// Integer i = 300; <- autoBoxing
		// int num = i; <- autoUnBoxing
		prod.put("milk", 100);
		prod.put("cheese", 100);
		prod.put("cake", 100);
		prod.put("cake", 100);
		
		for(String p:prod.keySet()) {
			System.out.print(p + "\t");
			System.out.println(prod.get(p));
		}
		// 중복된 키 값은 마지막 입력 값만 출력(100, cheese), 중복된 value는 두 개 모두 출력
	}

}
