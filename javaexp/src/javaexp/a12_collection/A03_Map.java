package javaexp.a12_collection;

import java.util.HashMap;
import java.util.Map;

public class A03_Map {

	public static void main(String[] args) {
		//문자열 key, 문자열 value로 설정 map 선언과 할당
		Map<String, String> map01 = new HashMap<String, String>();
		map01.put("1000", "name1");
		map01.put("1000", "name2"); // 키를 중복 처리
		map01.put("1002", "name3");
		map01.put("1003", "name3"); // 값을 중복 처리
		
		// map01.keySey() 키를 Set 객체로 가져오는 메서드
		for(String key:map01.keySet()) {
			System.out.print(key + "\t");
			// map01.get(key) : 해당 키의 값을 가져옴
			System.out.println(map01.get(key));
		}
		// 중복된 키 값은 마지막에 정의된 키값으로 출력(중복 키 모두 출력X) 값은 중복되어 모두 가져옴.
		// 키의 중복은 최종 입력된 것을 기준으로 처리됨.
		
		// ex) 물건명과 가격을 key/value 형식으로 설정해서 Map에 할당
		// 물건명이 중복된 것과 가격이 중복된 것을 입력하고 그 결과 출력
		Map<String, Integer> prod = new HashMap<String, Integer>();
		// Integer i = 300; <- autoBoxing
		// int num = i; <- autoUnBoxing
		prod.put("milk", 100);
		prod.put("cheese", 100);
		prod.put("cake", 100);
		prod.put("cake", 100);
		
		for(String p:prod.keySet()) {
			System.out.print(p + "\t");
			System.out.println(prod.get(p));
		}
		// 중복된 키 값은 마지막 입력 값만 출력(100, cheese), 중복된 value는 두 개 모두 출력
		
		// ex) 학생 번호를 key로 하여 학생 클래스로 정의하고 해당 학생 객체를 key에 할당하여 처리
		Map<Integer, StudentMap> stuMap = new HashMap<Integer, StudentMap>();
		stuMap.put(1000, new StudentMap("Sam", 69, 95, 59));
		stuMap.put(1000, new StudentMap("David", 75, 86, 79));
		stuMap.put(2000, new StudentMap("Kate", 89, 85, 89));
		stuMap.put(3000, new StudentMap("Ian", 90, 70, 89));
		stuMap.put(4000, new StudentMap("Chris", 99, 58, 79));
		
		for(int stNum:stuMap.keySet()) {
			StudentMap st = stuMap.get(stNum);
			System.out.println("학번 : " + stNum);
			System.out.print(st.getName() + "\t");
			System.out.print(st.getKor() + "\t");
			System.out.print(st.getEng() + "\t");
			System.out.println(st.getMath());
		}
		
		// ex) 물건의 serialNum을 key로 하여, Product 클래스를 만들어 Map 할당하고 출력
		Map<Long, Product> pro = new HashMap<Long, Product>();
		pro.put(7000001L, new Product("coffee", 3000, 2));
		pro.put(7000001L, new Product("candy", 1500, 3));
		pro.put(7000002L, new Product("jelly", 2000, 2));
		pro.put(7000003L, new Product("jelly", 3000, 2));
		pro.put(7000004L, new Product("cookie", 2000, 3));
		
		for(Long p:pro.keySet()) {
			Product pr = pro.get(p); // 순서대로 Product의 객체 생성
			System.out.println("물건의 일련 번호 : " + p);
			System.out.print(pr.getPname() + "\t"); // 생성한 객체에서 이름(getter메서드) 불러오기
			System.out.print(pr.getPrice() + "\t");
			System.out.println(pr.getCnt());
		}
		
	}

}
class Product {
	private String pname;
	private int price;
	private int cnt;

	public Product(String pname, int price, int cnt) {
		this.pname = pname;
		this.price = price;
		this.cnt = cnt;
	}

	public int getPrice() {
		return price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Product(String pname) {
		this.pname = pname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
class StudentMap {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public StudentMap(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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