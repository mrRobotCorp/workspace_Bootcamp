package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class A02_FileUploadCtrl {
	@GetMapping("upload01.do")
	public String upload01() {
		return "WEB-INF\\views\\a05_mvcexp\\a03_fileupload.jsp";
	}
	
	@PostMapping("upload01.do")
	public String upload01(@RequestParam("report") MultipartFile[] mf,
						@RequestParam("title") String title) {		
		for(MultipartFile m:mf) {
			System.out.println("업로드 파일 : " + m.getOriginalFilename());
		}
		System.out.println("자료명 : " + title);
		return "WEB-INF\\views\\a05_mvcexp\\a03_fileupload.jsp";
	}
	/*
	A02_FileUploadCtrl 추가 메서드로 upload02.do로 해서
	a04_fileupload.jsp
	자료명 - img01 , 파일요소 - image로 처리 후 자료 출력
	*/
	@GetMapping("upload02.do")
	public String upload02() {
		return "WEB-INF\\views\\a05_mvcexp\\a04_fileupload.jsp";
	}
	
	@PostMapping("upload02.do")
	public String upload02(@RequestParam("image") MultipartFile[] mf,
						@RequestParam("img01") String img01) {
		for(MultipartFile m:mf) {
			System.out.println("업로드 파일 : " + m.getOriginalFilename());
		}
		System.out.println("자료명 : " + img01);
		return "WEB-INF\\views\\a05_mvcexp\\a04_fileupload.jsp";
	}
	
}
