package javaexp.a08_relation;

import javaexp.a08_relation.vo.Mart;
import javaexp.a08_relation.vo.Product;

public class A05_ObjVsObsArray {

	public static void main(String[] args) {
		Mart m1 = new Mart("Happy Mart");
		Product p1 = new Product();
		
		// 예외 내용 확인1
		m1.buyList();
		// 예외 내용 확인2
		m1.buyProduct(new Product("apple", 300, 2));
		
		System.out.println("---------------------------------");
		m1.buyProdPlan("joe", 3);
		m1.buyProduct(new Product("orange", 1200, 5));
		m1.buyProduct(new Product("tomato", 1200, 2));
		m1.buyProduct(new Product("lemon", 2000, 3));
		// 위 3종류가 채워져 예외 처리.
		m1.buyProduct(new Product("Milk", 2000, 3));
		
		m1.buyList();

	}

}
