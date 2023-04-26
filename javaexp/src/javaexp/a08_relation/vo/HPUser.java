package javaexp.a08_relation.vo;

public class HPUser {
	private String name;
	private HandPhone hp;
	
	public HPUser() {
		// TODO Auto-generated constructor stub
	}
	
	// 핸드폰 객체 구매
	// 필드에 선언되어 있는 HandPhone 메모리에 실제 객체가 할당되어 처리하는 메서드
	// us01.buyPhone(new HandPhone());
	public void buyPhone(HandPhone hp) {
		this.hp = hp;
		System.out.println(hp.getProCompany() + "사 핸드폰을");
		System.out.println(hp.getPrice() + "원으로 구매하다.");
	}

	// 핸드폰으로 전화
	public void callByPhone() {
		System.out.println(name + "가 핸드폰을 사용하려 한다.");
		if(hp == null) {
			System.out.println("구매하지 않아 사용 불가");
		} else { // hp 메모리가 있을 때 -> hp!=null
			hp.usingPhone();
		}
		
	}
	
	// 핸드폰 정보 확인
	public void checkMyPhoneInfo() {
		
	}
	
	public HPUser(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HandPhone getHp() {
		return hp;
	}
	public void setHp(HandPhone hp) {
		this.hp = hp;
	}
	
}
