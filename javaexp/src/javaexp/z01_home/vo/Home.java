package javaexp.z01_home.vo;

public class Home {
	private int siblings = 0;
	private String location = "Seoul";
	
	public void HaveS(int siblings) {
		this.siblings = siblings;
		System.out.println("형제 수 : " + siblings);
	}

	public int getSiblings() {
		return siblings;
	}

	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}