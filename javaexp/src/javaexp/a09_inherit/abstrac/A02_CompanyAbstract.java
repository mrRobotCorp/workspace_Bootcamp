package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A02_CompanyAbstract {

	public static void main(String[] args) {
		/*
		ex) 상위 추상 클래스 Company - 필드 회사명, working() 공통, earnMoney() 돈 버는 방법 - 추상
			하위 실제 클래스 HyunDai, Samsung
		*/
		ArrayList<Company> com1 = new ArrayList<Company>();
		com1.add(new HyunDai());
		com1.add(new Samsung());
		
		for(Company c:com1) {
			c.earnMoney();
		}

	}

}

abstract class Company {
	private String cname;

	public Company(String cname) {
		this.cname = cname;
	}

	public void working() {
		System.out.println(cname + "이/가 일을 한다.");
	}
	
	public abstract void earnMoney();

	public String getCname() {
		return cname + " 회사가 ";
	}
	
	
}

class HyunDai extends Company {

	public HyunDai() {
		super("현대");
	}

	@Override
	public void earnMoney() {
		super.working();
		System.out.println(getCname() +" 현카 슈퍼 콘서트로 make money...");
		
	}
	
}

class Samsung extends Company {

	public Samsung() {
		super("삼성");
	}

	@Override
	public void earnMoney() {
		super.working();
		System.out.println(getCname() + "반도체 기술로 make money...");
		
	}
	
}
