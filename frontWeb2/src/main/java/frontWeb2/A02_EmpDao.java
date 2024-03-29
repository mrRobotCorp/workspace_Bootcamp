package frontWeb2;

// sql 하위의 모든 패키지 불러오기
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontWeb2.vo.Emp;
import frontWeb2.vo.Jobs;
import frontWeb2.vo.Loc;

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
			// Statement 객체가 가지고 있는executeQuery() 메서드를 통해
			// ResultSet 객체를 생성
			rs = stmt.executeQuery(sql);
			// 행단위로 이동. 다음 행이 없을 때까지 실행
			int row = 1;
			while(rs.next()) { 
				System.out.print("행번호 : " + row++);
				// 열단위 데이터 가져오기. rs.get데이터유형("컬러명")
				System.out.print( "\t" + rs.getInt("empno"));
				// ex) 사원명과 관리자 번호, 급여 호출
				System.out.print( "\t" + rs.getString("ename"));
				System.out.print( "\t" + rs.getString("job"));
				System.out.print( "\t" + rs.getInt("mgr"));
				System.out.print( "\t" + rs.getDate("hiredate"));
				System.out.print( "\t" + rs.getDouble("sal"));
				System.out.print( "\t" + rs.getDouble("comm"));
				System.out.println( "\t" + rs.getInt("deptno"));
			}
			/*
			rs.next() : 반복을 통해서 행단위로 커서를 위치시킴
				// 다음 행이 데이터가 없으면 false 있으면 true
			while(rs.next()) { // 다음 행이 없을 때까지 반복
				sysout(cnt++);
			}
			
			rs.get데이터유형("컬러명")
			*/
			
			
			// 자원해제 : 역순위
			rs.close();
			stmt.close();
			con.close();

			
		} catch (SQLException e) {
			System.out.println("DB 처리 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("공통 예외 : " + e.getMessage());
		} finally {
			// 해제 전에 예외가 발생한 것을 처리
			try {
				if(rs!=null) {
					rs.close();						
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(stmt!=null) {
					stmt.close();						
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(con!=null) {
					con.close();						
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				// 해제되지 않은 자원해제 처리
				DB.close(rs, stmt, con);
			}
			
		}
		
	}
	
	public void paramEmp(String ename) {
		System.out.println("트래킹 0. 메서드 호출");
		
		String sql = "SELECT * FROM emp02\r\n"
				+ "WHERE ename \r\n"
				+ "LIKE '%' || '" + ename + "' || '%'";
		
//		System.out.println("트래킹 1. 매개변수 : " + ename);
//		// 출력되는 해당 내용 sql 편집기에 복붙해서 나오는지 확인할 수 있음.
//		System.out.println("트래킹 2. sql: " + sql); 
		
		try {
			// 1. 연결(예외처리)
			con = DB.con();
			// 2. 대화
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) { // 행단위 이동 커서
				// 열단위 호출 rs.get유형("컬럼명")
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
			// 4. 자원해제
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		
		
	}
	
	// 입력 값을 부서 번호, 리턴 할 값은 데이터 함수
	public int getDeptCount(int deptno) {
		int count = 0;
		String sql = "SELECT COUNT(*) cnt\r\n"
				+ "FROM EMP02\r\n"
				+ "WHERE deptno = " + deptno;
		try {
			// 1. 연결(예외처리)
			con = DB.con();
			// 2. 대화
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			
			// 데이터가 한 개만 나오는 경우 (row 단위)
			while(rs.next()) count = rs.getInt("cnt");
			// 4. 자원해제
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		
		return count;
	}
	
	// 사원번호의 급여를 리턴하는 메서드 선언
	public double getEmpnoSal(int empno) {
		double sal = 0;
		String sql = "SELECT sal\r\n"
				+ "FROM EMP02\r\n"
				+ "WHERE EMPNO =" + empno;
		try {
			con = DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				sal = rs.getDouble("sal");
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		return sal;
	}
	
	public Emp getEmp(int empno) {
		Emp emp = null;
		String sql = "select *\r\n"
				+ "from emp02\r\n"
				+ "where empno = " + empno;
		try {
			con = DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				// select * 의 순서대로 컬럼, 순서를 사용
				emp = new Emp(
					rs.getInt("empno"),		
					rs.getString(2),		
					rs.getString(3),		
					rs.getInt("mgr"),		
					rs.getDate(5),		
					rs.getDouble("sal"),		
					rs.getDouble("comm"),		
					rs.getInt(8)		
				);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		return emp;
	}
	
	public List<Emp> getEmpList(Emp sch) {
		List<Emp> elist = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "FROM EMP02\r\n"
				+ "WHERE ename LIKE '%' || '"+ sch.getEname() + "' || '%'\r\n"
				+ "AND job LIKE '%' || '" + sch.getJob() +"' || '%'";
		
		try {
			con = DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) { 
				elist.add(new Emp(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getDate(5),
						rs.getDouble(6),
						rs.getDouble(7),
						rs.getInt(8)
					));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		
		return elist;
	}
	
	public List<Loc> getLocList(Loc loc) {
		List <Loc> lList = new ArrayList<Loc>();
		String sql = "SELECT  * \r\n"
				+ "FROM LOCATIONS\r\n"
				+ "WHERE STREET_ADDRESS LIKE '%' || '" +loc.getStrAddrs() + "' || '%'\r\n"
				+ "AND city LIKE '%' || '" + loc.getCity() +"' || '%'";
		try {
			con = DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) { 
				lList.add(new Loc(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6)
					));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		
		return lList;
	}
	
	

	// A03_Dept -> select * from dept01 where deptno = 10
	// 부서번호 별로 부서정보 가져오기
	
	public Jobs getJobs(String jobId) {
		Jobs j = null;
		String sql = "SELECT *\r\n"
				+ "FROM JOBS\r\n"
				+ "WHERE JOB_ID = '" + jobId +"'";
		
		try {
			con = DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				// select * 의 순서대로 컬럼, 순서를 사용
				j = new Jobs(
					rs.getString(1),		
					rs.getString(2),		
					rs.getInt(3),		
					rs.getInt(4)		
				);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		
		return j;
	}
	
	
	public static void main(String[] args) {
		A02_EmpDao dao = new A02_EmpDao();
//		dao.empListAll();
	
//		System.out.println("10번 부서의 사원 건수 : " + dao.getDeptCount(10));

//		Scanner sc = new Scanner(System.in);
//		System.out.print("사원명을 입력하세요 : ");
//		String schEname = sc.nextLine();
//		dao.paramEmp(schEname);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("확인 할 부서번호 입력 : ");
//		int deptno = sc.nextInt();
//		System.out.println(deptno + "번 부서의 사원건수 : " + dao.getDeptCount(deptno));
		
//		System.out.println("급여 : " + dao.getEmpnoSal(7499));
		
//		Emp e = dao.getEmp(7499);
//		System.out.println("사원번호 7499");
//		System.out.println(e.getEname()); // ALLEN
//		System.out.println(e.getJob()); // SALESMAN
//		System.out.println(e.getDeptno()); // 30
		
//		Jobs jbs = dao.getJobs("AD_VP");
//		System.out.println(jbs.getJob_id());
//		System.out.println(jbs.getJob_title());
//		System.out.println(jbs.getMin_salary());
//		System.out.println(jbs.getMax_salary());
		
//		for(Emp e:dao.getEmpList(new Emp("A", "A"))) {
//			System.out.print(e.getEmpno() + "\t");
//			System.out.print(e.getEname() + "\t");
//			System.out.print(e.getJob() + "\t");
//			System.out.println(e.getSal());
//		}
		
		for(Loc l:dao.getLocList(new Loc("u", "o"))) {
			System.out.print(l.getCtryId() + "\t");
			System.out.print(l.getStrAddrs() + "\t");
			System.out.print(l.getCity() + "\t");
			System.out.print(l.getPstCode() + "\t");
			System.out.println(l.getLocId());
		}
		
	}

}
