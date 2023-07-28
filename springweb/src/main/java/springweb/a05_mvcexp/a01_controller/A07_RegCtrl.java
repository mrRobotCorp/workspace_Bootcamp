package springweb.a05_mvcexp.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a05_mvcexp.a02_service.A07_RegService;
import springweb.a05_mvcexp.z01_vo.Region;

@Controller
public class A07_RegCtrl {
	@Autowired
	private A07_RegService service;
	//regList.do
	@GetMapping("regList.do")
	public String regList() {
		return "WEB-INF\\views\\a05_mvcexp\\a09_regList.jsp";
	}

	
	@RequestMapping("regData.do")
	public ResponseEntity<List<Region>> jobList(
		@RequestParam(value = "region_name",
					  defaultValue = "") String region_name){
		return ResponseEntity.ok(
			service.regionList(region_name));
	}	
	
	// regInsert.do?region_id=5&region_name=부산
	@RequestMapping("regInsert.do")
	public ResponseEntity<String> regInsert(Region ins){
		return ResponseEntity.ok(service.insertRegion(ins));
	}	
	
	
	@RequestMapping("getReg.do")
	public ResponseEntity<Region> getReg(int region_id) {
		return ResponseEntity.ok(service.getReg(region_id));
	}
	@RequestMapping("updateReg.do")
	public ResponseEntity<String> updateReg(Region upt) {
		return ResponseEntity.ok(service.updateReg(upt));
	}
	@RequestMapping("deleteReg.do")
	public ResponseEntity<String> deleteReg(int region_id) {
		return ResponseEntity.ok(service.deleteReg(region_id));
	}
	
}
