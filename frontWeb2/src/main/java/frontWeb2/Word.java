package frontWeb2;

public class Word {
	private String eng;
	private String mean;
	
	public Word(String eng, String mean) {
		this.eng = eng;
		this.mean = mean;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}
	
}
