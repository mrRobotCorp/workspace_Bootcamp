package frontWeb2;

import java.util.Scanner;
import java.util.TreeMap;

public class studyMap_0603 {

	public static void main(String[] args) {	
		
		// 1,2,3번 바구니에 scanner로 입력 받은 과일을 하나씩 추가하고
		// 각 바구니를 오름차순으로 데이터와 함께 출력.
		
		TreeMap<Integer,String> fruit = new TreeMap<Integer,String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 과일 입력 : ");
		String f01 = sc.nextLine();
		System.out.print("두 번째 과일 입력 : ");
		String f02 = sc.nextLine();
		System.out.print("세 번째 과일 입력 : ");
		String f03 = sc.nextLine();
		
		fruit.put(1, f01);//값 추가
		fruit.put(2, f02);
		fruit.put(3, f03);

		
		for(Integer i : fruit.keySet()){ //저장된 key값 확인
		    System.out.println("[Key]:" + i + " [Value]:" + fruit.get(i));
		}
		
	}
	

}
