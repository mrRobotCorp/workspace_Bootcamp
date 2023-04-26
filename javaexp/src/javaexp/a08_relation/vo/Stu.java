package javaexp.a08_relation.vo;

public class Stu {
	// 번호 	이름 	국어 	영어 	수학
	private int num;
	private String sName;
	private int kor;
	private int eng;
	private int math;
	
	public Stu() {
	}

	public Stu(int num, String sName, int kor, int eng, int math) {
		this.num = num;
		this.sName = sName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	
}
