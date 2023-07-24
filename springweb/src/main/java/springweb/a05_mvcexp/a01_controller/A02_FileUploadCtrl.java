package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a05_mvcexp.a02_service.A02_FileUploadService;

@Controller
public class A02_FileUploadCtrl {
	
	/*
	ex) a02_config 파일 만들어서
	영어 - 이름, 나이, 사는 곳 설정
	@GetMapping("upload01.do") 로 호출하여 출력
	*/
	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${loc}")
	private String loc;
	
	@Autowired
	private A02_FileUploadService service;
	
	@GetMapping("upload01.do")
	public String upload01() {
		System.out.print("이름 : " + name + "\t");
		System.out.print("나이 : " + age + "\t");
		System.out.println("사는 곳 : " + loc);
		return "WEB-INF\\views\\a05_mvcexp\\a03_fileupload.jsp";
	}
	
	@PostMapping("upload01.do")
	public String upload01(@RequestParam("report") MultipartFile[] mf,
						@RequestParam("title") String title, Model d) {		
		/*
		for(MultipartFile m:mf) {
			System.out.println("업로드 파일 : " + m.getOriginalFilename());
		}
		System.out.println("자료명 : " + title);
		service.uploadFile(mf, title);
		*/
		
		d.addAttribute("msg", service.uploadFile(mf, title));
		return "WEB-INF\\views\\a05_mvce mxp\\a03_fileupload.jsp";
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
		service.uploadFile(mf, img01);
		return "WEB-INF\\views\\a05_mvcexp\\a04_fileupload.jsp";
	}
	
}
