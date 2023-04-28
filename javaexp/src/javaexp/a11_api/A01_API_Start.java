package javaexp.a11_api;

public class A01_API_Start {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = p;
		
		// 최상위인 Object class의 메서드들 모두 오버라이딩
		
		// 특정한 객체의 코드값으로 생성 시 마다 다른 코드값을 가지고 있음
		// 해당 객체의 같은지 확인할 때 사용됨
		System.out.println("hashCode : " + p.hashCode()); // 2083562754
		System.out.println("hashCode1 : " + p1.hashCode()); // 1239731077
		System.out.println("hashCode2 : " + p2.hashCode()); // 2083562754
		System.out.println("equals : " + p.equals(new Object()));
		try {
			System.out.println("clone : " + p.clone());
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("toString : " + p.toString());
//		System.out.println("finalize : " + p.finalize());

	}

}

// 최상위 object
class Person {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode(); // 10진수로 고유 코드 값을 가져 옴.
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
		// 패키지명.클래스@16진수 주소값
//		return super.toString();
		return "hi, toString()";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		// deplicated 메서드 : 폐기 될 예정
		super.finalize();
	}
	
}