package javaexp.y01_review;

public class A03_GlobalVariables {

	public static void main(String[] args) {
		int num01 = 1;
		if(num01>=0) {
			num01++;
			int num02 = 30;
			num02++;
			num01=num02;
		}
		num01++;
		if(num01 >= 2) {
			num01++;
		}
		
		// 반복문 데이터에서 활용
		for(int cnt=1; cnt<=10; cnt++) {
			// cnt : 지역변수, 매개변수에서 int 선언했기 때문에
			System.out.print(cnt + ", ");
		}
		
//		System.out.println(cnt); // for문 안에 있는 지역변수, 블럭 밖에서는 사용 불가능
		System.out.println();
		
		int no =1;
		for(no=5; no <= 10; no++) {
			System.out.print(no + ", ");
		}
		System.out.println("\n-- 반복문 종료 --");
		System.out.println(no);
		// 데이터 누적처리 (+=, -=, *=, /=, %=)
		int tot = 0;
		for(int cnt=1; cnt<=10; cnt++) {
			tot += cnt;
			System.out.print(cnt + ((cnt!=10)?" + ":" = ")); // 삼항연산자
		}
		System.out.println("합산 값 : " + tot);
		
		

	}

}
