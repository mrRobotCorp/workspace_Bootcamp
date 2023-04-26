package javaexp.a09_inherit.vo;

public class Mother {
	String charac = "현명하다";
	private int height = 170;
	
	public void skill() {
		System.out.println("make money");
	}
	
	void checkHeight(int height) {
		this.height += height;
		System.out.println("신장 : " + (height>0?"더 크다":"같거나 작다"));
	}
	
	int getHeight() {
		return height;
	}
}
