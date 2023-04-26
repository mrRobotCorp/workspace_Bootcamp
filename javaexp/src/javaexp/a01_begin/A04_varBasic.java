package javaexp.a01_begin;

public class A04_varBasic {

	public static void main(String[] args) {
//		숫자형 데이터 선언과 할당
//		형식 -> 유형 이름 = 데이터
		int num01 = 25;
		var num02 = 30;
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num01 + num02);
		
		int point01 = 70;
//		+ -> 숫자형태를 합산, 문자 형태는 이어주는 역할
		System.out.println("점수 : " + point01);
		
//		ex) 국어, 영어, 수학 점수를 영문명 변수로 선언, 항목별로 출력, 총계 출력
		var kor = 90;
		var eng = 95;
		var math = 100;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.print("총합 : ");
		System.out.println(kor+ eng + math);
		System.out.println("------------------------------------");

//		ex) 사과, 바나나, 딸기 모두 가격 영문변수로 선언, 값 할당, 항목별 출력
		var apple = 500;
		var bnn = 200;
		var strb = 100;
		
		System.out.println("사과 : " + apple + "원");
		System.out.println("바나나 : " + bnn + "원");
		System.out.println("딸기 : " + strb + "원");
		
//		방법1
		System.out.print("총 비용 : ");
		System.out.println(apple + strb + bnn);
//		방법2
		System.out.println("총합 : " + (apple + strb + bnn));
//		방법3
		var total = apple + strb + bnn;
		System.out.println("총계 : " + total);
		
		
		
		
	}

}
