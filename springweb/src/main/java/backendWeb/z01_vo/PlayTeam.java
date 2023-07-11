package backendWeb.z01_vo;

public class PlayTeam {
	private String tname;
	private String win;
	private int def;
	
	public PlayTeam(String tname, String win, int def) {
		this.tname = tname;
		this.win = win;
		this.def = def;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getWin() {
		return win;
	}
	public void setWin(String win) {
		this.win = win;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
}
