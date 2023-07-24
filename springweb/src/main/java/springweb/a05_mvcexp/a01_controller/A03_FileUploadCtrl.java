package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class A03_FileUploadCtrl {
	/*
	자료명 : title01
	파일 form 요소명 : report01
	*/
	@GetMapping("uploadExp03.do")
	public String upload03() {
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}
	
	@PostMapping("uploadExp03.do")
	public String upload03(@RequestParam("report01") MultipartFile[] mfs,
					@RequestParam("title01") String title01) {
		for(MultipartFile m:mfs) {
			System.out.println("파일 요소 : " + m.getOriginalFilename());
		}
		System.out.println("자료명 : " + title01);
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}
	
}
