package a01_diexp.z01_vo;

public class CarDriver {
	//CarDriver 자동차 기사 이름 Car 객체
	private String driver;
	private Car car;
	
	public void driveCar() {
		System.out.println("-- 자동차 운전 --");
		System.out.println("운전 기사 : " + driver);
		if(car != null) {
			System.out.println("-- 운전하는 자동차 정보 --");
			System.out.println("차종 : " + car.getCname());
			System.out.println("배기량 : " + car.getCc());
			System.out.println("속도 : " + car.getSpeed());
		} else {
			System.out.println("운전하지 않음");
		}
	}
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void setCar02(Car car) {
		this.car = car;
	}
	
	public CarDriver(String driver) {
		this.driver = driver;
	}
	public CarDriver() {
	}
	
	
}
