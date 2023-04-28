package javaexp.a11_api;

import java.util.ArrayList;

public class A06_WrapperClass {

	public static void main(String[] args) {
		int num01 = 25; // 기본 데이터 유형
		Integer numWrap01 = new Integer(num01); // Wrapper 클래스
		// numWrap01.XXX() 를 통해 포함되는 여러 기능 메서드 지원
		System.out.println(numWrap01.byteValue());
		System.out.println(numWrap01.hashCode());
		System.out.println(numWrap01.MAX_VALUE);

		
		Byte obj1 = Byte.valueOf("25");
		Integer obj2 = Integer.valueOf(30);
		Double obj3 = Double.valueOf("30.8");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		// ex) boolean, double, float, short, char를 기본 데이터를 박싱하여 출력
		Integer ex01 = Integer.valueOf(2);
		Boolean ex02 = Boolean.valueOf(false);
		Double ex03 = Double.valueOf("24.6");
		Float ex04 = Float.valueOf("2.3");
		Short ex05 = Short.valueOf("30");
		Character ex06 = Character.valueOf('a');
		
		System.out.println("--- ex ----");
		System.out.println(ex01);
		System.out.println(ex02);
		System.out.println(ex03);
		System.out.println(ex04);
		System.out.println(ex05);
		System.out.println(ex06);
		// boxing(객체)되었을 때 지원하는 여러가지 기능 메서드 활용 할 목적으로 처리
		
		// unboxing
		byte num10 = obj1.byteValue();
		int num11 = obj2.intValue();
		double num12 = obj3.doubleValue();
		
		System.out.println("----- auto -----");
		// Auto Boxing (위 정규 절차 보다 간편하게 사용하기 위함)
		Integer obj10 = 30; // 바로 대입처리
		// Auto Unboxing
		Double obj11 = Double.valueOf("30.7");
		double num13 = obj11;
		System.out.println(obj10);
		System.out.println(num13);
		
		// Integer로 auto boxing 유형이기 때문에 add()로 바로 할당 가능
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(Integer.valueOf(25));
		iList.add(Integer.valueOf(50));
		iList.add(30);
		iList.add(40);
		
		System.out.println("-- auto boxing에 의해 바로 연산 가능 --");
		for(Integer i:iList) {
			System.out.println(i+50);
		}
		
		// ex) args에서 3000 true 40.4F <- 문자열로 입력 받아서 Wrapper 클래스에
		// 할당하고 출력 // run -> arguments -> 3000 true 40.4F 입력
		Integer data01 = Integer.valueOf(args[0]);
		Boolean data02 = Boolean.valueOf(args[1]);
		Float data03 = Float.valueOf(args[2]);
		System.out.println(data01);
		System.out.println(data02);
		System.out.println(data03);
		
	}

}