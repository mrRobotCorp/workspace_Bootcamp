package javaexp.a11_api;

import java.util.Random;

public class A08_Random {

	public static void main(String[] args) {
		Random r1 = new Random(); // util import
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		// r1.nextInt(경우의 수) + 시작수
		System.out.println(r1.nextInt(5) + 1);
		System.out.println("주사위 : " + (r1.nextInt(6) + 1));
		System.out.println("0 ~ 100 : " + r1.nextInt(101));

	}

}
