package javaexp.z01_home;

public class A17_0427 {

	public static void main(String[] args) {
		/*
		7. 물건명, 가격, 갯수를 필드로 하는 Product클래스를 생성하고 사용하되, 재정의하여 객체 생성 후, 참조 변수를 호출했을 때, 물건명/가격/갯수/총계를 출력할려면 처리해야 할 내용은?
		8. String의 비교연산자의 비교와 equals()처리 형식의 차이점에 대하여 기술하세요
		9. String 생성자의 주요 매개변수를 통한 처리 내용을 기술하세요
		
		11. charAt()를 활용하여, 우리나라에서 가장 많은 성 1~10, 가장 많이 사용하는 이름 중간자, 가장 많이 사용하는 마지막자를 조합하여 임의의 이름 3개를 출력하세요
		*/
		
		// 6. Object의 메서드의 기능을 기술하세요.
		Ex06 ex06 = new Ex06();
		System.out.println(ex06.hashCode());
		System.out.println(ex06.equals(new Object()));
		try {
			System.out.println(ex06.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ex06.toString());
		
		// 10. 임시비밀번호를 알파벳 대소문자, 숫자를 조합해서 10자를 만드는 프로그램을 만드세요
		// 숫자 48~57 대문자의 범위 65~90, 소문자의 범위 97~122
		char[] arr = new char[10];
		for(int i=0; i<arr.length; i++) {
			int num = (int)(Math.random() * 62 + 48);
			// 숫자 이후의 범위는 특수문자기 때문에 7씩을 더해서 알파벳 대문자로 나오게 설정
			if(num > 57) { // 58 ~ 64
				num += 7;
			}
			// 대문자 이후의 범위는 특수문자기 때문에 소문자 전까지(97) 6씩 더하여 소문자 나오게 설정
			if(num > 90) { // // 91 ~ 96
				num += 6;
			}
			arr[i] = (char)num;
		}
//		String str1 = new arr[10];
		System.out.println();
		
		// 11. charAt()를 활용하여, 우리나라에서 가장 많은 성 1~10, 가장 많이 사용하는 이름 중간자, 가장 많이 사용하는 마지막자를 조합하여 임의의 이름 3개를 출력하세요
		String first = "김이박최정조강윤장임";
		String middle = "은재동민혜원윤";
		String last = "희연원주";
		String[] names;
		
		for(int i=0; i<3; i++) {
			int ran1 = (int)(Math.random() * first.length());
			int ran2 = (int)(Math.random() * middle.length());
			int ran3 = (int)(Math.random() * last.length());
			System.out.print("임의의 이름 " + (i+1) + " : ");
			System.out.print(first.charAt(ran1));
			System.out.print(middle.charAt(ran2));
			System.out.println(last.charAt(ran3));
			
			char[] name = new char[3];
			name[0] = first.charAt(ran1);
			name[1] = middle.charAt(ran2);
			name[2] = last.charAt(ran3);
//			names[i] = new String(name);
			
		}
		System.out.println("--- 임의의 이름 3개 ---");
//		for(String name:names) {
//			System.out.println(name);
//		}
//		
		

	}

}

class Ex06 {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
