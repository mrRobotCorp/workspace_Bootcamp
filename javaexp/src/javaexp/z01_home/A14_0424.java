package javaexp.z01_home;

public class A14_0424 {

	public static void main(String[] args) {
		// 1. 추상클래스와 일반 재정의 클래스의 차이점을 예제를 통해 기술하세요
		/*
			1. 객체 생성의 독립성
				일반 클래스는 가능하지만, 추상 클래스는 불가능
				ex) 추상 클래스 참조 = new 추상 클래스(); (X)
			2. 메서드의 재정의 강제성
				일반 클래스의 메서드는 재정의 선택적이지만 추상 클래스의 추상 메서드는 반드시 재정의해야 함.
				
		
		*/
		// 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
		// 좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		
		
		
		
		// 3. 위 내용을 DailyFoodSchedule로 1:다 관계로 먹는 사람과 일일 식사메뉴 3개를 
		// Food타입 리스트로 처리할 수 있게 기능메서드 선언하여 출력하세요.
		/*
			Food를 ArrayList 타입으로 받고 getName을 통해 --를 먹는다 출력 메서드 생성.
			showMenu 를 통해 메뉴 모두 출력 -> if문 ArrayList의 size가 0보다 크면 for(Food f:fList) 를 통해
			eat(), taste() 메서드 출력, else 메뉴가 선택되지 않음
		*/
		
		// 4. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		/*
			1. 필드 : public static final이 항상 포함되어 있음 (인터페이스.필드 - 독립적 사용)
			2. 재정의 추상 메서드 : public abstract 생략 (하위 객체를 통해서만 사용 가능)
			3. default 실제 메서드 : 공통 기능 메서드 (하위 객체를 통해서만 사용 가능)
			4. static 실제 메서드 : 공통 기능 메서드 (인터페이스.메서드() - 독립적 사용)
		*/
		
		
		// 5. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 
		// 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
		// addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
		/*
			인터페이스 처리 2단계
			FishingWay(goFishing())
			
			SeaFishing - 바다 낚시 기술
			RiverFishing - 강가 낚시 기술
			
			Fisher 
				FishingWay way;
				
				void addWay(FishingWay way) 
					this.way = way; // 하위 실제 객체에 따라 처리 될 내용 할당
				
				void goFishing()
					if(way != null) way.goFishing();
					else sysout no way
		*/
	}

}
interface FishingWay{
	void goFishing();
}

abstract class Food {
	String name;
	
	public Food(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " 을 먹다");
	}
	
	abstract void taste();
}

class Avocado extends Food {

	public Avocado() {
		super("아보카도");
	}
	
	public void eat() {
		super.eat();
	}

	@Override
	void taste() {
		
	}
}


