package javaexp.y01_review;

import java.util.ArrayList;

public class A04_ArrayList {

	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student("20061022", "Joanne", 90, 1, 19, 80, 90));
		slist.add(new Student("20061023", "Daniel", 80, 3, 17, 90, 30));
		slist.add(new Student("20061024", "Kevin", 70, 1, 19, 70, 60));
		
		Student stu = slist.get(0);
		System.out.println("이름 : " + stu.getName());
		System.out.println("총점 : " + stu.totPoint());
		System.out.println("등급 : " + stu.getStuSrade());
		
		for(Student st:slist) {
			System.out.print(st.getName() + "\t");
			System.out.println(st.getStuSrade());
		}
	
	}

}
class Student {
	private String stNo; // 고정된 고유번호는 문자로 할 때도 있음
	private String name; 
	private int homePt;
	private int absPt;
	private int attPt;
	private int middTst;
	private int lstTst;
	
	public Student(String stNo, String name, int homePt, int absPt, int attPt, int middTst, int lstTst) {
		this.stNo = stNo;
		this.name = name;
		this.homePt = homePt; // 과제
		this.absPt = absPt; // 결석
		this.attPt = attPt; // 출석
		this.middTst = middTst; // 중간평가
		this.lstTst = lstTst; // 기말?
	}
	
	// 합계 처리 메서드
	public int totPoint() {
		// 출결 점수 20% 반영, 과제 점수 10% 반영, 시험 점수 70%
		int attAll = (int)(attPt/(absPt + attPt) * 0.2); // 20점
		int homePt = this.homePt * 10; // 10점
		int tstAll = (middTst + lstTst)/2 * 70; // 70점 
		
		return attAll + homePt + tstAll;
	}
	
	public String getStuSrade() {
		String grade = "";
		if(totPoint() >= 90) {
			grade = "A";
		} else if(totPoint() >= 80) {
			grade = "B";
		} else if(totPoint() >= 70) {
			grade = "C";
		} else if(totPoint() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	
	public String getStNo() {
		return stNo;
	}
	public void setStNo(String stNo) {
		this.stNo = stNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHomePt() {
		return homePt;
	}
	public void setHomePt(int homePt) {
		this.homePt = homePt;
	}
	public int getAbsPt() {
		return absPt;
	}
	public void setAbsPt(int absPt) {
		this.absPt = absPt;
	}
	public int getAttPt() {
		return attPt;
	}
	public void setAttPt(int attPt) {
		this.attPt = attPt;
	}
	public int getMiddTst() {
		return middTst;
	}
	public void setMiddTst(int middTst) {
		this.middTst = middTst;
	}
	public int getLstTst() {
		return lstTst;
	}
	public void setLstTst(int lstTst) {
		this.lstTst = lstTst;
	}
	
	
	
}