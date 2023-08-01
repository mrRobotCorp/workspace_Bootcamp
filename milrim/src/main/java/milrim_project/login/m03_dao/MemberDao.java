package milrim_project.login.m03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import milrim_project.login.m04_vo.Member;
import milrim_project.login.m04_vo.Videopost;

/**
 * @author user
 *
 */
public interface MemberDao {
	// 회원가입
	@Insert("INSERT INTO MEMBER VALUES (#{id},#{pass},#{name},#{email},#{phonenumber},'user')")
	public void insMember(Member ins);
	// 회원가입 아이디 중복
	@Select("SELECT COUNT(*) as ys FROM MEMBER WHERE id = #{id}")
	public int idcMem(String id);
	// 로그인  SELECT COUNT(*) as id FROM MEMBER WHERE id = #{id} AND pass = #{pass}
	@Select("SELECT COUNT(*) as id FROM MEMBER \r\n"
			+ "	WHERE id = #{id} AND pass = #{pass}")
	public int loginYS(Member sch);
	// 세션 처리
	@Select("SELECT id, name, auth FROM member WHERE id = #{sid}")
	public Member makeSession(@Param("sid") String sid);
	
	// 아이디 찾기 
	@Select("SELECT id FROM MEMBER WHERE name = #{name} AND PHONENUMBER  = #{phonenumber}")
	public String findId(@Param("name")String name, @Param("phonenumber") String phonenumber);
	
	// 비밀번호 찾기 
	@Select("SELECT pass FROM MEMBER WHERE id = #{id} AND PHONENUMBER = #{phonenumber}")
	public String findPass(@Param("id") String id, @Param("phonenumber") String phonenumber);
	

	
	
	
	
	
	
	
	
	
}
