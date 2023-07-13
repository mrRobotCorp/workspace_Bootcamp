package a01_diexp.z01_vo;

import java.util.Properties;
import java.util.Set;

public class Gamer {
	private Set<String> bead;
	private Properties beadCnt;
	
	public Properties getBeadCnt() {
		return beadCnt;
	}

	public void setBeadCnt(Properties beadCnt) {
		this.beadCnt = beadCnt;
	}

	public Set<String> getPocket() {
		return bead;
	}
	
	public void showPocket() {
		System.out.println("주머니 안에 있는 구슬들");
		if(bead != null) {
			for(String bd:bead) {
				System.out.println(bd);
			}
		} else {
			System.out.println("구슬이 없음");
		}
	}

	public Set<String> getBead() {
		return bead;
	}

	public void setBead(Set<String> bead) {
		this.bead = bead;
	}

	public Gamer() {
		// TODO Auto-generated constructor stub
	}
	
	
}
