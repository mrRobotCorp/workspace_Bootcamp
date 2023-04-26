package javaexp.a06_memory;

public class A03_ArrayUsing {

	public static void main(String[] args) {
		/*
		 # 배열의 활용
		 1. 배열은 선언과 동시에 원하는 데이터를 아래와 같이 할당할 수 있음.
		 
		 */
		int arry[];
		arry = new int[] {100, 200, 300};
		System.out.println("배열의 크기 : " + arry.length);
		
		String arry2[] = {"a", "b", "c" };
		// new String[]을 생략할 수 있음.
		/*
		 2. index가 같은 배열의 경우 연관 관계로 반복문을 통해 출력할 수 있음.
		 */
		int []bCnt = {3, 5, 2};
		
		for(int i=0; i < arry.length; i++) {
			System.out.print(i+ ")" + arry[i]);
			System.out.println("\t" + arry2[i]);
			System.out.println(bCnt[i]);
		}
		
		// 팀 순위 검색 - 구단/승률 각각 배열로 선언, 할당 , 반복문을 통해 리스트화 하여 출력
		String teamList[] = {"SSG", "LG", "삼성", "두산"}; 
		double percent[] = {0.732, 0.663, 0.667, 0.507};
		
		for(int i =0; i<teamList.length; i++) {
			System.out.print(teamList[i] + " 팀\t");
			System.out.println(percent[i] + " 승률");
		}

	}

}
