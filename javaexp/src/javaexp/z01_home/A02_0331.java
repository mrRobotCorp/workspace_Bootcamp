package javaexp.z01_home;

import java.util.Scanner;

public class A02_0331 {

	public static void main(String[] args) {	
//		1. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		int num01 = 9; 
		int num02 = 3;
		int result01 = num01 + num02;
		
		// 연산자 +를 사용하여 피연산자 num01과 num02 를 연산. 그 결과를 result 변수에 대입하여 출력함.
		System.out.println(result01);
		
//		2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
		System.out.println("+ 연산자의 연산 값 - " + (num01 + num02));
		System.out.println("- 연산자의 연산 값 - " + (num01 - num02));
		System.out.println("* 연산자의 연산 값 - " + (num01 * num02));
		System.out.println("/ 연산자의 연산 값 - " + (num01 / num02));
		System.out.println("% 연산자의 연산 값 - " + (num01 % num02));
		
//		3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와 소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
		int juice = 500;
		int cup = 3;
		
		int result02 = juice / cup;
		double result03 = (double)juice / cup;
		System.out.println("정수 값은 " + result02 + ", 실수 값은 " + result03);
		
//		4. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		int i = 1;
		System.out.println(i++); // 1 출력
		System.out.println(i++); // 2 출력
		System.out.println(--i); // 2 출력
		System.out.println(i--); // 2 출력
//		증감연산식에서 ++가 앞에 올 경우 연산이 먼저 이루어진 다음에 출력이 되고, ++가 뒤에 올 경우 출력이 된 다음 연산이 된다.
		
		
//		5. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요.
		int j = 2;
		j += 3;
		System.out.println(j); // 5 출력
		j -= 2;
		System.out.println(j); // 3 출력
//		( j += 3 )의 증감대입연산식을 풀어보면 ( j = j + 3 )과 같으므로 값이 더해져 출력된다.
		
		
//		6.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//		김밥 1개 구매  2500
//		김밥 2개 구매  5000
//		김밥 3개 구매  10000
		
//		int kCnt = 1;
		int kimb = 2500;
//		int total = kCnt * kimb;
//		System.out.println(++kCnt + "개의 가격은 " + total + "원");
//		System.out.println(++kCnt + "개의 가격은 " + total + "원");
//		System.out.println(++kCnt + "개의 가격은 " + total + "원");
		
		for(int kCnt = 1; kCnt < 4; kCnt++) {
			int total = kCnt * kimb;
			System.out.println(kCnt + "개의 가격은 " + total + "원");
		}
		
//		7. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
		String str01 = new String("hi");
		String str02 = new String("hi");
		String str03 = "hi";
		String str04 = "hi";
		
		System.out.println(str01 == str02); // false 출력
		System.out.println(str02 == str03); // false 출력
		System.out.println(str03 == str04); // true 출력
		// str01의 경우 heap 영역의 주소값을 저장하는 방식이기 때문에 값이 동일하지 않다.

//		8. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요.
//			java 파일에서 실행명령어를 처리. 실행 시 입력 값을 전달 처리한다.
//			입력 값으로 귤 2000 을 입력.
//			main()의 매개변수로 String[] args = { "귤", "2000" }; 를 갖게 된다.

		
//		9. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
//		arguments 입력 내용 - jelly 2000 4 cheese 4000 3
		String product0 = args[0];
		int price0 = Integer.parseInt(args[1]);
		int pCnt0 = Integer.parseInt(args[2]);
		int expense0 = price0* pCnt0;
		
		String product1 = args[3];
		String price1 = args[4];
		String pCnt1 = args[5];
		int expense1 = Integer.parseInt(price1)* Integer.parseInt(pCnt1);
		
		int total0 = expense0 + expense1;
		
		System.out.println("결제 내역에는 " + product0 + ", " + product1 + "가 있고, ");
		System.out.println("총 비용은 " + total0 + "원 이다.");
		
//		10. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
		System.out.println("test"); // Scanner의 출력
		Scanner sc = new Scanner(System.in); // Scanner의 입력
		
		System.out.print("출생연도 : ");
		int bornYear = Integer.parseInt(sc.nextLine());
		System.out.println("당신의 나이는 " + (2023 - bornYear + 1));
		
		
//		11. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
//		타율 = 안타수 / 타수
		System.out.print("선수의 이름 : ");
		String player = sc.nextLine();
		
		System.out.print("타석수 : ");
		int ballCnt = sc.nextInt();
		
		System.out.print("안타수 : ");
		int hitCnt = sc.nextInt();
		
		System.out.println(player + " 타자의 타율 : " + (hitCnt / ballCnt));
			
		
//		12. 비교연산자의 종류를 예시와 함께 기술하세요.
		int point = 50;
		System.out.println("합격 여부(60점이상) : " + (point >= 60));
		boolean isPass = point >= 60;
		System.out.println("합격 여부 (변수 할당) : " + isPass);
		
//		13. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요
		System.out.print("나이를 입력하세요 : ");
		int userAge = sc.nextInt();
		boolean isAdult = userAge >= 18;
		System.out.println("유저의 성인 여부 : " + isAdult );
		
//		14. 논리연산자의 종류를 예제와 함께 기술하세요.
//		나이와 키로 할인 혹은 사은품 증정 여부 확인
		int age02 = 33;
		int tall = 191;
		
		boolean isSale = age02 <= 6 && tall <= 110; // (and) 모두 true인 경우
		boolean isGift = age02 >= 65 || tall >= 190; // (or) 둘 중 하나만 true인 경우
		
		System.out.println("할인 여부 : " + isSale); // false 출력
		System.out.println("사은품 여부 : " + isGift); // true 출력
		
		int age03 = 3;
		boolean freeFee = age03 < 4 || age03 >=65;
		boolean notFree = !freeFee;
		boolean notFree2 = !(age03 >= 4 || age03 <65);
		System.out.println("무료 여부 : " + freeFee); // true 출력
		System.out.println("무료 여부 : " + notFree); // false 출력
		System.out.println("무료 여부 : " + notFree2); // false 출력
		
	}

}