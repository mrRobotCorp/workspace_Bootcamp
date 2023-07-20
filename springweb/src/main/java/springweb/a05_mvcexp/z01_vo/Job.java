package springweb.a05_mvcexp.z01_vo;

public class Job {
	// String job_id, Stirng job_title, int min_sal, int max_sal
	private String job_id;
	private String job_title;
	private int min_sal;
	private int max_sal;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getMin_sal() {
		return min_sal;
	}

	public void setMin_sal(int min_sal) {
		this.min_sal = min_sal;
	}

	public int getMax_sal() {
		return max_sal;
	}

	public void setMax_sal(int max_sal) {
		this.max_sal = max_sal;
	}

	public Job(String job_id, String job_title, int min_sal, int max_sal) {
		this.job_id = job_id;
		this.job_title = job_title;
		this.min_sal = min_sal;
		this.max_sal = max_sal;
	}
	
	
	
}
