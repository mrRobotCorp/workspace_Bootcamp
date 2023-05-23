package frontWeb2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import frontWeb2.vo.Departments;
import frontWeb2.vo.Emp;
import frontWeb2.vo.Employee;
import frontWeb2.vo.JobHistory;
import frontWeb2.vo.Jobs;

public class A04_PreParedDao {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<Employee> getEmpList(Map<String, String> sch) {
		List<Employee> elist = new ArrayList<Employee>();

		String sql = "SELECT * FROM EMPLOYEES "
				+ "WHERE FIRST_NAME || LAST_NAME  LIKE '%' || ? || '%'"
				+ "AND SALARY BETWEEN ? AND ?";
		
		try {
			con = DB.con();
			// 초기에 sql을 넘기면서 pstmt 객체 생성
			pstmt = con.prepareStatement(sql);
			
			// pstmt.set데이터유형 (순서는 1부터, 입력 할 데이터)
			pstmt.setString(1, sch.get("name")); // 컬럼명과 노상관
			pstmt.setDouble(2, Double.parseDouble(sch.get("minSal"))); // 받은 값 형변환
			pstmt.setDouble(3, Double.parseDouble(sch.get("maxSal")));
			
			rs = pstmt.executeQuery(); // 매개변수 위에서 가져왔기 때문에 또 필요 X.
			
			while(rs.next()) {
				elist.add(new Employee(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getDate("hire_date"),
						rs.getString("job_id"),
						rs.getDouble("salary"),
						rs.getDouble("commission_pct"),
						rs.getInt("manager_id"),
						rs.getInt("department_id")
					));
			}
			
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("기타 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}
		
		
		return elist;
	}
	
	public List<JobHistory> getJobList(Map<String, String> sch) {
		List<JobHistory> jlist = new ArrayList<JobHistory>();
		
		String sql = "SELECT *\r\n"
				+ "FROM JOB_HISTORY\r\n"
				+ "WHERE JOB_ID LIKE '%' || ? || '%'\r\n"
				+ "AND DEPARTMENT_ID BETWEEN ? AND ?";
		
		try {
			
			
			con = DB.con();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sch.get("job")); // 컬럼명과 노상관
			pstmt.setInt(2, Integer.parseInt(sch.get("minId")) ); // 받은 값 형변환
			pstmt.setInt(3, Integer.parseInt(sch.get("maxId")) );
			
			rs = pstmt.executeQuery();
			
			//int employee_id, String start_date, String end_date, String job_id, int department_id
			while(rs.next()) {
				jlist.add(new JobHistory(
						rs.getInt("employee_id"),
						rs.getString("start_date"),
						rs.getString("end_date"),
						rs.getString("job_id"),
						rs.getInt("department_id")
					));
			}
			
			
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 :" + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}
		
		return jlist;
	}
	
	public List<Jobs> getJobs(Map<String, String> sch) {
		List<Jobs> jbList = new ArrayList<>();
		String sql = "SELECT *\r\n"
				+ "FROM JOBS\r\n"
				+ "WHERE JOB_TITLE LIKE '%' || ? || '%'\r\n"
				+ "AND MIN_SALARY BETWEEN ? AND ?";
		
		try {
			con = DB.con();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, sch.get("jtitle"));
			pstmt.setInt(2, Integer.parseInt(sch.get("minSal")));
			pstmt.setInt(3, Integer.parseInt(sch.get("maxSal")));
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				jbList.add(new Jobs(
						rs.getString("job_id"),
						rs.getString("job_title"),
						rs.getInt("min_salary"),
						rs.getInt("max_salary")
					));
			}
			
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch	(Exception e) {
			System.out.println(e.getMessage());			
		} finally {
			DB.close(rs, pstmt, con);
		}
		
		return jbList;
	}
	
	public void insertEmp(Emp ins) {
		String sql = "INSERT INTO EMP02 values(?, ?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?, ?, ?)";
		try {
			con = DB.con();
			// 자동 commit 방지
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, ins.getEmpno());
			pstmt.setString(2, ins.getEname());
			pstmt.setString(3, ins.getJob());
			pstmt.setInt(4, ins.getMgr());
			pstmt.setString(5, ins.getHiredateS());
			pstmt.setDouble(6,ins.getSal());
			pstmt.setDouble(7, ins.getComm());
			pstmt.setInt(8, ins.getDeptno());
			
			System.out.println(pstmt.executeUpdate());
			con.commit(); // 입력 시 확정 commit
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("DB : " + e.getMessage());
			
			try {
				con.rollback(); // 잘못 입력 시 rollback 복구 처리
			} catch (SQLException e1) {
				System.out.println(e.getMessage());
			}
			
		} catch(Exception e) {
			System.out.println("일반" + e.getMessage());
		} finally {
			DB.close(rs, pstmt, con);
		}
	
	}
	
	public void insertDep(Departments dep) {
		String sql = "INSERT INTO DEPARTMENTS10 values(?, ?, ?, ?)";
		
		try {
			con = DB.con();
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dep.getD_id());
			pstmt.setString(2, dep.getD_name());
			pstmt.setInt(3, dep.getManager_id());
			pstmt.setDouble(4, dep.getLoc_id());
			
			System.out.println(pstmt.executeUpdate());
			con.commit(); 
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		} finally {
			DB.close(rs, pstmt, con);
		}
	}
	
	
	
	public static void main(String[] args) {
		A04_PreParedDao dao = new A04_PreParedDao();
		
//		Map<String, String> sch = new HashMap<String, String>();
//		sch.put("name", "A");
//		sch.put("minSal", "0");
//		sch.put("maxSal", "12000");
//		
//		for(Employee e:dao.getEmpList(sch)) {
//			System.out.print(e.getEmployee_id() + "\t");
//			System.out.print(e.getLast_name() + "\t");
//			System.out.print(e.getFirst_name() + "\t");
//			System.out.print(e.getEmail() + "\t");
//			System.out.print(e.getSalary() + "\t");
//			System.out.println(e.getDepartment_id());
//		}
		
//		Map<String, String> sch = new HashMap<String, String>();
//		sch.put("job", "A");
//		sch.put("minId", "10");
//		sch.put("maxId", "120");
//		
//		for(JobHistory j:dao.getJobList(sch)) {
//			System.out.print(j.getEmployee_id() + "\t");
//			System.out.print(j.getStart_date() + "\t");
//			System.out.print(j.getEnd_date() + "\t");
//			System.out.print(j.getJob_id() + "\t");
//			System.out.println(j.getDepartment_id());
//		}

//		Map<String, String> sch = new HashMap<String, String>();
//		sch.put("jtitle", "S");
//		sch.put("minSal", "1000");
//		sch.put("maxSal", "10000");
//		
//		for(Jobs j:dao.getJobs(sch)) {
//			System.out.print(j.getJob_id() + "\t");
//			System.out.print(j.getJob_title() + "\t");
//			System.out.print(j.getMin_salary() + "\t");
//			System.out.println(j.getMax_salary());
//		}
		
		// INSERT INTO EMP02 values(1003, 'Sam', 'manager', 7900, sysdate, 3500, 300, 10);
		// int empno, String ename, String job, int mgr, String hiredateS, Double sal, Double comm, int deptno
//		Emp ins = new Emp(1005, "Harry", "인턴", 7902, "2023-05-23", 7000.0, 1000.0, 30);
//		dao.insertEmp(ins);
		
		// int d_id, String d_name, int manager_id, double loc_id
		Departments dep = new Departments(15, "front-end programming", 101, 1900);
		dao.insertDep(dep);
		
		
		
		
		
	}

}
