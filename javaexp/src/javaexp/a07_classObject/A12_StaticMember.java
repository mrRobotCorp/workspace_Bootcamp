package javaexp.a07_classObject;

public class A12_StaticMember {

	public static void main(String[] args) {
		
		System.out.println("객체 생성 없이 사용하는 static final");
		System.out.println(Number01.NO4);
		// static 메서드 객체 생성 없이 호출할 수 있는 메서드이기 때문에
		// 객체 생성이 필요한 일반 메서드를 포함할 수 X.
		BankAccount.callMethod();
		System.out.println(Math.PI);
		
		Number01 n1 = new Number01(5, 6);
		Number01 n2 = new Number01(4, 7);
		
		n1.no1 = 8;
//		n.no2 = 7; // final 키워드는 한 번 할당하면 변경할 수 없음. const 재질.....인가..
		n1.no3 = 10; // no3는 static으로 선언하여 모든 객체 즉 no2에도 공유됨

		System.out.println(n1.no1);
		System.out.println(n1.no2);

		System.out.println("n2 객체의 속성들");
		System.out.println(n2.no2);
		System.out.println(n2.no2);
		System.out.println(n2.no3); // 10 출력
		
		BankAccount acc01 = new BankAccount("우리", 2000);
		BankAccount acc02 = new BankAccount("신한", 8000);
		BankAccount acc03 = new BankAccount("국민", 6000);
		
		//------------- 두 경우 중 두 번쨰 방식의 사용이 주됨 -----------
		System.out.println(acc01.rest + ", " + acc01.totRes);
		System.out.println(acc02.rest + ", " + acc02.totRes);
		System.out.println(acc03.rest + ", " + acc03.totRes); // totRes 값은 모두 동일.
		
		// 객체가 공유하는 메모리를 사용. 객체 공유보다 클래스 변수로 주로 사용.
		System.out.println(acc01.rest + ", " + BankAccount.totRes);
		System.out.println(acc02.rest + ", " + BankAccount.totRes);
		System.out.println(acc03.rest + ", " + BankAccount.totRes);
		
		acc01.SavingMoney(4000);
		acc02.SavingMoney(1000);
		acc03.SavingMoney(2000);
		
		System.out.println("다른 은행의 계좌 : " + acc03.rest);
		System.out.println("acc03 다른 은행의 계좌 : " + acc03.rest);
		System.out.println("static 메서드 : " + BankAccount.SavingMoney2(2000));
		System.out.println("static 메서드 : " + BankAccount.SavingMoney2(1000));
		
		System.out.println("acc03 메모리 확인 : " + acc03.totRes);
		System.out.println("acc03 메모리 확인 : " + BankAccount.totRes);
		

	}

}
class Number01 {
	int no1;
	final int no2;
	static int no3; // Number01.no3 = 30; 로 주로 선언
	// 객체가 공유하는 데이터 중에 변경할 수 없는 데이터를 말함.
	// 클래스 상수로 한 번 할당하여 변경되지 않는 것
	// 자바에는 static final을 상수로 사용하고, 대문자로 사용하여 구분. Number01.NO4
	static final int NO4 = 4;
	
	Number01(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}	
}
// BankAccount 클래스를 통해, 각 은행 계좌의 정보는 new BankAccount()객체로
// 일반 변수나 메서드를 통해 처리. 모든 계좌가 공유하는 정보(전체 계좌의 잔고/계좌의 갯수)를
// static이라는 키워드를 통해 선언하여 효과적으로 처리
class BankAccount {
	String name; // 계좌 이름
	int rest; // 계좌별 총 잔액
	static int totRes; // 모든 계좌의 총합산 -> static 모든 객체의 공유 메모리
	
	BankAccount(String name, int rest) {
		this.name = name;
		this.rest = rest;
		
		System.out.println("-- 계좌 개설 --");
		System.out.println("계좌명 : " + name);
		System.out.println("계좌 잔액 : " + rest);
		// 모든 객체가 공유하는 메모리 영역 -> static
		// 누적해서 저장됨.
		totRes += rest;
		System.out.println("모든 계좌 잔액 합산 : " + totRes);
	}
	
	void SavingMoney(int money) {
		this.rest += money; // 계좌별 돈이 누적
		totRes += money; // 전 계좌에 총계 누적
		System.out.println("계좌 : " + name);
		System.out.println("계좌 잔고 : " + rest);
		System.out.println("총 자산 : " + totRes);
	}
	
	// 객체 생성 없이 static 변수를 증가/변경 시키는 메서드 필요할 시에 static 매서드로 선언
	// name, rest 등은 객체 종속적이기 때문에 해당 메서드에선 사용 X. 
	// static 메서드, static 변수를 수정하거나 변경할 때 활용하는 메서드
	// 객체 별로 사용하는 변수들을 이 메서드에서 사용하지 못 함.
	// static 변수/메서드는 객체의 공유 부분. 객체 종속이 아니기 때문에 일반적으로 객체를 생성하지 X.
	// 클래스명.static변수, 클래스명.static메서드() 로 사용 가능
	// ex) BankAccount.totRes, BankAccount.SavingMoney2(2000);
	static int SavingMoney2(int money) {
//		rest++; 일반 변수는 에러 발생
		totRes += money; // 전 계좌에 총계 누적
		System.out.println("은행 잔고 : " + totRes);
		return totRes;
	}
	
	// 메서드에서 호출. static 메서드, 일반 메서드 호출
	static void callMethod() {
//		SavingMoney(20); // 
		SavingMoney2(25);
	}
	
	void callMethod2() {
		callMethod();
	}
	
	
	
	
}
