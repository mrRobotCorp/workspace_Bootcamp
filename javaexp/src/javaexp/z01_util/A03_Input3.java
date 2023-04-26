package javaexp.z01_util;

public class A03_Input3 {

	public static void main(String[] args) {
		System.out.println("test");
		
		int cnt = args.length;
		int price01 = Integer.parseInt(args[0]);
		int price02 = Integer.parseInt(args[1]);
		int price03 = Integer.parseInt(args[2]);
		
		int total = price01 + price02 + price03;
		
		System.out.println(cnt + "개의 총 비용은 " + total + "원");
		
		
	}

}
