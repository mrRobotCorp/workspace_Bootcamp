package javaexp.a08_relation.access.story1;

import javaexp.a08_relation.access.story1.friendship.WoodCutter;

public class Hunter {
	void callWoodCutterInfo() {
		// 다른 패키지지만 class 자체는 public으로 선언되어 있으므로 WoodCutter 접근은 가능
		WoodCutter wc = null;
		wc = new WoodCutter();
		// default로 선언된 객체(필드)이므로 다른 패키지인 Hunter에선 접근 불가능(에러)
//		System.out.println("default 접근 제어(동일 패키지) : " + wc.hiddenDeer);
		// private은 동일 패키지라도 직접 접근은 불가능, 당연히 다른 패키지인 Hunter에서 되겠냐
//		System.out.println("private 접근 제어(동일 패키지) : " + wc.hiddenCloth);
	}
}	

// a08XX.access -> ourhome 패키지 생성
// Father, Mother, Brother, Mine 클래스 생성
// 디폴트 -> 우리 가족 여행 게획(변수로 할당)
// uncleHome 패키지 생성
// Uncle 클래스 생성 / mine 클래스에 대한 우리 가족 여행 계획 호출 처리 메서드가 가능한 범위 확인