package javaexp.a07_classObject;

public class A09_MethodProcess {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		
		// 생성자를 통해 데이터를 처리할 때와 메서드를 통해 데이터를 처리할 때 구분할 것.
		c1.showInfo();
		c1.setData(1000, 2000);
		c1.showInfo();
		
		c1.setData(1200, 2000);
		c1.showInfo();
		c1.addData(2000, 2000); // 1200, 2000 각각 더해진 값 계산
		c1.showInfo();
		
		c1.max(10, 5);
		c1.getLess(18, 33);
		
		c1.showTot(4, 12);
		c1.showTot(2, 10);
		
		c1.getGugu(3, 4);
		c1.getGugu(6, 20);
		
		c1.getBuyMaxCnt(200, 3);
		c1.getBuyMaxCnt(600, 6);
	}

}
class Calculator2 {
	int num01;
	int num02;
	
	public void showInfo() {
		System.out.println("데이터 1 : " + num01);
		System.out.println("데이터 2 : " + num02);
	}
	// 전역 변수에 저장 : 메서드 호출 시마다 변수가 변경 
	public void setData(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	// class ShoppingSite{}, login(String id, String pass) <- 호출 시마다 변수 변경되는 예시
	// buyProd(String pname, int cnt) 
	
	// 전역변수에 누적 저장 : 메서드 호출 시마다 변수가 누적 계산
	public void addData(int num01, int num02) {
		this.num01 += num01;
		this.num02 += num02;
	}
	// class BankSystem{}, addAccount(int pcnt) <- 가입 시 마다 계좌수 누적되는 누적 계산 예시
	// addTotMoney(int money), searchAcc(String assId)  
	
	// 숫자 2개를 받아 더 큰 수를 출력
	public void max(int num1, int num2) {
		System.out.print("첫 번째 수 : " + num1);
		System.out.println(", 두 번째 수 : " + num2);
		
		if(num1 > num2) {
			System.out.println(num1 + "가 더 큰 수이다.");
		} else if(num1 == num2) {
			System.out.println("동일한 수이다.");
		} else {
			System.out.println(num2 + "가 더 큰 수이다.");			
		}
	}
	
	// ex) 2개 수 중에 더 작은 수 출력 getLess()
	public void getLess(int num1, int num2) {
		System.out.print("첫 번째 수 : " + num1);
		System.out.println(", 두 번째 수 : " + num2);
		
		if(num1 < num2) {
			System.out.println("더 작은 수 : " + num1);
		} else if( num1 == num2 ) {
			System.out.println("동일한 수이다.");
		} else {
			System.out.println("더 작은 수 : " + num2);
		}
	}

	// 시작 수와 마지막 수 입력. numbering 하고 총계 출력
	public void showTot(int start, int end) {
		int tot = 0;
		for(int i =start; i<=end; i++) {
			System.out.print(i);
			tot += i; // i는 start 시작 값으로 설정했기 때문에 시작 값에서 누적.
			if(i==end) {
				System.out.println(" = " + tot);
			} else {
				System.out.print(" + ");
			}
		}
	}
	
	// ex) 매개변수를 받아, 두 개의 값을 설정. 해당 2개 단수로 구구단 출력 getGugu(0, 0)
	public void getGugu(int num1, int num2) {
		System.out.println("--- " + num1 + "단 출력 ---");
		for(int i=1; i<=9; i++) {
			System.out.println(num1 + " X " + i + " = " + (num1*i));
		}
		System.out.println("--- " + num2 + "단 출력 ---");
		for(int i=1; i<=9; i++) {
			System.out.println(num2 + " X " + i + " = " + (num2*i));
		}
	}
	
	// ex) 판매하는 물건의 단가, 구매 갯수 최대치 출력 -> 1개 구매 시 단가*1, 2개 구매 시 단가*2
	// getBuyMaxCnt(단가, 최대치)
	public void getBuyMaxCnt(int pay, int max) {
		System.out.println("물건의 단가 : " + pay);
		for(int i=1; i<=max; i++) {
			System.out.println(i + "개 구매 시 " + (pay*i) + "원");
		}
	}
	
}
