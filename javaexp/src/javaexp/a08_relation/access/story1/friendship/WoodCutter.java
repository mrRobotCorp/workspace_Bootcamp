package javaexp.a08_relation.access.story1.friendship;

public class WoodCutter {
	// 내부 클래스의 전역변수로만 사용, 외부 클래스에선 직접 호출 불가능
	private String hiddenCloth = "뒷동안 바위 밑";
	// X (default) - 접근 제어자가 없는 유형
	String hiddenDeer = "뒤쪽 덤불 속";
//	public WoodCutter() {} -> default 생성자에 의해 자동생성되는 생성자 형태
}
