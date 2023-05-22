package project_Grab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Grab_Product {
	public static void main(String[] args) {

		AddProduct p1 = new AddProduct();
		// callPrDB
		// addPr
		// showPrList
		p1.addPr();	// 제품 등록 메소드(초반 제품리스트 하드코드로 입력)
		p1.showList();	// 등록완료후 등록된 전체 상품 리스트 출력 메소드

	}
}

class AddProduct {
	Scanner sc = new Scanner(System.in);
	int pNum = 4;
	int sNum = 4;
	int process = 0;
	public static Map<String, Product> pMap = new TreeMap<String, Product>();
	public static Map<String, Sheet> sMap = new TreeMap<String, Sheet>();

	public void addPr() {

		while (true) {
			System.out.println("상품 등록을 시작하겠습니다!");
			System.out.print("1. 악보 2. 상품 3. 프로세스 중지\n 입력 >> ");
			try {
				process = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요!!");
			}
			if (process == 1) {
				System.out.println("악보를 등록합니다! ");
				System.out.print("가수를 입력해주세요 >> ");
				String inputSinger = sc.nextLine();
				System.out.print("노래 제목을 입력해주세요 >> ");
				String inputSong = sc.nextLine();
				System.out.print("가격을 입력해주세요 >> ");
				int inputSong_price = Integer.parseInt(sc.nextLine());
				sNum++;
				String sCode = "S-" + sNum;
				sMap.put(sCode, new Sheet(inputSinger, inputSong, inputSong_price));

			}

			if (process == 2) {
				System.out.print("카테고리를 입력해 주세요 >> ");
				String inputCategory = sc.nextLine();
				System.out.print("브랜드를 입력해주세요 >> ");
				String inputBrand = sc.nextLine();
				System.out.print("상품명을 입력해주세요 >> ");
				String inputPname = sc.nextLine();
				System.out.print("가격을 입력해주세요 >> ");
				int inputPrice = Integer.parseInt(sc.nextLine());
				System.out.print("상품 개수를 입력해주세요 >> ");
				int inputCount = Integer.parseInt(sc.nextLine());
				pNum++;
				String pCode = "P-" + pNum;
				pMap.put(pCode, new Product(inputCategory, inputBrand, inputPname, inputPrice, inputCount));
			}

			if (process == 3) {
				break;
			}
		}
	}

	public void showList() {
		pMap.put("P-0", new Product("기타", "야마하", "SLG200S 어쿠스틱 기타", 850000, 90));
		sMap.put("S-0", new Sheet("아이유", "좋은날\t", 5000));
		pMap.put("P-1", new Product("기타", "야마하", "LL6 ARE 탑솔리드 통기타", 900000, 100));
		sMap.put("S-1", new Sheet("아이유", "celebrity", 3000));
		pMap.put("P-2", new Product("기타", "야마하", "LL16 ARE 올솔리드 통기타", 1350000, 80));
		sMap.put("S-2", new Sheet("루엘", "Painkiller", 5000));
		pMap.put("P-3", new Product("기타", "야마하", "LL26 ARE 올솔리드 통기타", 3790000, 10));
		sMap.put("S-3", new Sheet("더 위켄드", "Out Of Time", 4000));
		pMap.put("P-4", new Product("기타", "헥스", "FG500 올솔리드 OM 통기타", 499000, 250));
		sMap.put("S-4", new Sheet("더 위켄드", "Sacrifice", 4500));

		System.out.println("# 등록된 상품 리스트 #");
		System.out.println("NO\tCTGRY\tBRAND\tNAME\t\t\tPRICE\tIN STOCK");
		for (String prKey : pMap.keySet()) {
			Product pr = pMap.get(prKey);
			System.out.println(prKey+"\t"+pr.getCategory()+"\t"+pr.getBrand()+"\t"+pr.getPname()+"\t"+pr.getPrice()+"\t"+pr.getCount());
		}
		System.out.println("# 등록된 악보 리스트 #");
		System.out.println("NO\tSINGER\tNAME\t\tPRICE");
		for (String sKey : sMap.keySet()) {
			Sheet st = sMap.get(sKey);
			System.out.println(sKey+"\t"+ st.getSinger() + "\t" + st.getSong() + "\t"+ st.getSong_price());
		}
	}

}

class Product {
	private String pname;
	private int price;
	private int count;
	private String category;
	private String brand;

	public Product(String category, String brand, String pname, int price, int count) {
		this.pname = pname;
		this.price = price;
		this.count = count;
		this.category = category;
		this.brand = brand;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}

class Sheet {
	private String singer;
	private String song;
	private int song_price;

	public Sheet(String singer, String song, int song_price) {
		this.singer = singer;
		this.song = song;
		this.song_price = song_price;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public int getSong_price() {
		return song_price;
	}

	public void setSong_price(int song_price) {
		this.song_price = song_price;
	}

}