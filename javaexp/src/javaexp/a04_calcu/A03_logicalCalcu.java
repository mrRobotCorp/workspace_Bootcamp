package javaexp.a04_calcu;

public class A03_logicalCalcu {

	public static void main(String[] args) {
//			7. 논리연산자
//		 *		- 비교연산식이 2개 이상 or not(!) 연산자를 이용할 때 논리 연산자를 이용해서 처리. 
//		 *		&& - (and) 논리합 두 가지 비교연산자가 모두 true일 때, 그 외는 모두 false.
//		 *				ex) 조건 - 나이에 따른 청소년 요금제 (14세 이상 18세 미만)
//		 *					boolean isAdolpay = age >= 14 && age < 18;
//		 *		|| - (or) 논리곱 두 가지 비교연산자 중 하나 이상 true, 둘 다 false면 false.
//		 *				ex) 조건 - 나이에 따른 입장 적용 (5세 미만, 65 이하)
//		 *					boolean isFree = age < 5 || age >= 65;
//		 *		! - 비교연산식이나 논리연산식의 결과가 true면 false, false면 true로 처리.
//		 *			boolean isPass = point>=60;(합격 경우) boolean isNotPass = !isPass; (합격이 아닌 경우 즉 불합격)
//		 *			boolean ispay = !isFree; (무료가 아닌, 유료) 
//		 *
//		 *	8. 삼항연산자 - 조건(비교연산자, 논리연산자)? A:B
//		 *					조건식이 true일 때는 A로 처리, false일 때는 B로 처리. 한 라인에서 조건에 따라 결과를 처리하기에
//		 *					효과적으로 데이터 처리 가능.
//		 *					System.out.println(age>=18?"성인":"미성년자");// age 값이 조건에 true면 성인 출력. 아니면 미성년자 출력
//		 *
		int age = 15;
//		&& 두 개의 비교연산자가 모두 true일 때만 true.
		boolean isAdol = age >= 14 && age < 18;
		System.out.println("청소년 여부 : " + isAdol);
		
		String inputId = "hi";
		String inputPass = "7777";
		boolean isValid = inputId.equals("hi") && inputPass.equals("7777");
		
		System.out.println("로그인 성공 여부 : " + isValid);
		
		int age02 = 2;
		boolean isFree = age02 <5 || age02 >=65;
		System.out.println("무료 여부 : " + isFree);
		
//		ex) 국어, 영어 점수 할당하여 모두 다 80 이상이면 상금 50000원. 둘 중 하나만 90이상이면 상금 30000.
//			두 경우의 변수 선언하고 상금 여부 출력
		int kor = 50;
		int eng = 90;
		
		boolean first = kor >= 80 && eng >= 80;
		boolean second = kor >=90 || eng >= 90;
		
		System.out.println("상금 50000원 여부 : " + first);
		System.out.println("상금 30000원 여부 : " + second);
		
//		-------------------------- !not -----------------------------------
		int point = 70;
		boolean isPass = point >=60;
		boolean isNotPass = !isPass;
		System.out.println("합격 여부 : " + isPass);
		System.out.println("불합격 여부 : " + isNotPass);
		
		int age03 = 17;
		boolean isAdol02 = age03 >= 14 && age03 <18;
		boolean isNotAdol02 = !isAdol02;
		boolean isNotAdol03 = !(age03 < 14 || age03 >= 18);
		System.out.println("청소년 여부 : " + isAdol02);
		System.out.println("청소년 여부 : " + isNotAdol02);
		System.out.println("청소년 여부 : " + isNotAdol03);
		
//		ex) 5미만이거나 65이상이면 무료요금. 무료요금이 아닌 경우를 !(not)을 활용하거나 논리연산식울 사용하여 출력.
		
		int ageEx = 3;
		boolean freeFee = ageEx < 5 || ageEx >=65;
		boolean notFree = !freeFee;
		boolean notFree2 = !(ageEx >= 5 || ageEx <65);
		System.out.println("무료 요금 해당 여부 : " + freeFee);
		System.out.println("무료 요금 해당 여부 : " + notFree);
		System.out.println("무료 요금 해당 여부 : " + notFree2);

		
	}

}
