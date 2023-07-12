package a01_diexp.z01_vo;

public class Car {
	//Car 차종 배기량 최고속도
	private String cname;
	private int cc;
	private int speed;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String cname, int cc, int speed) {
		this.cname = cname;
		this.cc = cc;
		this.speed = speed;
	}
	
	
	
}
