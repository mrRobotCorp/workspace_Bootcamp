package springweb.a05_mvcexp.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import backendWeb.z01_vo.Job;

public interface A06_AjaxDao {
	@Select("SELECT * FROM JOBS\r\n"
			+ "		WHERE JOB_ID LIKE '%'||#{job_id}||'%'\r\n"
			+ "		AND JOB_TITLE LIKE '%'||#{job_title}||'%'")
	public List<Job> getJobList(Job sch);
	
	
}
