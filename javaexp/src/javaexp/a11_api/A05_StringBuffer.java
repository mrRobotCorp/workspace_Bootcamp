package javaexp.a11_api;

public class A05_StringBuffer {

	public static void main(String[] args) {
		String name1 = "abc";
		String name2 = "abc";
		String name3 = new String("abc");
		String name4 = new String("abc");
		
		System.out.println(System.identityHashCode(name1)); // 93122545
		System.out.println(System.identityHashCode(name2)); // 93122545
		System.out.println(System.identityHashCode(name3)); // 2083562754
		System.out.println(System.identityHashCode(name4)); // 1239731077
		System.out.println("----------------------------------");
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());
//		System.out.println(name4.hashCode()); // 모두 동일하게 출력
		// --------------------------------------------------
		String strData = "A";
		System.out.println("초기 주소값 : " + strData.hashCode()); // 스택에 있는 주소값 출력
		for(int i=0; i<10; i++) {
			strData += i; // 연산될 때마다 다른 주소값 생성
			System.out.println(strData.hashCode());
		}
		
		System.out.println(strData);
		System.out.println("마지막 주소값 : " + strData.hashCode()); // 스택에 있는 주소값 출력
		/*
		 문자열을 사용하여 += 기호를 통해 데이터를 누적 할당하면 heap영역을 계속 만들어서 사용됨
		이렇게 데이터를 처리하면 메모리 overflow가 발생됨
		문자열 데이터를 처리할 때, 문자열이 늘어나도 동일한 heap 주소 안에서 데이터를 처리할 수 있는
		객체가 필요
		--> StringBuffer
		
		*/
		System.out.print("---StringBuffer 객체 주소 비교-->");
		StringBuffer sb = new StringBuffer();
//		
//		for(int i=0; i<10; i++) {
//			sb += i; // 연산될 때마다 다른 주소값 생성
//			System.out.println(sb.hashCode());
//		}
		
		sb.append("a");
		System.out.println(System.identityHashCode(sb));
		sb.append("b");
		System.out.println(System.identityHashCode(sb));
		sb.append("c");
		System.out.println(System.identityHashCode(sb));
		// 추가 이후에도 동일한 주소 값을 가지고 있음 -> 문자를 추가할 때엔 append를 사용해야 함
		System.out.println(sb.toString());
		System.out.println(sb);
		
		// ex) StringBuffer를 이용해서 초기 문자열 코드를 "1"을 할당하여
		// 객체를 생성하고 2~1000까지 문자열을 누적하여
		// 초기 생성되었을 때 주소값과 최종 누적된 문자열을 확인하고 주소값 확인
		 StringBuffer ex = new  StringBuffer("1");
		 System.out.println(System.identityHashCode(ex));
		 
		 for(int i=2; i<=1000; i++) {
			 ex.append(i);
		 }
		 System.out.println(ex);
		 System.out.println(System.identityHashCode(ex));
		 
		 System.out.println(ex.reverse());

	}

}
