package milrim_project.login.m02_Service;

import java.util.List; 

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import milrim_project.login.m03_dao.AdminDao;
import milrim_project.login.m04_vo.Freeboard;
import milrim_project.login.m04_vo.Member;

@Service
public class AdminService {

	@Autowired
	private AdminDao dao;

	// 회원 조회
	public List<Member> adminMemList(@Param("id") String id){
		if(id==null) id="";
		return dao.adminMemList(id);
	}

	// 회원 삭제
	public String adminMemDel(@Param("id") String id) {
		if(id==null) id="";
		return dao.adminMemDel(id)>0?"삭제 실패":"삭제 성공";
	}
	
	
	
	// 자유게시판 조회
	public List<Freeboard> adminPstList(@Param("title") String title){
		if(title==null) title="";
		return dao.adminPstList(title);
	}

	// 자유게시판 삭제
	public String adminPstDel(@Param("postid")String postid) {
		if(postid==null) postid="";
		return dao.adminPstDel(postid)>0?"삭제 실패":"삭제 성공";
	}











}




















































