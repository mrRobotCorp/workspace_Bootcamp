package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Mart;
import a01_diexp.z01_vo.ShoppingMall;

public class DIExp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di13.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너의 객체호출:"+obj);
		
		Mart m01 = ctx.getBean("m01", Mart.class);
		m01.buyList();
		/*
		Member 아이디 패스워드 이름 권한 포인트
		ShoppingMall 쇼핑몰명 Member 
			mlist로 할당
			showMemberList()로 해당 쇼핑몰의 
			회원 리스트(회원 아이디, 이름, 권한, 포인트) 출력
		*/
		
		ShoppingMall sh01 = ctx.getBean("sh01", ShoppingMall.class);
		sh01.showMemberList();
		
		ctx.close();
		System.out.println("종료");
	}

}
