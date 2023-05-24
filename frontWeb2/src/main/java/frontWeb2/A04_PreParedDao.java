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
import frontWeb2.vo.Loc;

public class A04_PreParedDao {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<Employee> getEmpList1(Map<String, String> sch) {
        List<Employee> elist = new ArrayList<>();
        String sql = "SELECT * FROM EMPLOYEES WHERE UPPER(FIRST_NAME || last_name) LIKE UPPER(?) AND salary BETWEEN ? AND ?";
        try {
            con = DB.con();
            // 초기에 sql을 넘기면서 pstmt 객체 생성
 			pstmt = con.prepareStatement(sql);
 			
 			// pstmt.set데이터유형 (순서는 1부터, 입력 할 데이터)
            pstmt.setString(1, "%" + sch.get("name") + "%");
            pstmt.setDouble(2, Double.parseDouble(sch.get("minSal")));
            pstmt.setDouble(3, Double.parseDouble(sch.get("maxSal")));
            rs = pstmt.executeQuery();

            while (rs.next()) {
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
        } catch (SQLException e) {
            System.out.println("DB 관련 오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("일반 오류: " + e.getMessage());
        } finally {
            DB.close(rs, pstmt, con);
        }
        return elist;
    }
	
	public List<Employee> getEmpList2(Map<String, String> sch) {
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
	
	public List<Jobs> getJob(Map<String, String> sch) {
        List<Jobs> jobList = new ArrayList<>();
        String sql = "SELECT * FROM jobs WHERE UPPER(job_title) LIKE UPPER(?) AND MIN_SALARY BETWEEN ? AND ?";
        try {
            con = DB.con();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + sch.get("title") + "%");
            pstmt.setInt(2, Integer.parseInt(sch.get("min_sal1")));
            pstmt.setInt(3, Integer.parseInt(sch.get("min_sal2")));
            rs = pstmt.executeQuery();

            while (rs.next()) {
                jobList.add(new Jobs(
                        rs.getString("job_id"),
                        rs.getString("job_title"),
                        rs.getInt("min_salary"),
                        rs.getInt("max_salary")
                ));
            }
        } catch (SQLException e) {
            System.out.println("DB 예외: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("일반 예외: " + e.getMessage());
        } finally {
            DB.close(rs, pstmt, con);
        }
        return jobList;
    }
	
	// void, int(리턴 필요한 데이터 유형 표시) 다르게 선언하는지
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
	
	public int insertDep(Departments dep) {
		int isInsert= 0;
		String sql = "INSERT INTO DEPARTMENTS10 values(?, ?, ?, ?)";
		
		try {
			con = DB.con();
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dep.getD_id());
			pstmt.setString(2, dep.getD_name());
			pstmt.setInt(3, dep.getManager_id());
			pstmt.setDouble(4, dep.getLoc_id());
			
			isInsert =  pstmt.executeUpdate();
			con.commit(); 
			if(isInsert == 1) {
				System.out.println("등록 성공");
			}
			
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
		
		return isInsert;
	}
	
	
	
	public void updateEmp(Emp upt) {
		String sql = "UPDATE emp02\r\n"
				+ "	SET ENAME = ?,\r\n"
				+ "		job = ?,\r\n"
				+ "		sal = ?,\r\n"
				+ "		HIREDATE = to_date(?, 'YYYY/MM/DD')\r\n"
				+ "	WHERE empno = ?";
		try {
			con = DB.con();
			// 자동 commit 방지
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, upt.getEname());
			pstmt.setString(2, upt.getJob());
			pstmt.setDouble(3, upt.getSal());
			pstmt.setString(4, upt.getHiredateS());
			pstmt.setInt(5, upt.getEmpno());
			
			int isUpt = pstmt.executeUpdate();
			con.commit(); // 입력 시 확정 commit
			
			pstmt.close();
			con.close();
			
			if(isUpt == 1) System.out.println("수정 성공");
			
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

	public int updateLoc(Loc loc) {
		String sql = "UPDATE LOCATIONS10\r\n"
				+ "	SET street_address = ?, \r\n"
				+ "		postal_code = ?,\r\n"
				+ "		city = ?,\r\n"
				+ "		state_province = ?,\r\n"
				+ "		country_id = ?\r\n"
				+ "	WHERE location_id = ?";
		int isUpt = 0;
		
		try {
			con = DB.con();
			// 자동 commit 방지
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			// int locId, String strAddrs, String pstCode, String city, String stPro, String ctryId
			pstmt.setString(1, loc.getStrAddrs());
			pstmt.setString(2, loc.getPstCode());
			pstmt.setString(3, loc.getCity());
			pstmt.setString(4, loc.getStPro());
			pstmt.setString(5, loc.getCtryId());
			pstmt.setInt(6, loc.getLocId());
			
			isUpt = pstmt.executeUpdate();
			con.commit(); // 입력 시 확정 commit
			if(isUpt == 1) System.out.println("수정 완료");
			
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
	
		return isUpt;
	}

	public int deleteLoc(int locId) {
		String sql = "DELETE \r\n"
				+ "FROM LOCATIONS10\r\n"
				+ "WHERE location_id = ?";
		int isDelete = 0;
		
		try {
			con = DB.con();
			// 자동 commit 방지
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, locId);
			
			isDelete = pstmt.executeUpdate();
			con.commit(); // 입력 시 확정 commit
			if(isDelete == 1) System.out.println("삭제 완료");
			
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
	
		return isDelete;
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
		
//		Emp ins = new Emp(1005, "Harry", "인턴", 7902, "2023-05-23", 7000.0, 1000.0, 30);
//		dao.insertEmp(ins);
		
//		Departments dep = new Departments(15, "front-end programming", 101, 1900);
//		dao.insertDep(dep);

//		dao.updateEmp(new Emp(7499, "James(upt)", "대리", "2023/06/01", 5000.0 ));
		
		// 1100이 수정 할 위치. loc_id가 1100인 데이터를 뒤 내용으로 update
//		dao.updateLoc(new Loc(1100, "종로 2가", "123456", "seoul", "sadang", "SD"));
		
		dao.deleteLoc(1000);
		
		
		
	}

}
