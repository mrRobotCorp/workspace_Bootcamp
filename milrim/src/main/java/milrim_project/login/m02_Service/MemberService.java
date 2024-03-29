package milrim_project.login.m02_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import milrim_project.login.m03_dao.MemberDao;
import milrim_project.login.m04_vo.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	// 회원가입=================
	public void insMember(Member ins) { //회원가입 인서트
		dao.insMember(new Member(ins.getId(),ins.getPass(),ins.getName(),
				ins.getEmail(),ins.getPhonenumber()));
	}
	
	public String idcMem(String id) { // 회원가입 아이디 검사
		dao.idcMem(id);
		return dao.idcMem(id)>0?"Y":"N";
	}
	
	// 로그인=================
	public String loginYS(Member sch) { // 로그인
		if(sch.getId()==null) sch.setId("");
		if(sch.getPass()==null) sch.setPass("");
		return dao.loginYS(sch)>0?"Y":"N";
	}
	
	public Member makeSession(String sid) {
		
		return dao.makeSession(sid);
	}

	// 아이디 찾기=================
	public String findID(String name, String phonenumber) {
		if(name==null) name="";
		if(phonenumber==null) phonenumber="";
		
		return dao.findId(name, phonenumber);
	}
	// 비밀번호 찾기=================
	public String findPASS(String id, String phonenumber) {
		if(id==null) id="";
		if(phonenumber==null) phonenumber="";
		
		return dao.findPass(id, phonenumber);
	}
	
	
}

