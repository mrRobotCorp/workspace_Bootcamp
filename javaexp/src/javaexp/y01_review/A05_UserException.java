package javaexp.y01_review;

import java.util.Scanner;

public class A05_UserException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) { // 예외가 발생하지 않을 때까지 반복 실행.
			try {
				System.out.print("입력 할 아이디 : ");
				String id = sc.nextLine();
				int leng = id.length();
				if(leng < 8 || leng > 16) { // 8자 미만 16자 이상(잘못 입력)
					throw new InIdExcep(leng + "자");
				}
				System.out.println("입력한 id :" + id);
				break; // 위 if문에 예외가 걸리지 않고 그 다음 실행이 이루어지면 break. 반복 종료.
			} catch (InIdExcep e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("success");

	}

}
class InIdExcep extends Exception {

	public InIdExcep(String message) {
		super("입력한 글자 수는 " + message + " 입니다.");
	}

	@Override
	public String getMessage() {
		return "[입력 오류] : " + super.getMessage() + "\n아이디는 8-16자 사이 입력 가능.";
	}
	
	
	
}