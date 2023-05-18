package frontWeb2;

// sql 하위의 모든 패키지 불러오기
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A02_EmpDao {
	// 1. 필드선언(핵심 내장 객체)
	// 	1) 연결 - 서버 연결
	private Connection con;
	//	2) 대화 - 명령/입력값
	private Statement stmt;
	//	3) 결과 - 데이터 가져오기
	private ResultSet rs;
	
	// 2. 기능 메서드 선언
	//	1) 사원 전체 정보 출력
	public void empListAll() {
		// ** 전체적으로 예외 처리 **
		// 연결
		try {
			con = DB.con();
			// 대화 할 내용
			String sql = "SELECT * FROM emp02";
			// 대화할 수 있는 개체는 연결(con)에 의해 생성
			stmt = con.createStatement();
			// 결과 (ResultSet)
			rs = stmt.executeQuery(sql);
			// 행단위로 이동. 다음 행이 없을 때까지 실행
			int row = 1;
			while(rs.next()) { 
				System.out.print("행번호 : " + row++);
				// 열단위 데이터 가져오기. rs.get데이터유형("컬러명")
				System.out.print( "\t" + rs.getInt("empno"));
				// ex) 사원명과 관리자 번호, 급여 호출
				System.out.print( "\t" + rs.getString("ename"));
				System.out.print( "\t" + rs.getInt("mgr"));
				System.out.println( "\t" + rs.getInt("sal"));
			}
			/*
			rs.next() : 반복을 통해서 행단위로 커서를 위치시킴
				// 다음 행이 데이터가 없으면 false 있으면 true
			while(rs.next()) { // 다음 행이 없을 때까지 반복
				sysout(cnt++);
			}
			
			rs.get데이터유형("컬러명")
			*/
			
			
			// 자원해제

			
		} catch (SQLException e) {
			System.out.println("DB 처리 예외 : " + e.getMessage());
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		A02_EmpDao dao = new A02_EmpDao();
		dao.empListAll();

	}

}
