package javaexp.a08_relation;

import javaexp.a08_relation.vo.Emp;
import javaexp.a08_relation.vo.Stu;

public class A04_ObjectArray {

	public static void main(String[] args) {
		// 배열의 크기 선언 후 객체 생성
		// type[] ListName = new type[length]; -> ex) int[] arr = new int[3];
		Emp[] empArr = new Emp[3];
		
		empArr[0] = new Emp(1000, "Joel", "사원", 3500, 10);
		empArr[1] = new Emp(1001, "Amy", "대리", 4500, 20);
		empArr[2] = new Emp(1002, "Sam", "과장", 5500, 30);
		
		// 0부터 시작하는 index 별로 객체를 생성해서 할당.
		
		// foreach (향상된 for문)을 통해 getXXX 로 간접 속성값 호출.
		// for(단위 객체:배열참조)
		for(Emp emp:empArr) {
			System.out.print(emp.getEmpno() + "\t");
			System.out.print(emp.getEname() + "\t");
			System.out.print(emp.getJob() + "\t");
			System.out.print(emp.getSal() + "\t");
			System.out.println(emp.getDeptno());
		}
		
		System.out.println("--------------------------------------");
		
		// ex) 아래의 2차원 데이터를 class로 만들고 객체형 배열에 할당하고 출력 (배열 length 3)
		//		번호 	이름 	국어 	영어 	수학
		//		1 		ㅇㅇ		ㅇㅇ		ㅇㅇ		ㅇㅇ
		Stu[] stuL = new Stu[3];
		
		stuL[0] = new Stu(1, "Kevin", 70, 59, 90);
		stuL[1] = new Stu(2, "Adele", 56, 60, 100);
		stuL[2] = new Stu(3, "Elliot", 89, 88, 39);
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		for(Stu stu:stuL) {
			System.out.print(stu.getNum() + "\t");
			System.out.print(stu.getsName() + "\t");
			System.out.print(stu.getKor() + "\t");
			System.out.print(stu.getEng() + "\t");
			System.out.print(stu.getMath() + "\t");
			int tot = stu.getKor() + stu.getEng() + stu.getMath();
			System.out.print(tot + "\t");
			System.out.println(tot/3);
		}
		
		

	}

}
