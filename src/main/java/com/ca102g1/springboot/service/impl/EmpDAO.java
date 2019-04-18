package com.ca102g1.springboot.service.impl;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO implements EmpDAO_interface {
	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB3");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	private static final String INSERT_STMT = 			
	"INSERT INTO EMPLOYEE(EMP_NO,EMP_ID,EMP_PWD,EMP_NAME,EMP_STATUS,EMP_ICON,EMP_MEM_AUTH,EMP_CAROUSEL_AUTH,EMP_REPORT_AUTH," 
	+ "EMP_CHAT_AUTH,EMP_LEVEL)" + "VALUES(('E'||LPAD(to_char(empno_SEQ.nextval),5,'0')), ?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
	
	private static final String UPDATE_STMT = 
	"UPDATE EMPLOYEE SET EMP_ID = ?,EMP_NAME = ?,EMP_STATUS = ?,EMP_ICON = ?,EMP_MEM_AUTH = ?,"
	+ "EMP_CAROUSEL_AUTH = ?,EMP_REPORT_AUTH = ?,EMP_CHAT_AUTH = ?,EMP_LEVEL = ? WHERE EMP_NO = ?";
	
	private static final String DELETE_STMT = "DELETE FROM EMPLOYEE WHERE EMP_NO = ?";
	
	private static final String FIND_BY_PK =  "SELECT * FROM EMPLOYEE WHERE EMP_NO = ?";

	private static final String FIND_BY_ACCOUNT =  "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";
	
	private static final String GET_ALL = "SELECT * FROM EMPLOYEE ORDER BY EMP_NO";

	private static final String FIND_BY_EMP_ID = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";


	@Override
	public EmpVO empLoginCheck(String login_id, String login_password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String loginMsg = "";
		EmpVO emp = new EmpVO();
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(FIND_BY_EMP_ID);
			pstmt.setString(1, login_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp.setEmp_no(rs.getString("EMP_NO"));
				emp.setEmp_id(rs.getString("EMP_ID"));
				emp.setEmp_pwd(rs.getString("EMP_PWD"));
				emp.setEmp_name(rs.getString("EMP_NAME"));
				emp.setEmp_status(rs.getInt("EMP_STATUS"));
				emp.setEmp_icon(rs.getBytes("EMP_ICON"));
				emp.setEmp_mem_auth(rs.getInt("EMP_MEM_AUTH"));
				emp.setEmp_carousel_auth(rs.getInt("EMP_CAROUSEL_AUTH"));
				emp.setEmp_report_auth(rs.getInt("EMP_REPORT_AUTH"));
				emp.setEmp_chat_auth(rs.getInt("EMP_CHAT_AUTH"));
				emp.setEmp_level(rs.getInt("EMP_LEVEL"));
			}
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return emp;
	}

	@Override
	public void insert(EmpVO emp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(INSERT_STMT);
				
			//pstmt.setString(1, emp.getEmp_no()); �o�̷|�ۼW�D��A���γ]�w
			pstmt.setString(1, emp.getEmp_id());
			pstmt.setString(2, emp.getEmp_pwd());
			pstmt.setString(3, emp.getEmp_name());
			pstmt.setInt(4, emp.getEmp_status());
			pstmt.setBytes(5, emp.getEmp_icon());	//1��T 2��F
			pstmt.setInt(6, emp.getEmp_mem_auth());
			pstmt.setInt(7, emp.getEmp_carousel_auth());
			pstmt.setInt(8, emp.getEmp_report_auth());
			pstmt.setInt(9, emp.getEmp_chat_auth());
			pstmt.setInt(10, emp.getEmp_level());
			pstmt.executeUpdate();

			// Handle any driver errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public void update(EmpVO emp){
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();
			//pstmt.setString(1, emp.getEmp_no()); ���|��s���A�o�O�T�w���A�����s���u�K�X
			pstmt.setString(1, emp.getEmp_id());
			pstmt.setString(2, emp.getEmp_name());
			pstmt.setInt(3, emp.getEmp_status());
			pstmt.setBytes(4, emp.getEmp_icon());	//1��T 2��F
			pstmt.setInt(5, emp.getEmp_mem_auth());
			pstmt.setInt(6, emp.getEmp_carousel_auth());
			pstmt.setInt(7, emp.getEmp_report_auth());
			pstmt.setInt(8, emp.getEmp_chat_auth());
			pstmt.setInt(9, emp.getEmp_level());
			pstmt.setString(10, emp.getEmp_no());
			pstmt.executeUpdate();
			
			// Handle any driver errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
	}

	@Override
	public void delete(String emp_no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(DELETE_STMT);
			pstmt.setString(1, emp_no);	
			pstmt.executeUpdate();

			// Handle any driver errors
		}  catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
	}

	@Override
	public EmpVO findByPK(String emp_no) {
		EmpVO emp = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(FIND_BY_PK);
			pstmt.setString(1, emp_no);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEmp_no(rs.getString("EMP_NO"));
				emp.setEmp_id(rs.getString("EMP_ID"));
				emp.setEmp_pwd(rs.getString("EMP_PWD"));
				emp.setEmp_name(rs.getString("EMP_NAME"));
				emp.setEmp_status(rs.getInt("EMP_STATUS"));
				emp.setEmp_icon(rs.getBytes("EMP_ICON"));
				emp.setEmp_mem_auth(rs.getInt("EMP_MEM_AUTH"));
				emp.setEmp_carousel_auth(rs.getInt("EMP_CAROUSEL_AUTH"));
				emp.setEmp_report_auth(rs.getInt("EMP_REPORT_AUTH"));
				emp.setEmp_chat_auth(rs.getInt("EMP_CHAT_AUTH"));
				emp.setEmp_level(rs.getInt("EMP_LEVEL"));		
			}
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return emp;
	}

	@Override
	public EmpVO findById(String emp_id) {
		EmpVO emp = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(FIND_BY_ACCOUNT);
			pstmt.setString(1, emp_id);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				emp = new EmpVO();
				emp.setEmp_no(rs.getString("EMP_NO"));
				emp.setEmp_id(rs.getString("EMP_ID"));
				emp.setEmp_pwd(rs.getString("EMP_PWD"));
				emp.setEmp_name(rs.getString("EMP_NAME"));
				emp.setEmp_status(rs.getInt("EMP_STATUS"));
				emp.setEmp_icon(rs.getBytes("EMP_ICON"));
				emp.setEmp_mem_auth(rs.getInt("EMP_MEM_AUTH"));
				emp.setEmp_carousel_auth(rs.getInt("EMP_CAROUSEL_AUTH"));
				emp.setEmp_report_auth(rs.getInt("EMP_REPORT_AUTH"));
				emp.setEmp_chat_auth(rs.getInt("EMP_CHAT_AUTH"));
				emp.setEmp_level(rs.getInt("EMP_LEVEL"));
			}
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return emp;
	}

	@Override
	public List<EmpVO> getAll() {
		List<EmpVO> empList = new ArrayList<>();
		EmpVO emp = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				emp = new EmpVO();
				emp.setEmp_no(rs.getString("EMP_NO"));
				emp.setEmp_id(rs.getString("EMP_ID"));
				emp.setEmp_pwd(rs.getString("EMP_PWD"));
				emp.setEmp_name(rs.getString("EMP_NAME"));
				emp.setEmp_status(rs.getInt("EMP_STATUS"));
				emp.setEmp_icon(rs.getBytes("EMP_ICON"));
				emp.setEmp_mem_auth(rs.getInt("EMP_MEM_AUTH"));
				emp.setEmp_carousel_auth(rs.getInt("EMP_CAROUSEL_AUTH"));
				emp.setEmp_report_auth(rs.getInt("EMP_REPORT_AUTH"));
				emp.setEmp_chat_auth(rs.getInt("EMP_CHAT_AUTH"));
				emp.setEmp_level(rs.getInt("EMP_LEVEL"));							
				empList.add(emp);
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return empList;
	}

}
