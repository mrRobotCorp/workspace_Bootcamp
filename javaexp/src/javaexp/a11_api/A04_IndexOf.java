package javaexp.a11_api;

import java.util.Scanner;

public class A04_IndexOf {

	public static void main(String[] args) {
		String msg = "점심 시간 주세요";
		int idxLoc1 = msg.indexOf("아침");
		int idxLoc2 = msg.indexOf("시간");
		System.out.println("데이터가 없을 때 : " + idxLoc1); // -1 출력
		System.out.println("데이터가 있을 때 : " + idxLoc2); // 3 출력
		System.out.println("시간 문자열 검색 결과");
		
		if(idxLoc2 != -1) {
			System.out.println("검색이 되었음");
		} else {
			System.out.println("해당 데이터 X");
		}
		
		// ex) menu로 사과, 바나나, 딸기로 할당
//		 구매물건을 입력 : (scanner로 입력 받기) 판매 여부 출력
		String menu = "사과 바나나 딸기";
		System.out.println("-- 판매 과일 리스트 -- ");
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 물건을 입력 : ");
		int idx = menu.indexOf(sc.nextLine());
		
		if(idx != -1) {
			System.out.println("판매중인 과일입니다.");
		} else {
			System.out.println("해당 데이터 X");
		}
		
		String target = "자바는 객체지향 프로그램";
		String tChge = target.replace("자바", "JAVA");
		System.out.println("수정 후 결과 : " + tChge);
		
		String data = "Joe 90 50 70";
		String name = data.substring(0, 3);
		String kor = data.substring(4, 6);
		String eng = data.substring(7, 9);
		String math = data.substring(10, 12);
		
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.println(math);
		
		// ex) 주민번호 임의로 입력하여 substring으로 추출.
		// @@@@년 @@월 @@일생 <- 으로 출력
		String civilCode = "891212-1935245";
		
		String year = civilCode.substring(0, 2);
		String month = civilCode.substring(2, 4);
		String day = civilCode.substring(4, 6);
		
		int pYrs = Integer.parseInt(year);
		if(pYrs < 99) {
			year = 19 + year;
		}
		
		System.out.print(year + "년\t");
		System.out.print(month + "월\t");
		System.out.println(day + "일");
		
		String []fruits = "apple&banana&grape".split("&");
		System.out.println("-- 과일 종류 --");
		for(String f:fruits) {
			System.out.println(f);
		}
		
		// ex) 서울-대전-대구-광주-제주 라는 문자열 데이터 중 -을 구분자 설정
		// 이후 배열로 만들어 출력
		String []allPlace = "서울-대전-대구-광주-제주".split("-");
		System.out.println("-- 지역 리스트 --");
		
		for(String plc:allPlace) {
			System.out.println(plc);
		}
		
		// ex) Joe&90&60-Amy&80&50-Sam&60&70
		// name		nn		nn <- 한 줄에 이렇게 출력(2중 for문 사용)
		String []nameAll = "Joe&90&60-Amy&80&50-Sam&60&70".split("-");
		System.out.println("-- 학생 리스트 --");
		
		for(String na:nameAll) {
			String []se = na.split("&");
			for(String s:se) {
				System.out.print(s + "\t");
			}
			System.out.println();
		}
		
		
	}

}