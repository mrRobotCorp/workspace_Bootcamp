package javaexp.a08_relation.vo;

public class Music {
	// 필드는 접근 제어자를 private 선언(직접 접근이 안되고 간접 접근 처리)
	public String title;
	public String singer;
	public int year;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Music(String title, String singer, int year) {
		this.title = title;
		this.singer = singer;
		this.year = year;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
