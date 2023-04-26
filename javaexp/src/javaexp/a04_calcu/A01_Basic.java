package javaexp.a04_calcu;

public class A01_Basic {

	public static void main(String[] args) {
		/*
		 * # 연산자란.
		 * 1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 * 2. 연산자 (operations)
		 * 	1) 연산에 사용되는 표시나 기호 - +, -, *, /, %, 등등
		 * 3. 피연산자 (operand) - 연산의 대상이 되는 데이터
		 * 4. 연산식 (expressions) - 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것 (연산자 + 피연산자)
		 * 		ex) 25 + 2, num01 + num02
		 * 			30 * 2 = 60 <- 30과 2는 피연산자, *는 연산자, 이런 피연산자와 연산자를 합친 것이 연산식
		 * 
		 * # 연산자의 종류
		 *	1. 산술연산자 - 사직연산자 + 나머지 연산자 ( +, -, *, /, % ...)
		 **/
			int num01 = 25; 
			int num02 = 7;
			System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));
			System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));
			System.out.println(num01 + " × " + num02 + " = " + (num01 * num02));
			System.out.println(num01 + " / " + num02 + " = " + (num01 / num02));
			System.out.println(num01 + " % " + num02 + " = " + (num01 % num02));
			
//			ex) 곰돌이 3마리가 빵 25개를 섭취... 공평하게 나눈 갯수와 나머지 구해라...
			int bear = 3;
			int bread = 25;
			System.out.println( "공평하게 나눈 갯수는 " + (bread / bear) + "개이고, 나머지는 " + (bread % bear) );
//			ex) 사과 단가가 2000원 하는 것을 5개 구매함. 총 비용을 출력.
			int apple = 2000;
			System.out.println("총 비용은 " + (apple * 5) + "원.");
//			ex) 지갑에 20000원이 있다. 교통비 2000원 2번, 식대 7000원을 지출. 이때의 잔액을 출력.(변수활용)
			int total = 20000;
			int trans = 2000;
			int meal = 7000;
//			System.out.println("최종 잔액은 " + (total - (trans * 2) - meal) + "원.");
			
			int spent = (trans * 2) + meal;
			total -= spent;
			System.out.println("최종 잔액은 " + total + "원.");
			
			/*
		 *	2. 부호 - +, - ex) int num01 = 25; int num02 = -num01; (-25) int num03 = -num02; (25)
		 *	*/
			int ex01 = 25; int ex02 = -ex01; int ex03 = -ex02;
			System.out.println(ex01 + ", " + ex02 + ", "  + ex03 ); // 25, -25, 25 출력
//			ex) 총 금액의 지출금액을 선언하고, 부호연산자를 이용하여 남은 잔액 출력.
				int all = 10000;
				int spentPay = 3000;
				int minus = -spentPay;
				int result2 = all + minus;
				System.out.println( "잔액은 " + result2 );
			/*	
		 *	3. 대입연산자 - =
		 *		왼쪽데이터에서 오른쪽 변수에 할당할 때 사용 ex) int num04 = 50;
		 *	*/
				int ctn1, ctn2, ctn3, ctn4, ctn5;
				ctn1 = ctn2 = ctn3 = ctn4 = ctn5 = 1;
				System.out.println(ctn1);
				System.out.println(ctn2);
				System.out.println(ctn3);
				System.out.println(ctn4);
				System.out.println(ctn5);
			/*
		 *	4. 증감연산자 - ++, --
		 *		1씩 증가하거나 감소하는 연산 ex) int num1 = 0; num1++; (1) num1++; (2) 이후 출력은 2.
		 **/	
				int num1 = 2; 
				System.out.println(num1++); // 2, 출력 후 연산
				System.out.println(num1++); // 3
				System.out.println(++num1); // 5, 연산 후 출력
				System.out.println(num1--); // 5, 출력 후 연산
				System.out.println(--num1); // 3, 연산 후 출력
				System.out.println("----------------------");
		/*
		 *	5. 증감대입연산자 - +=, -=, *=, /=, %=
		 *		특정한 수만큼 증가, 감소하는 연산 ex) int i = 0; i += 1; i -= 1; (i = i + 1;) 이후 출력은 0.
		 **/
				int i = 0; 
				i += 2;
				System.out.println(i); // 2
				i += 3;
				System.out.println(i); // 5
			/*
		 *	6. 비교연산자 - 비교식을 이용해서 true, false 값을 리턴하는 연산. ( >, <, <=, >=, !=, == )
		 *		==(동일), !=(다른경우) ex) int point = 30; boolean isPass = point == 60; 출력은 false.
		 *												boolean isPass2= point >= 60; 출력은 false. 
		 *		ps) 자바에서만 사용하는 문자열 비교 - String str1 = new String("hi"); (heap 영역의 주소값을 저장하는 고루한 방식)
		 *									   String str2 = new String("hi"); 
		 *									   String str3 = hi;
		 *  								   String str4 = hi;
		 *  	(str1==str2) 출력은 false - 주소값을 비교하기 때문. (str3==str4) 출력은 true.
		 *  	그럼으로 자바에서는 문자열을 비교할 때는 .equals()를 이용해서 비교해야 함.	
		 *  */
				int point = 50;
				System.out.println("합격 여부(60점이상) : " + (point >= 60));
				boolean isPass = point >= 60;
				System.out.println("합격 여부 (변수 할당) : " + isPass);
				
			/*
		
		 * */		
		
		
		
		
		
		

	}

}
