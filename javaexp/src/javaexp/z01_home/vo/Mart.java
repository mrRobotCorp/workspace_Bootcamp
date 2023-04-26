package javaexp.z01_home.vo;

public class Mart {
	private String pname;
	private int price;
	private int cnt;
	
	public Mart(String pname, int price, int cnt) {
		super();
		this.pname = pname;
		this.price = price;
		this.cnt = cnt;
	}

	public Mart() {
		// TODO Auto-generated constructor stub
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}