package javaexp.a09_inherit;

public class A13_MultiInherit {

	public static void main(String[] args) {
		/*
		 ex) Wing인터페이스, Swimming 인터페이스
		 class MultiSkillRobot implements Wing, Swimming
		 SwimmingWay, Wing
		*/
		MultiSkill01 ms01 = new MultiSkill01();
		MultiSkill02 ms02 = new MultiSkill02();
		ms01.allSkill();
		ms02.allSkill();
		
		// ex) StudyWay study(), PlayerWay play()
		//		인터페이스를 선언하고 2개를 implements한 실제 객체 Student01, Student02를 선언
		//		위 인터페이스를 재정의 한 내용을 출력하는 메서드 호출
		Student01 s01 = new Student01();
		Student02 s02 = new Student02();
		s01.all();
		s02.all();
	}

}
interface StudyWay{
	void study();
}

interface PlayerWay {
	void play();
}

class Student01 implements StudyWay, PlayerWay {

	@Override
	public void play() {
		System.out.println("그저 놀다..");
	}

	@Override
	public void study() {
		System.out.println("공부하다가...");
	}
	
	public void all() {
		study();
		play();
	}
}

class Student02 implements StudyWay, PlayerWay {

	@Override
	public void play() {
		System.out.println("냅다 놀기..~");
	}

	@Override
	public void study() {
		System.out.println("공부하다가...");
	}
	
	public void all() {
		study();
		play();
	}
}

class MultiSkill01 implements SwimmingWay, Wing {

	@Override
	public void fly() {
		System.out.println("우리 동네를 날다.");
	}

	@Override
	public void swimming() {
		System.out.println("호수가를 수영하다.");
	}
	
	public void allSkill() {
		fly();
		swimming();
	}
	
}

class MultiSkill02 implements SwimmingWay, Wing {

	@Override
	public void fly() {
		System.out.println("우리 나라 전국을 날다.");
	}

	@Override
	public void swimming() {
		System.out.println("바다를 수영하다.");
	}
	
	public void allSkill() {
		fly();
		swimming();
	}
	
}



