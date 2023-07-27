package milrim_project.login.m03_dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import milrim_project.login.m04_vo.Member;

public interface MemberDao {

	@Insert("INSERT INTO MEMBER VALUES (#{id},#{pass},#{name},#{email},#{phonenumber},'user')")
	public void insMember(Member ins);

	@Select("SELECT COUNT(*) as ys FROM MEMBER WHERE id = #{id}")
	public int idcMem(String id);
	
	@Select("SELECT COUNT(*) as id FROM MEMBER WHERE id = #{id} AND pass = #{pass}")
	public int loginYS(Member sch);

	@Select("SELECT id FROM MEMBER WHERE name = #{name} AND PHONENUMBER  = #{phonenumber}")
	public String findId(@Param("name")String name, @Param("phonenumber") String phonenumber);
	
	@Select("SELECT pass FROM MEMBER WHERE id = #{id} AND PHONENUMBER = #{phonenumber}")
	public String findPass(@Param("id") String id, @Param("phonenumber") String phonenumber);
	
	
	
	
	
	
	
	
	
	
	
	
}