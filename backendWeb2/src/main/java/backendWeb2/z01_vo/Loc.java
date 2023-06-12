package backendWeb2.z01_vo;

public class Loc {
	private int locId;
	private String strAddrs;
	private String pstCode; // -(대쉬) 포함되어 있기 때문에 String으로 변환
	private String city;
	private String stPro;
	private String ctryId;
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getStrAddrs() {
		return strAddrs;
	}
	public void setStrAddrs(String strAddrs) {
		this.strAddrs = strAddrs;
	}
	public String getPstCode() {
		return pstCode;
	}
	public void setPstCode(String pstCode) {
		this.pstCode = pstCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStPro() {
		return stPro;
	}
	public void setStPro(String stPro) {
		this.stPro = stPro;
	}
	public String getCtryId() {
		return ctryId;
	}
	public void setCtryId(String ctryId) {
		this.ctryId = ctryId;
	}
	public Loc(int locId, String strAddrs, String pstCode, String city, String stPro, String ctryId) {
		this.locId = locId;
		this.strAddrs = strAddrs;
		this.pstCode = pstCode;
		this.city = city;
		this.stPro = stPro;
		this.ctryId = ctryId;
	}
	public Loc(String strAddrs, String city) {
		this.strAddrs = strAddrs;
		this.city = city;
	}
	
	
	
}
