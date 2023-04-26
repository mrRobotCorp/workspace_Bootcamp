package javaexp.a08_relation;

import javaexp.a08_relation.vo.Music;
import javaexp.a08_relation.vo.Person;

public class A02_CallVo {
	// ex) javaexp.a08_relation.vo 안에 MusicVO class - 제목, 가수, 발매연도 객체 선언 -> 
	public static void main(String[] args) {
		Person p01 = new Person("Amy", 40, "Busan");
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		
		Music m01 = new Music("Lost", "Frank", 2015);
		System.out.println(m01.getTitle());
		System.out.println(m01.getSinger());
		System.out.println(m01.getYear());

	}

}
