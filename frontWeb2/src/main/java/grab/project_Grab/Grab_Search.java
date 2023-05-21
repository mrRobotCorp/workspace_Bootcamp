package grab.project_Grab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Grab_Search {
	
	public static void main(String[] args) {
		
		Search s1 = new Search();
		s1.callProdDB();
		s1.doSearch();
	}

}

class Search {
	public Scanner sc = new Scanner(System.in);
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private ResultSet rs2;

	public void doSearch() {
		System.out.println("NO\tCATGRY\tBRAND\tNAME\t\t\tPRICE\tIN STOCK");

		while (true) {
			System.out.println("▶ 제품검색을 시작합니다");
			System.out.print("▶ 검색어를 입력해주세요('Q'입력시 종료합니다) >> ");
			String input = sc.nextLine();
			
			if (input.equals("Q")) {
				System.out.println("◆ 검색을 종료합니다 ◆");
				break;
			}
			System.out.println("▼ \"" + input + "\" 검색결과 ▼");
			System.out.println("NO\tCATGRY\tBRAND\tNAME\t\t\tPRICE\tIN STOCK");
			
//			for (int idx = 0; idx < pMap.size(); idx++) {
//				if (pMap.get(idx).getCategory().contains(input) || pMap.get(idx).getBrand().contains(input)
//						|| pMap.get(idx).getPname().contains(input)) {
//					ProductForSearch p = pMap.get(idx);
//					System.out.println((idx + 1) + "\t" + p.getCategory() + "\t" + p.getBrand() + "\t" + p.getPname()
//							+ "\t" + p.getPrice() + "\t" + p.getCount());
//				}
//			}
	

			try {
				con = Grab_DB.con();
				
				String sql = "SELECT * FROM grab_product";
				String sql2 = "SELECT * FROM grab_sheet";
				
				stmt = con.createStatement();
				
				rs = stmt.executeQuery(sql);
				rs2 = stmt.executeQuery(sql2);
				
				int row = 1;
				while(true) { 
					rs.next();
				
					if (rs.getString("pro_cat").contains(input) || rs.getString("pro_brand").contains(input)
							|| rs.getString("pro_name").contains(input)) {
						
						if(rs.getString("pro_cat").equals("기타")) {
							System.out.println((row++) + "\t" + rs.getString("pro_num")+ "\n" + rs.getString("pro_name") + "\t"
									+ rs.getString("pro_cat") + "\t" + rs.getString("pro_brand") + "\t" + rs.getInt("pro_price")
									+ "\t" + rs.getInt("pro_stock") + "\t" + rs.getString("pro_addrs"));
						}
						
						if(rs.getString("pro_cat").equals("피크")) {
							System.out.println((row++) + "\t" + rs.getString("pro_num")+ "\n" + rs.getString("pro_name") + "\t"
									+ rs.getString("pro_cat") + "\t" + rs.getString("pro_brand") + "\t" + rs.getInt("pro_price")
									+ "\t" + rs.getInt("pro_stock") + "\t" + rs.getString("pro_addrs"));
						}
					}
					
					if(rs2.getString("sht_singer").contains(input) || rs2.getString("sht_song").contains(input) ) {
						System.out.println((row++) + "\t" + rs2.getString("sht_num")+ "\n" + rs2.getString("sht_song") + "\t"
								+ rs2.getString("sht_singer") + "\t" + rs2.getString("sht_cat") + "\t" + rs2.getInt("sht_price")
								+ "\t" + rs2.getString("sht_addrs"));
					}
					
				}
		
//				rs.close();
//				stmt.close();
//				con.close();

			} catch (SQLException e) {
				System.out.println("DB 처리 예외 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("공통 예외 : " + e.getMessage());
			} finally {
				try {
					if(rs!=null) {
						rs.close();						
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				try {
					if(stmt!=null) {
						stmt.close();						
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				try {
					if(con!=null) {
						con.close();						
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} finally {
					Grab_DB.close(rs, stmt, con);
				}
			
		}

		}
	}

	
	
	public void callProdDB() {
		
		try {
			con = Grab_DB.con();
			
			String sql = "SELECT * FROM grab_product";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			int row = 1;
			while(rs.next()) { 
				System.out.print("행번호 : " + row++);
				System.out.print( "\t" + rs.getString("pro_num"));
				System.out.print( "\t" + rs.getString("pro_name"));
				System.out.print( "\t" + rs.getString("pro_cat"));
				System.out.print( "\t" + rs.getInt("pro_price"));
				System.out.print( "\t" + rs.getInt("pro_stock"));
				System.out.print( "\t" + rs.getString("pro_addrs"));
			}
	
			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("DB 처리 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("공통 예외 : " + e.getMessage());
		} finally {
			try {
				if(rs!=null) {
					rs.close();						
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(stmt!=null) {
					stmt.close();						
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(con!=null) {
					con.close();						
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				Grab_DB.close(rs, stmt, con);
			}
		
	}

}

class ProductForSearch {
	private String pname;
	private int price;
	private int count;
	private String category;
	private String brand;

	public ProductForSearch(String category, String brand, String pname, int price, int count) {
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
}