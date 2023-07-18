package springweb.a05_mvcexp.a03_dao;

import java.util.List;

import springweb.a05_mvcexp.z01_vo.Member;

// springweb.a05_job.a03_dao.A01_MemberDao
public interface A01_MemberDao {
	public List<Member> memberList(Member sch);
}
