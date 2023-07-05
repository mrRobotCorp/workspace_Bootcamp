package backendWeb.z01_vo;
// backWeb2.z01_vo.Product


public class Product {
	private String name;
	private int price;
	private int cnt;
	private String prodInfo;
	
	private double tot;
	private double ratio;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int price, int ratio ,int tot) {
		this.price = price;
		this.tot = tot;
		this.ratio = ratio;
	}


	public Product(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}

	public Product(String name, int price, int cnt, String prodInfo) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		this.prodInfo = prodInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getProdInfo() {
		return prodInfo;
	}
	public void setProdInfo(String prodInfo) {
		this.prodInfo = prodInfo;
	}
	
}
