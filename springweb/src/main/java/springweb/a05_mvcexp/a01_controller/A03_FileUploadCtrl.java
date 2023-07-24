package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a05_mvcexp.a02_service.A03_FileUploadService;

@Controller
public class A03_FileUploadCtrl {
	
	@Autowired
	private A03_FileUploadService service;
	/*
	자료명 : title01
	파일 form 요소명 : report01
	*/
	@GetMapping("uploadExp03.do")
	public String upload03() {
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}
	
	@Value("${user.upload}")
	private String path;
	
	@Value("${jdbc.url}")
	private String jdbc;

	
	@PostMapping("uploadExp03.do")
	public String upload03(@RequestParam("report01") MultipartFile[] mfs,
					@RequestParam("title01") String title01, Model d) {

		d.addAttribute("msg", service.uploadFile(mfs, title01));
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}
	
	/*	
	A03_FileUploadCtrl.java, upload03.do
	a05_fileupload.jsp
	자료명 : title01, form요소 : report01
	
	A03_FileUploadService
	A03_fileUploadCtrl
	*/
}
