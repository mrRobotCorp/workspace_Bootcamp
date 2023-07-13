package a01_diexp.z01_vo;

import java.util.List;

public class ShoppingMall {
	private String sname;
	private List<Member> mlist;
	
	//회원 리스트(회원 아이디, 이름, 권한, 포인트)
	public void showMemberList() {
		System.out.println(sname + "에서 쇼핑한 회원");
		if(mlist.size() > 0) {
			for(Member m:mlist) {
				System.out.print(m.getId() + "\t");
				System.out.print(m.getMname() + "\t");
				System.out.print(m.getAuth() + "\t");
				System.out.println(m.getPoint());
			}
		} else {
			System.out.println("회원이 없습니다.");
		}
	}
	
	public ShoppingMall(String sname) {
		this.sname = sname;
	}
	public ShoppingMall() {
		// TODO Auto-generated constructor stub
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Member> getMlist() {
		return mlist;
	}
	public void setMlist(List<Member> mlist) {
		this.mlist = mlist;
	}
	
	
}
