package javaexp.a08_relation.vo;

public class CarRacer {
	// 필드 : 이름, Car 
	// 메서드 : buyCar()
	//			drivingCar()
	// 			Car 객체가 있으면 @@가 차를 운행
	// 			차가 없습니다.
	private String name;
	private Car car; // Car 클래스에서 할당될 메모리 타입 Car의 car로 설정
	
	public CarRacer() {
		// TODO Auto-generated constructor stub
	}

	public CarRacer(String name) {
		this.name = name;
	}
	
	public void buyCar(Car car) {
		this.car = car;
		System.out.println(name + "" + car.getKind() + " 차를 구매하다.");
	}
	
	public void drivingCar() {
		System.out.println(name + " 운행하려 한다.");
		if(car != null) {
			car.driving();
		} else {
			System.out.println("차가 없습니다.");
		}
	}

	public CarRacer(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
 	
	
}
