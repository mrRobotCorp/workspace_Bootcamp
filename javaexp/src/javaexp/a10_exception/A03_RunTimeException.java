package javaexp.a10_exception;

public class A03_RunTimeException {

	public static void main(String[] args) {
		
		// 입력되는 문자열 데이터 기능 메서드로 처리하는 내용
		System.out.println("프로그램 시작(이름 입력)");
		try {
			System.out.println("영문으로 이름을 입력");
			// 영문 이름 입력 시.
			String name = null; 
			
			System.out.println("소문자로 변환된 내용 : " + name.toLowerCase()); // 소문자로 변환
			String name2 = null;
			name2.hashCode(); // heap 메모에 객체가 없을 시 예외 발생하는 메서드. (강제 예외 처리)
			// 해당 라인에서 프로세스 즉시 중단
			
		// 에러 발생 시 복사한 예외를 catch에 입력
		} catch(NullPointerException e ) {
			System.out.println("이름 입력이 필요함.");
		} catch (Exception e) { // 기타 예측하지 못한 예외도 처리
			System.out.println(e.getMessage()); // 기타 예외의 정확한 에러 내용을 알기 위함.
		}
		System.out.println("프로그램 종료");

	}

}
