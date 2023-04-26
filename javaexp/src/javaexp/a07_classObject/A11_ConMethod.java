package javaexp.a07_classObject;

public class A11_ConMethod {

	public static void main(String[] args) {
		Car c1 = new Car("그랜저");
		c1.driving();
		c1.addFuel(20);
		System.out.println("현재 속도 : " + c1.stepPadal() + "km/h"); 
		System.out.println("현재 속도 : " + c1.stepPadal() + "km/h"); 
		System.out.println("현재 속도 : " + c1.stepPadal() + "km/h"); 
		c1.driving();
		c1.driving();
		
		Calculator02 n1 = new Calculator02(12, 3);
		System.out.println("플러스 값 : " + n1.plus());
		System.out.println("마이너스 값 : " + n1.minus());
		System.out.println("곱한 값 : " + n1.multi());
		System.out.println("나눈 값 : " + n1.divide());
	}

}
// ex) Calculator안에 생성자를 통해 변수 2개 받아, 기능 메서드 plus(), minus(), multi(), divide()
//		출력을 nn + nn, 연산 결과 리턴 처리. 리턴 받은 데이터 외부에서 결과 출력
class Calculator02 {
	int num1;
	int num2;
	
	public Calculator02(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int plus() {
		int plusR = num1 + num2;
		System.out.println(num1 + " + " + num2);
		return plusR;
	}
	
	int minus() {
		int minusR = num1 - num2;
		System.out.println(num1 + " - " + num2);
		return minusR;
	}
	
	int multi() {
		int multiR = num1 * num2;
		System.out.println(num1 + " X " + num2);
		return multiR;
	}
	
	int divide() {
		// 나눗셈의 경우 0으로 나누면 예외가 나오기 때문에 삼항연산자로 처리
		int divideR = num2==0?0:num1/num2;
		System.out.println(num1 + " / " + num2);
		return divideR;
	}
}


class Car{
	int speed;
	int fuel;
	String kind;
	
	public Car() {	
	}
	
	public Car(String kind) {
		this.kind = kind;
	}
	
	void addFuel(int cc) {
		// 기름 주입
		fuel += cc;
		System.out.println("주입한 양 : " + cc);
	}
	
	int getFuel() {
		// 실제 기름양 확인
		return fuel;
	}
	
	int stepPadal() {
		System.out.println("엑셀을 밟다.");
		fuel+=10;
		return speed;
	}
	
	void driving() {

		if(fuel > 0 && speed > 0) {
			System.out.println(kind + "차가 운행중이다.");
			fuel -= 10;
			System.out.println("운행하여 휘발유 감소, 현재 : " + fuel + "cc");
		} else {
			if(fuel <= 0 ) {
				System.out.println("휘발유가 없다.");
			}
			if(speed <= 0) {
				System.out.println("속도를 올려야 한다.");
			}
		} 
	}
	
	
}
