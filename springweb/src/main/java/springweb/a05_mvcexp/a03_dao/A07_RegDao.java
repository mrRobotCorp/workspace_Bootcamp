package springweb.a05_mvcexp.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springweb.a05_mvcexp.z01_vo.Region;

public interface A07_RegDao {
	@Select("SELECT * \r\n"
			+ "FROM regions01\r\n"
			+ "WHERE REGION_NAME LIKE '%'||#{region_name}||'%'\r\n"
			+ "order by region_id")
	public List<Region> regionList(@Param("region_name")
		String region_name);
	@Insert("INSERT INTO regions01 values(\r\n"
			+ "			#{region_id},#{region_name})")
	public int insertRegion(Region insert);	
	
	
	@Select("SELECT * FROM REGIONS01\r\n"
			+ "WHERE REGION_ID = #{region_id}")
	public Region getRegion(@Param("region_id") int region_id);
	
	@Update("UPDATE REGIONS01\r\n"
			+ "	SET	region_id = #{region_id},\r\n"
			+ "		region_name = #{region_name}\r\n"
			+ "WHERE region_id = #{region_id}")
	public int updateReg(Region upt);
	@Delete("delete \r\n"
			+ "from REGIONS01\r\n"
			+ "where region_id=#{region_id}")
	public int deletReg(@Param("region_id") int region_id);

}
