package javaexp.z01_home;

public class A09_0412 {

	public static void main(String[] args) {
		// 1. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
		
		// 2. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
		// 생성자는  주로 해당 객체를 생성해서 초기값이 설정할 필요가 있을 때 주로 사용됨.
		
		// 3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
		// 1) 3개에 입력값 중에 가장 큰수 출력
		// 2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
		// 3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
		RetExp100 p01 = new RetExp100();
		
		p01.GetNum(4, 15, 6);
		p01.GetNum(6, 5, 55);
		p01.IsPass(35);
		p01.IsPass(99);
		
		System.out.println(p01.Prod("jelly"));
		System.out.println(p01.Prod("snack"));
		
		// 4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
		// 1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
		// 2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
		// 3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
		RetExp100 park = new RetExp100();
		String fee = park.ParkFee(3);
		System.out.println("무료/유료 여부 : " + fee);
		
		String discount = park.Discount(55);
		System.out.println("할인율 : " + discount);
		
		System.out.println(park.Member("Joe"));
		System.out.println(park.Member("Jake"));
		
		
		// 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
		// 1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
		// 탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수)
		// 버스번호 @@번 @@명이 탑승했습니다.
		Bus b1 = new Bus(11);
		
		b1.GetOn(2);
		b1.GetOn(1);		
		
		// 6. 클래스내 일반변수, static 변수, final 상수, static final 상수의 차이점을 기본 예제로 설명하세요.
		
		
		// 7. 상대적경로 이동과 절대적 경로 이동예제를 하나씩 만들어 이동처리하세요
		
	}

}

class ExCls {
	
}

class RetExp100 {
	int num1;
	int num2;
	int num3;
	
	public RetExp100() {
	}

	void GetNum(int num1, int num2, int num3) {
		int bigger = 0;
		
		if(num1 > bigger) {
			bigger = num1;
		}
		if(num2 > bigger) {
			bigger = num2;
		}
		if(num3 > bigger) {
			bigger = num3;
		}
		System.out.println("가장 큰 수는 : " + bigger);
		
//		if(num1 > num2) {
//			System.out.println("가장 큰 수는 : " + num1);
//		} else if(num2 > num3) {
//			System.out.println("가장 큰 수는 : " + num2);
//		} else {
//			System.out.println("가장 큰 수는 : " + num3);			
//		}
	}
	
	void IsPass(int num) {
		if(num >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	String Prod(String name) {
		String[] prod = {"jelly", "cheese", "pizza"};
		String result = "판매 불가능";
		
		for(int i=0; i<	prod.length; i++) {
			if(name.equals(prod[i])) {
				result = "판매 가능";
			}
		}
		return result;
	}
	
	String ParkFee (int age) {
		String fee;
		if(age < 5 || age >= 65) {
			fee = "무료";
		} else {
			fee = "유료";
		}
		return fee;
	}
	
	String Discount(int age) {
		String result;
		if(age < 20) {
			result = "10% 할인";
		} else if(age < 50) {
			result = "15% 할인";
		} else {
			result = "20% 할인";
		}
		return result;
	}
	
	String Member(String name) {
		String isMember="비회원입니다.";
		String[] mem = {"Joe", "Taylor", "Sam"};
		for(int i=0; i<mem.length; i++) {
			if(name.equals(mem[i])) {
				isMember = "회원입니다.";
			}
		} 
		return isMember;
		
	}
	
}

class Bus {
	int busN;
	int perAll = 0;
	static int NUM = 1;
	
	public Bus(int busN) {
		this.busN = busN;
	}
	
	void GetOn(int num) {
		perAll += num;
		System.out.println(num + "명 탑승, " + "전체 탑승자 수는 : " + perAll);
	}
	
	void Ex06() {
		System.out.println("static 변수 : " + NUM);
	}
 	
}
