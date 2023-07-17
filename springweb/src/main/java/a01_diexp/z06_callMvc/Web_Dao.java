package a01_diexp.z06_callMvc;

import java.util.List;

import org.springframework.stereotype.Repository;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Dept;

@Repository
public class Web_Dao {
	private A04_PreparedDao dao;
	
	public Web_Dao() {
		dao = new A04_PreparedDao();
	}
	
	public List<Dept> deptList(Dept sch) {
		return dao.getDeptList(sch);
	}
}
