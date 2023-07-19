package backendWeb.z02_exp;

import java.util.ArrayList;
import java.util.List;

import springweb.a05_mvcexp.z01_vo.Member;

public class A01_InterfaceExp {

	public static void main(String[] args) {
		// 다형성의 형태, 추상 -> 실제
		Flyway f01 = new CountryFly();
		// 추상인터페이스의 메서드가 실제를 상속해주었기 때문에
		// 상속한 실제 객체의 내용을 처리해줌
		f01.flying();
		MemberDao dao;
		dao = new MemberDaoImpl();
		dao.memberList();
	}

}

interface Flyway{
	void flying();
}

interface MemberDao {
	public List<Member> memberList();
}
// mybatis --> XXMapper.xml에 의해서 sql
//	인터페이스명, 메서드명, 리턴값, 매개변수 -> XXX.Mapper.xml
class MemberDaoImpl implements MemberDao {
	@Override
	public List<Member> memberList() {
		ArrayList<Member> mlist = new ArrayList<Member>();
		mlist.add(new Member());
		mlist.add(new Member());
		mlist.add(new Member());
		return mlist;
	}
}

class CountryFly implements Flyway {
	@Override
	public void flying() {
		System.out.println("동네를 날다");
	}
}
