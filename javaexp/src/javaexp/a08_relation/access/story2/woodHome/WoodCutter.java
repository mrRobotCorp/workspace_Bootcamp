package javaexp.a08_relation.access.story2.woodHome;

public class WoodCutter {
	// 접근제어가의 목적은 자바의 은닉성을 위함
	/// 기타 참조변수.필드, 참조변수.메서드는 아래의 내용에 따라 접근 가능
	// ex) wc.privSec; wc.outHomeSec;
	private String privSec = "personal secret";
	String ourHomeSec = "family secret";
	protected String inheritSec = "inherit money";
	// 상속으로 사용될 때, 외부 패키지에서 호출 가능
	// 주의) 상속이 아니고 객체생성 참조변수로 사용할 때는 외부 패키지에서 접근 불가
	public String announce = "daughter’s marriage";
	
	public void callWoodInfo() {
		System.out.println("private : " + privSec);
		System.out.println("default : " + ourHomeSec);
		System.out.println("protected : " + inheritSec);
		System.out.println("public : " + announce);
	}
	
}
