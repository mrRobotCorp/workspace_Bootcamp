package backendWeb2.z01_vo;

public class Code {
	private int no;
	private String title;
	private int refno;
	private int ordno;
	private String val;

	
	public Code(String title, int refno, int ordno, String val) {
		this.title = title;
		this.refno = refno;
		this.ordno = ordno;
		this.val = val;
	}
	public Code(String title, String val) {
		this.title = title;
		this.val = val;
	}
	public Code(int no, String title, int refno, int ordno, String val) {
		this.no = no;
		this.title = title;
		this.refno = refno;
		this.ordno = ordno;
		this.val = val;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public Code(int no, String title, int refno, int ordno) {
		this.no = no;
		this.title = title;
		this.refno = refno;
		this.ordno = ordno;
	}
	public Code() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRefno() {
		return refno;
	}
	public void setRefno(int refno) {
		this.refno = refno;
	}
	public int getOrdno() {
		return ordno;
	}
	public void setOrdno(int ordno) {
		this.ordno = ordno;
	}
}
