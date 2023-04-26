package javaexp.a07_classObject;

public class A08_MethodRetExp {

	public static void main(String[] args) {
		Product11 p11 = new Product11();
		// 생성자는 호출 시마다 다른 heap영역을 만들기 때문에 참조값이 달라짐. 
		// 하나의 객체에 하나의 생성자만 사용 가능하지만, 
		
		// 메서드는 참조명.메서드명(데이터) 로 같은 heap영역에 위치한 동일 메서드를 2-3번 이상 호출해도 메모리 변경 X.
		int tot11 = p11.totPay("jelly", 300, 4); // 아래 메서드 내용 실행(출력3개, tot값 계산, 리턴값 가져와 넣기)
		System.out.println("총 비용1 : " + tot11); // 위 실행 끝나고 tot11안에 있는 리턴 값 출력
		System.out.println("총 비용2 : " + p11.totPay("gum", 500, 2));
		
		int tot03 = p11.totPay("apple", 400, 2);
		System.out.println("총 비용3 : " + tot03);
		
		System.out.println("---------------------------");
		int disP01 = p11.discount(2000, 0.4);
		System.out.println("할인된 최종 가격 : " + disP01);
		
		int disP02 = p11.discount(5500, 0.3);
		System.out.println("할인된 최종 가격 : " + disP02);
		
		System.out.println("---------------------------");
		Student01 stu01 = new Student01();
		
		double stu1 = stu01.records("Joel", 89, 78, 96);
		System.out.println("평균은 : " + stu1);
		System.out.println("평균은 : " + stu01.records("Amy", 99, 56, 74));

	}
}

//물건 객체를 생성 후 구매 할 물건과 가격, 갯수를 입력 받아 총비용을 리턴하는 메서드 처리.
class Product11 {
	int totPay(String pName, int price, int cnt) {
		System.out.println("입력한 물건 : " + pName);
		System.out.println("물건의 가격 : " + price);
		System.out.println("물건의 갯수 : " + cnt);
		int tot = price * cnt;
		
		return tot;
	}
	
	// ex) 물건 가격, 할인율을 입력 받아 할인율이 적용된 금액 리턴 -> 300 - (300 * 0.4)
	// (int) 정수형으로 형변환하여 리턴하고 main()에서 호출 
	int discount(int dPrice, double disPer) {
		System.out.println("물건의 가격 : " + dPrice);
		
		int percent = (int)(disPer*100);
		System.out.println("물건의 할인율 : " + percent + "%");
		
		int result = (int)(dPrice - (dPrice * disPer));
		return result;
	}	
}

// ex) Student01 records() 메서드에 이름, 국어, 영어, 수학 입력 받고,
// 		해당 내용 출력, 평균(double) 리턴 처리
class Student01{
	
	// 리턴 값 즉, 올려보내는 값의 유형에 맞춰 메서드 생성
	double records(String sName, int kor, int eng, int math) {
		System.out.println("학생의 이름은 " + sName);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		
		int tot = kor + eng + math;
		System.out.println("총점 : " + tot);
		
		double aver = tot / 3;
		return aver;
	}
}





