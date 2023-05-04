package javaexp.z01_home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A19_0503 {

	public static void main(String[] args) {
		
		// 1. set객체의 특징을 예제를 통하여 기술하세요
		Set<String> ex01 = new HashSet<String>();
		// add 메서드로 객체를 추가할 수 있다.
		ex01.add("데이터1"); 
		ex01.add("데이터2");
		ex01.add("데이터2");
		ex01.add("데이터3");

		for(String s01:ex01) {
			// 데이터1, 2, 3만 출력된다. 중복 데이터는 반복 출력하지 않는다.
			System.out.println(s01);
		}
		// 모든 객체 삭제 메서드 clear()
		ex01.clear();
		
		// 2. 사과, 바나나, 딸기, 오렌지, 수박을 랜덤으로 10회 Set 주머니에 넣었을 때, 들어간 과일의 종류를 출력하세요.
		Set<String> fruit = new HashSet<String>();
		String[] fname = {"사과", "바나나", "딸기", "오렌지", "수박"};
		Random r1 = new Random();
		
		for(int i=1; i<=10; i++) {
			String fRan = fname[r1.nextInt(5)];
			fruit.add(fRan);			
		}
		
		System.out.println("-- 들어있는 모든 과일 종류 --");
		for(String f:fruit) {
			System.out.println(f);
		}
		
		// 3. map객체의 특징을 기본 예제를 통하여 설명하세요
		
		// key와 value 값을 객체로 가진다
		Map<Integer, String> ex03 = new HashMap<Integer, String>();
		ex03.put(101, "name1");
		ex03.put(101, "name2"); // key 중복은 마지막 저장 value만 출력
		ex03.put(102, "name3");
		ex03.put(103, "name4");
		ex03.put(104, "name4"); // value 중복은 중복에 상관없이 모두 출력
		
		for(int e03:ex03.keySet()) {
			System.out.println(e03 + ex03.get(e03));
		}
		
		// 4. map으로 회원의 정보를 저장할려고 한다. 저장하고 저장된 정보를 호출할 때, 동일한 id로 회원 정보를
		// 입력하고 변경되는 회원 정보를 처리해보세요.4
		/*
			1. 회원 정보 설정 (아이디 제외)
			2. class 정의 (회원 정보 설정) Member
			3. Map<String, Member>
			4. 회원 등록
				mem.put("skrr", new Member("Joe", "admin", 7777));
				mem.put("skrr2", new Member("Joe", "admin", 7777));
			5. 회원 정보 수정 : 마지막에 추가된 key값으로 설정됨(수정)
				mem.put("skrr", new Member("Amy", "admin", 9999)); <- 첫 번째 회원 내용은 해당 내용으로 수정됨(동일 key값)
		*/
		Map<String, Member> memInfo = new HashMap<String, Member>();
		memInfo.put("skrr", new Member("Joe", 59, "admin", 394));
		memInfo.put("skrrt", new Member("Amy", 35, "user", 346));
		memInfo.put("skkrt", new Member("Sam", 75, "admin", 753));
		memInfo.put("skrr", new Member("Tom", 26, "user", 1377));
		
		for(String mem:memInfo.keySet()) {
			Member mm = memInfo.get(mem);
			System.out.print("회원 ID : " + mem);
			System.out.println("\t회원 이름 : " + mm.getName() + "\t회원 나이 : " + mm.getAge() + "\t회원 권한 : " + mm.getAuth());
		}
		
		// 5. 입력처리하는 기본 객체와 출력 처리하는 기본 객체를 기본예제를 통해 설명하세요.
		
		// 입력을 처리하는 InputStream. in01이라는 객체 생성
		InputStream in01 = System.in;
		// 출력을 처리하는 OutputStream. out01이라는 객체 생성
		OutputStream out01 = System.out;
		
		
		// 6. c:\a01_javaexp\z01_fileExp\ 하위에 a1~a9폴드가 생성되고, 각 폴드에 show01.txt~show09.txt 파일을 생성해보세요.
		String path01 = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\z01_home\\z01_fileExp\\";
		
		for(int i=1; i<=9; i++) {
			File f = new File(path01 + "a" + i);
			f.mkdir();
			for(int j=1; j<=9; j++) {
				File txtF = new File(path01 + "a" + i + "\\show0" + j + ".txt");				
				try {
					txtF.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// 7. c:\a01_javaexp\z01_fileExp\a1\show01.txt에 입력받은 물건명/가격/갯수 정보를 저장하세요.
		String path02 = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\z01_home\\z01_fileExp\\a1\\show01.txt";
		Scanner sc = new Scanner(System.in);
		Writer pInfo = null;
		
		try {
			pInfo = new FileWriter(path02);
			System.out.println("물건명을 입력 : ");
			String pname = sc.nextLine();
			
			System.out.println("가격을 입력 : ");
			String price = sc.nextLine();
			
			System.out.println("갯수를 입력 : ");
			String cnt = sc.nextLine();
			pInfo.append(pname + "\t" + price + "\t" + cnt);
			pInfo.flush();
			System.out.println("입력 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pInfo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

class Member {
	private String name;
	private int age;
	private String auth;
	private int point;
	public Member(String name, int age, String auth, int point) {
		this.name = name;
		this.age = age;
		this.auth = auth;
		this.point = point;
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
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}