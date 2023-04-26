package javaexp.a06_memory;

public class A04_ArrayFor2 {

	public static void main(String[] args) {
		
		int [] arry = {100, 200, 300};
		for(int price:arry) {
			System.out.println(price); // 100, 200, 300 출력
		}
		
		int []intList = {30, 10, 45, 26};
		for(int i:intList) {
			System.out.println(i); // 배열 안 데이터 차례대로 출력
		}
		
		// ex) 물건명을 배열로 선언, 향상된 for문으로 출력
		String[] proList = {"jelly", "cheese", "candy", "gum"};
		
		for(String i:proList) {
			System.out.println(i);
		}
		
	}

}
