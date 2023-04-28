package javaexp.a12_collection;

import java.util.ArrayList;

public class A01_List {

	public static void main(String[] args) {
		// ctrl + shift + o - 자동 import
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person("Joe", 45, "seoul"));
		plist.add(new Person("Amy", 33, "jeju"));
		plist.add(new Person("Elliot", 24, "LA"));
		plist.add(new Person("Kevin", 33, "NY"));
		plist.add(new Person("Sam", 27, "busan"));
		
		Person p01 = plist.get(1);
		System.out.println("두 번째 객체 이름 : " + p01.getName());
		System.out.println("다섯 번째 객체 이름 : " + plist.get(4).getName());
		
		System.out.println("이름\t나이\t주소");
		for(Person p:plist) {
			System.out.print(p.getName() + "\t");
			System.out.print(p.getAge() + "\t");
			System.out.println(p.getLoc() + "\t");
		}
		
		System.out.println("-----------------------------------");
		
		for(int i=0; i<plist.size(); i++) {
			Person p11 = plist.get(i);
			System.out.print(p11.getName() + "\t");
			System.out.print(p11.getAge() + "\t");
			System.out.println(p11.getLoc() + "\t");
		}
		
		System.out.println("-----------------------------------");
		//ex) 학생 클래스 선언 - 반, 번호, 이름, 점수 속성선언 ArrayList에 할당
		// 3개로 생성, 마지막 객체 이름 호출, 첫번째 객체 점수 호출
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(3, 13, "Elliot", 89));
		slist.add(new Student(5, 2, "Taylor", 100));
		slist.add(new Student(1, 14, "Ellen", 79));
		
		System.out.println("마지막 객체 이름 : " + slist.get(2).getName());
		System.out.println("첫 번째 객체 점수 : " + slist.get(0).getPoint());
		
		System.out.println("반\t번호\t이름\t점수");
		
		for(Student stu:slist) {
			System.out.print(stu.getClassNum() + "\t");
			System.out.print(stu.getStuNum() + "\t");
			System.out.print(stu.getName() + "\t");
			System.out.println(stu.getPoint() + "\t");
		}
		
		
		
		
		
	}

}

class Student {
	private int classNum;
	private int stuNum;
	private String name;
	private int point;
	public Student(int classNum, int stuNum, String name, int point) {
		this.classNum = classNum;
		this.stuNum = stuNum;
		this.name = name;
		this.point = point;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}

class Person {
	private String name;
	private int age;
	private String loc;
	
	public Person(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public Person() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}