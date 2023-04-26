package javaexp.a08_relation.vo;

public class Ram {
	private String company;
	private int memory;
	
	public Ram(String company, int memory) {
		this.company = company;
		this.memory = memory;
	}
	
	public Ram() {
		// TODO Auto-generated constructor stub
	}
	
	public void showInfo() {
		System.out.println("--- ram info ---");
		System.out.println("제조사 : " + company);
		System.out.println("메모리 : " + memory + "G");
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMemory() {
		return memory;
	}
	public Ram(int memory) {
		this.memory = memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
	
}
