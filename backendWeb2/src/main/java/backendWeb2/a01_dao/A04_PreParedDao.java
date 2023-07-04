package backendWeb2.a01_dao;
// backendWeb2.a01_dao.A04_PreParedDao
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import backendWeb2.z01_vo.Code;
import backendWeb2.z01_vo.Departments;
import backendWeb2.z01_vo.Dept;
import backendWeb2.z01_vo.Emp;
import backendWeb2.z01_vo.Employee;
import backendWeb2.z01_vo.JobHistory;
import backendWeb2.z01_vo.Jobs;
import backendWeb2.z01_vo.Loc;
import backendWeb2.z01_vo.Manager;

public class A04_PreParedDao {

	private Connection con;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;
	
	public List<Emp> getEmpList() {
	    List<Emp> elist = new ArrayList<>();
	    String sql = "SELECT * FROM emp02 order by empno";
	    
	    try {
	        con = DB.con();
	        pstmt = con.prepareStatement(sql); 
	        rs = pstmt.executeQuery();
	
	        while (rs.next()) {
	            elist.add(new Emp(
	                    rs.getInt("empno"),
	                    rs.getString("ename"),
	                    rs.getString("job"),
	                    rs.getInt("mgr"),
	                    rs.getDate("hiredate"),
	                    rs.getDouble("sal"),
	                    rs.getDouble("comm"),
	                    rs.getInt("deptno")
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
	
	public List<Emp> empListAll() {
		List<Emp> elist = new ArrayList<>();
		// # 전체적으로 예외 처리.
		// 연결
		try {
			con = DB.con();
			// 대화할 내용
			String sql = "SELECT * FROM emp02 order by empno";
			// 대화할 수 있는 객체는 연결(con)에 의해 생성
			stmt = con.createStatement();
			// 결과(ResultSet)
			rs = stmt.executeQuery(sql);
			while(rs.next()) { // 행단위로 이동 다음 행이 없을 떄까지
//				System.out.print("행번호:"+row++);
//				System.out.print("\t"+rs.getInt("empno"));
//				System.out.print("\t"+rs.getString("ename"));
//				System.out.print("\t"+rs.getInt("mgr"));
//				System.out.println("\t"+rs.getDouble("sal"));
				elist.add( new Emp(
						rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"),
						rs.getString("hiredate"),
						rs.getDouble("sal"),
						rs.getDouble("comm"),
						rs.getInt("deptno")
				));
				
			}
			/*
			rs.next() : 반복을 통해서 행단위로 커서를 위치시키는
				다음 행이 데이터가 없으면 false 있으면 true
			while(rs.next()){ // 다음 행이 없을 때까지 반복
				System.out.println(cnt++)
			}			
			rs.get데이터유형("컬럼명")
			 * 
			 * */
			// 자원해제				
		} catch (SQLException e) {
			System.out.println("DB 처리 예외:"+e.getMessage());
		}
		return elist;
		
}
	
	public List<Employee> getEmpList(Map<String, String> sch) {
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
	
	public void updateCode(Code upt) {
		String sql = "UPDATE CODE \r\n"
				+ "SET TITLE = ?,\r\n"
				+ "	REFNO = ?,\r\n"
				+ "	ORDNO = ?,\r\n"
				+ "	val = ?\r\n"
				+ "WHERE no = ?;";
		try {
			con = DB.con();
			// 자동 commit 방지
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, upt.getTitle());
			pstmt.setInt(2, upt.getRefno());
			pstmt.setInt(3, upt.getOrdno());
			pstmt.setString(4, upt.getVal());
			pstmt.setInt(5, upt.getNo());
			
			int result = pstmt.executeUpdate();
	        if (result == 1) {
	            con.commit();
	            System.out.println("등록 성공");
	        }
			
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
	public void deleteCode(int no) {
	    String sql = "DELETE \r\n"
	    		+ "FROM code\r\n"
	    		+ "WHERE NO = ?;";
	    try {
	        con = DB.con();
	        con.setAutoCommit(false);
	        pstmt = con.prepareStatement(sql);
	        pstmt.setInt(1, no);
	        
	        int result = pstmt.executeUpdate();
	        if (result == 1) {
	            con.commit();
	            System.out.println("등록 성공");
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 오류: " + e.getMessage());
	        DB.rollback(con);
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
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
	
	public List<Code> getCombo(int refno) {
	    List<Code> elist = new ArrayList<>();
	    String sql = "SELECT title, refno, ordno\r\n"
	    		+ "FROM code\r\n"
	    		+ "WHERE refno = ?\r\n"
	    		+ "ORDER BY ordno";
	    
	    try {
	        con = DB.con();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setInt(1, refno);
	        rs = pstmt.executeQuery();
	        
	        while (rs.next()) {
	            elist.add(new Code(
	                    rs.getString("title"),
	                    rs.getString("val")
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
	
	public Employee getEmpList(String id) {
		Employee emp = null;
		String sql = "SELECT * FROM EMPLOYEES WHERE employee_id = ?";
	    try {
	        con = DB.con();
	        // 초기에 sql을 넘기면서 pstmt 객체 생성
			pstmt = con.prepareStatement(sql);
	        rs = pstmt.executeQuery();
	
	        while (rs.next()) {
	            emp = new Employee(
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
	            );
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 관련 오류: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
	    } finally {
	        DB.close(rs, pstmt, con);
	    }
	    return emp;
	}
	
	public List<Jobs> getJob() {
	    List<Jobs> jlist = new ArrayList<>();
	    String sql = "SELECT * from jobs";
	    try {
	        con = DB.con();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

		
	        while (rs.next()) {
	        	jlist.add(new Jobs(
	        			rs.getString("job_id"),
	        			rs.getString("job_title"),
	                    rs.getInt("min_salary"),
	                    rs.getInt("max_salary")
	            ));
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 관련 오류: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
	    } finally {
	        DB.close(rs, pstmt, con);
	    }
	    return jlist;
	}

	public List<Manager> getManager() {
	    List<Manager> elist = new ArrayList<>();
	    String sql = "SELECT empno, ename, dname\r\n"
	    		+ "FROM EMP e , DEPT d \r\n"
	    		+ "WHERE e.DEPTNO  = d.DEPTNO\r\n"
	    		+ "AND empno in (\r\n"
	    		+ "	SELECT DISTINCT mgr FROM emp\r\n"
	    		+ ") order by ename";
	    try {
	        con = DB.con();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
	        while (rs.next()) {
	            elist.add(new Manager(
	                    rs.getInt("empno"),
	                    rs.getString("ename"),
	                    rs.getString("dname")
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

	public List<Dept> getDeptList(String dname, String loc) {
	    List<Dept> dlist = new ArrayList<>();
	    String sql = "SELECT * FROM DEPT d \r\n"
	    		+ "WHERE dname=? OR loc = ? ";
	    
	    try {
	        con = DB.con();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, '%'+dname+"%");
	        pstmt.setString(2, '%'+loc+"%");
	        rs = pstmt.executeQuery();
	        
	
	        while (rs.next()) {
	        	dlist.add(new Dept(
	                    rs.getInt("deptno"),
	                    rs.getString("dname"),
	                    rs.getString("loc")
	            ));
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 관련 오류: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
	    } finally {
	        DB.close(rs, pstmt, con);
	    }
	    return dlist;
	}
	public Code getCode(int no) {
	    Code c = null;
	    String sql = "SELECT * FROM CODE c \r\n"
	    			+ "WHERE NO=?";
	    	
	    try {
	    	
	        con = DB.con();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setInt(1, no);
	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	            c = new Code(
	                    rs.getInt("no"),
	                    rs.getString("title"),
	                    rs.getString("val"),
	                    rs.getInt("refno"),
	                    rs.getInt("ordno")
	            );
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 관련 오류: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
	    } finally {
	        DB.close(rs, pstmt, con);
	    }
	    return c;
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

	public List<Emp> getEmpList(String ename, String job) {
	    List<Emp> elist = new ArrayList<>();
	    String sql = "SELECT * FROM emp02 where ename like ? and job like ? order by empno ";
	    
	    try {
	        con = DB.con();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, '%'+ename+"%");
	        pstmt.setString(2, '%'+job+"%");
	        rs = pstmt.executeQuery();
	        
	
	        while (rs.next()) {
	            elist.add(new Emp(
	                    rs.getInt("empno"),
	                    rs.getString("ename"),
	                    rs.getString("job"),
	                    rs.getInt("mgr"),
	                    rs.getDate("hiredate"),
	                    rs.getDouble("sal"),
	                    rs.getDouble("comm"),
	                    rs.getInt("deptno")
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

	public List<Code> getCodeList(String title, int refno) {
	    List<Code> elist = new ArrayList<Code>();
	    String sql = "SELECT *\r\n"
	    		+ "FROM code\r\n"
	    		+ "WHERE title LIKE ?\r\n"
	    		+ "START WITH refno = ?\r\n"
	    		+ "CONNECT BY PRIOR NO =refno ";
	    	
	    try {
	    	
	        con = DB.con();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, '%'+title+"%");
	        pstmt.setInt(2, refno);
	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	            elist.add(new Code(
	                    rs.getInt("no"),
	                    rs.getString("title"),
	                    rs.getString("val"),
	                    rs.getInt("refno"),
	                    rs.getInt("ordno")
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

	public void insertCode(Code ins) {
		//code_seq.nextval, '기획', 1007, 4, 40
		String sql = "INSERT INTO code VALUES "
				+ "(code_seq.nextval, ?, ?, ?, ?);";
		try {
			con = DB.con();
			// 자동 commit 방지
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, ins.getTitle());
			pstmt.setInt(2, ins.getRefno());
			pstmt.setInt(3, ins.getOrdno());
			pstmt.setString(4, ins.getVal());
			
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
