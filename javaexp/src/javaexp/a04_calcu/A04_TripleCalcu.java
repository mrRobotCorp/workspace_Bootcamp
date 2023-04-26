package javaexp.a04_calcu;

import java.util.Scanner;

public class A04_TripleCalcu {

	public static void main(String[] args) {
		/*
		 * # 삼항연산자
		 * 0) 항 (피연산자를 몇 개 사용하느냐에 따른 구분)
		 * 	단연산자 =, cnt++, ...
		 * 	이항연산자 cnt1 + cnt2, num01 * num02 ...
		 * 	삼항연산자 (연산자와 피연산자를 3개 이상 사용)
		 * 1) 3개의 피연산자를 필요로 하는 연산식
		 * 2) 기본 형식
		 * 	비교연산자 | 논리연산자? true일 경우:false일 경우;
		 * 	ex) 나이가 18세 이상이면 성인, 아니면 미성년
		 * 		String divAdult = age >= 18?"성인":"미성년";
		 * 	ex) 구매 가격이 십만원 이상일 경우 15프로 할인, 아닐 땐 5프로 할인 조건문
		 * 		double disRatio = buyProd>=100000?0.15:0.05;
		 * 	
		 */
		Scanner sc = new Scanner(System.in); // ctrl + shift + o
		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.println("입력한 나이 : " + age);
//		
//		String divAdult = age >= 18? "성인":"미성년";
//		System.out.println("구분 : " + divAdult);
		
//		ex) 획득한 점수를 입력. 점수 기준 60점 이상이면 합격, 아니면 불합격
		System.out.print("점수를 입력 : ");
//		int exPoint = sc.nextInt();
		int exPoint = Integer.parseInt(sc.nextLine()); // 더 안정적인 표현
		
		String result0 = exPoint>=60?"합격":"불합격";
		System.out.println("결과 : " + result0);
		
//		ex) 나이에 따른 무료, 유료 구분 처리
		System.out.print("나이 입력 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		String divFree = age < 5 || age >= 65? "무료":"유료";
		System.out.println("나이 : " + age);
		System.out.println("입장료 결과 : " + divFree);
		
//		ex) 나이에 따라 청소년/일반 요금제 확인 (청소년 14-17)
		System.out.print("요금 나이 : ");
		int age1 = Integer.parseInt(sc.nextLine());
		
		String result1 = age1 >= 14 && age1 <=17?"청소년":"일반";
		System.out.println("당신의 요금제는 " + result1 + " 요금제 입니다.");
//		------------------------------------------------------------------
		
//		ex) 삼항연산자를 이용해서 구매 물건가격과 갯수 입력. 10000 이상이면 사은품 증정 or 사은품 없음
		System.out.print("물건 가격 입력 : ");
		int prod = sc.nextInt();		
		System.out.print("갯수 입력 : ");
		int pCnt = sc.nextInt();
		
		int pay = prod*pCnt;
		
		String result11 = pay>=10000?"사은품 증정":"사은품 없음";
		System.out.println(pay + "원이므로, " + result11);
		
	}

}
