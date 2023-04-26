package javaexp.a08_relation.vo;

public class Cpu {
	private String comp;
	private String spe;
	
	public Cpu(String comp, String spe) {
		this.comp = comp;
		this.spe = spe;
	}
	
	public void showInfo() {
		System.out.println("-- cpu info ---");
		System.out.println("제조사 : " + comp);
		System.out.println("spec : " + spe);
	}

	public String getComp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}


	public String getSpe() {
		return spe;
	}


	public void setSpe(String spe) {
		this.spe = spe;
	}
	
	

}
