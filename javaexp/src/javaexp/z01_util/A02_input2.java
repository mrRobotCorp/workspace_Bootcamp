package javaexp.z01_util;

public class A02_input2 {

	public static void main(String[] args) {
		System.out.println("test");
		
		String pName = args[0];
		int price = Integer.parseInt(args[1]);
		int cnt = Integer.parseInt(args[2]);		
		int tot = price * cnt;
		
		System.out.println("-구매 정보-");
		System.out.println("물건명 : " + pName);
		System.out.println("가격 : " + price);
		System.out.println("개수 : " + cnt);
		System.out.println("총계 : " + tot + "원");
		
//		ex) A03_Input3.java 생성 후, 구매한 물건의 가격 3개 입력. 3000, 2000, 1000, 총 비용 출력
		
	}

}
