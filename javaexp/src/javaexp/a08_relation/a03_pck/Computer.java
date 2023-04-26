package javaexp.a08_relation.a03_pck;

import javaexp.a08_relation.a04_pck.Mouse;

public class Computer {
	Mouse m01;
//	KeyBoard k01;
	void call() {
		m01 = new Mouse(3, "abc");
		
//		m01.Mou2("", 3);
	}
	
	// ex) Mouse에 생성자를 오버로딩 규칙에 따라 2개 public/X 선언
	// call()에서 객체 생성 여부 확인
}

