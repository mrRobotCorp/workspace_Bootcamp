package milrim_project.login.m04_vo;


import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

// milrim_project.login.m04_vo.Freeboard
@Data
public class Freeboard {

	private String postid;
	private String title;
	private String content;
	private Date fbdate;
	private String id;
	
	public Freeboard() {
		super();
		// TODO Auto-generated constructor stub
	}
    public String getFbdate() {
        if (fbdate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.format(fbdate);
        }
        return null;
    }
	
	
}
