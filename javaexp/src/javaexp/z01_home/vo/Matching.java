package javaexp.z01_home.vo;

public class Matching {
	private Woman woman;
	private Man man;
	public Matching() {
		// TODO Auto-generated constructor stub
	}
	public Matching(Woman woman, Man man) {
		this.woman = woman;
		this.man = man;
	}
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	
	public void inMan(Man man) {
		this.man = man;
		System.out.println("남성 멤버가 들어왔습니다.");
	}
	
	public void inWoman(Woman woman) {
		this.woman = woman;
		System.out.println("여성 멤버가 들어왔습니다.");
	}
	
	public void showMatch() {
		if(woman == null || man == null ) {
			System.out.println("매칭 실패");
		} else {
			System.out.println("매칭 성공");
			woman.showInfo();
			man.showInfo();
		}
	}
}
