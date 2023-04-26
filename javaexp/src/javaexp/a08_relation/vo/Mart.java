package javaexp.a08_relation.vo;

public class Mart {
	private String mname;
	private Product[] pArry;
	private String buyer;
	private int bIdx; // 구매 index
	
	public Mart() {
		// TODO Auto-generated constructor stub
	}
	public Mart(String mname) {
		this.mname = mname;
	}
	
	// 구매 갯수와 구매자 처리 메서드
	public void buyProdPlan(String buyer, int cnt) {
		this.buyer = buyer; // 구매자 
		pArry = new Product[cnt]; // 구매 할 물건의 종류 갯수 지정
		bIdx = 0; // 구매에 따라 구매 종류 갯수 초기화
		System.out.println(buyer + "가 물건 " + cnt + " 종류를 " + mname + "에서 구매 결정함.");
	}
	
	// 단위 구매 내용 처리
	public void buyProduct(Product prod) {
		
		if(pArry != null ) { // pArry.length nullpointer 에러 방지 목적
			System.out.println(buyer + "이/가 " + mname + "에서 물건 구매.");
			int cnt = pArry.length;
			// 구매하는 물건의 index가 구매 할 갯수보다 작아야 함.
			if(bIdx < cnt) {
				pArry[bIdx] = prod;
				System.out.print((bIdx + 1) + "번째 물건 " + prod.getName());
				System.out.println("를 " + prod.getCnt() + "개 구매함.");
				bIdx++;
				
				if(bIdx == cnt) {
					System.out.println("구매 할 종류 갯수 (" + cnt + ") 모두 채워짐.");
				}
				
			} else {
				System.out.println("구매 할 종류 갯수 (" + cnt + ") 더이상 구매 불가함.");
			}
			
		} else {
			checkValid();
		}
		
	}
	
	// 외부 사용 필요 없어서 private 현재 클래스 내에서만 호출 사용
	private void checkValid() {
		System.out.println("구매자와 구매 할 갯수 입력 필요함.");
		System.out.println("buyProdPlan(구매자명, 구매 종류 갯수) 호출 필요함" );
	}
	
	public void buyList() {
		if( pArry != null ) {
			System.out.println(buyer + "이/가 " + mname + "에서 구매한 물건 정보");
			System.out.println("총 갯수 : " + pArry.length);
			System.out.println("물건명\t가격\t갯수\t단위계");
			int tot = 0;
			for(Product prod:pArry) {
				tot += prod.totBuyInfo();
			}
			System.out.println("총 구매 비용 : " + tot);
		} else	{
			checkValid();
		}
	}
	
	
	
}
