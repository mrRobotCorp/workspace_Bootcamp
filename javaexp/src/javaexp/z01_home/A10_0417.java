package javaexp.z01_home;

import javaexp.z01_home.vo.Man;
import javaexp.z01_home.vo.Mart;
import javaexp.z01_home.vo.Matching;
import javaexp.z01_home.vo.Members;
import javaexp.z01_home.vo.Woman;

public class A10_0417 {

	public static void main(String[] args) {
		Woman w1 = new Woman("Amy", "Teacher", 30);
		Man m1 = new Man("Joe", "Doctor", 28);
		Matching match = new Matching();
		
		match.inMan(m1);
		match.inWoman(w1);
		match.showMatch();
		
		Mart[] mt = new Mart[3];
		mt[0] = new Mart("onion", 3000, 2);
		mt[1] = new Mart("milk", 2000, 2);
		mt[2] = new Mart("apple", 1500, 3);
		
		for(Mart mart:mt) {
			System.out.print(mart.getPname() + "\t");
			System.out.print(mart.getPrice() + "\t");
			System.out.println(mart.getCnt());
		}
		
		Members[] mb = new Members[3];
		mb[0] = new Members("abc", "1234", "Kevin", 389, false);
		mb[1] = new Members("juneb3", "passw", "Jason", 2440, true);
		mb[2] = new Members("notime", "nttddd", "Anne", 2944, true);
		
		for(Members mbe:mb) {
			System.out.print(mbe.getId() + "\t");
			System.out.print(mbe.getPw() + "\t");
			System.out.print(mbe.getName() + "\t");
			System.out.print(mbe.getPoints() + "\t");
			System.out.println(mbe.isAccess());
		}
		
	}

}