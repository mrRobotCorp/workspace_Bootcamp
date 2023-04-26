package javaexp.z01_home;

import javaexp.z01_home.vo.Girl;
import javaexp.z01_home.vo.InClass;

public class A11_0418 {

	public static void main(String[] args) {
		InClass cls = new InClass();
		
		// 입실 할 학생의 수 설정
		cls.classPlan(3);
		
		// 나이, 학교, 점수 설정
		cls.inStu(new Girl(20, "skrr", 98));
		cls.inStu(new Girl(25, "skrrt", 65));
		cls.inStu(new Girl(31, "skrrr", 89));
		cls.stuList();
		
		
		Girl g1 = new Girl();
		// 상속으로 상위의 맴버 사용 - 출력
		g1.HaveS(2);
		System.out.println(g1.getLocation());
	}

}