package a01_diexp_z05_mvc;

import java.util.List;

import org.springframework.stereotype.Service;

import backendWeb.z01_vo.Dept;

@Service
public class Web_service {
	private Web_Dao dao;
	
	public Web_service() {
		dao = new Web_Dao();
	}
	
	// service는 조건문 반복문에 의해 요청값에 대한 filtering 처리 나
	// 모델데이터에 대한 변경 로직 처리
	public List<Dept> deptList(Dept sch) {
		if(sch.getDname() == null) sch.setDname("");
		if(sch.getLoc() == null) sch.setLoc("");
		
		return dao.deptList(sch);
	}
}
