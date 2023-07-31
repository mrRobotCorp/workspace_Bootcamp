package milrim_project.login.m03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import milrim_project.login.m04_vo.Freeboard;
import milrim_project.login.m04_vo.Member;

public interface AdminDao {
	
	// 회원 조회
	@Select("SELECT * FROM MEMBER WHERE id LIKE '%'||#{id}||'%' ")
	public List<Member> adminMemList(@Param("id") String id);

	// 회원 삭제
	@Delete("DELETE FROM member WHERE id = #{id}")
	public int adminMemDel(@Param("id") String id);
	
	

	// 자유게시판 조회
	@Select("SELECT postid,title,fbdate,id FROM freeboard WHERE title LIKE '%'||#{title}||'%'")
	public List<Freeboard> adminPstList(@Param("title") String title);

	// 자유게시판 삭제
	@Delete("DELETE FROM FREEBOARD WHERE postid = #{postid}")
	public int adminPstDel(@Param("postid")String postid);
	
	// 포스트



	// 포스트



}







































