package com.ca102g1.springboot.service.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FbItemDAO implements FbItemDAO_interface {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "Instabuy";
	private static final String PASSWORD = "123456";
//	
	private static final String INSERT_STMT = "INSERT INTO FB_ORDER_ITEM (FB_ORDER_NO,ITEM_NO,FB_ITEM_CNT,FB_ITEM_PRC,FB_COMMENT,FB_ITEM_PIC) VALUES "
			+ "(?,?,?,?,?,	?)";
	private static final String GET_ALL_STMT = "SELECT FB_ORDER_NO,ITEM_NO,FB_ITEM_PIC,FB_ITEM_CNT,FB_ITEM_PRC FROM FB_ORDER_ITEM ORDER BY FB_ORDER_NO";
	private static final String GET_ONE_STMT = "SELECT FB_ORDER_NO,ITEM_NO,FB_ITEM_PIC,FB_ITEM_CNT,FB_ITEM_PRC FROM FB_ORDER_ITEM WHERE FB_ORDER_NO = ? AND ITEM_NO = ?";
	private static final String DELETE = "DELETE FROM FB_ORDER_ITEM WHERE FB_ORDER_NO = ? AND ITEM_NO = ?";
	private static final String UPDATE = "UPDATE FB_ORDER_ITEM SET FB_ITEM_PIC=?, FB_ITEM_CNT=?, FB_ITEM_PRC=? WHERE FB_ORDER_NO = ? AND ITEM_NO = ?";

	@Override
	public void insert(FbItemVO fbItemVO) {
		int updateCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setString(1, fbItemVO.getFb_order_no());
			pstmt.setString(2, fbItemVO.getItem_no());
			pstmt.setBytes(3, fbItemVO.getFb_item_pic());
			pstmt.setInt(4, fbItemVO.getFb_item_cnt());
			pstmt.setInt(5, fbItemVO.getFb_item_prc());

			updateCount = pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
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
		System.out.println(updateCount);
	}

	@Override
	public void update(FbItemVO fbItemVO) {
		int updateCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(UPDATE);

			pstmt.setBytes(1, fbItemVO.getFb_item_pic());
			pstmt.setInt(2, fbItemVO.getFb_item_cnt());
			pstmt.setInt(3, fbItemVO.getFb_item_prc());
			pstmt.setString(4, fbItemVO.getFb_order_no());
			pstmt.setString(5, fbItemVO.getItem_no());

			updateCount = pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
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
		System.out.println(updateCount);
	}

	@Override
	public void delete(String fb_order_no, String item_no) {
		int updateCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(DELETE);

			pstmt.setString(1, fb_order_no);
			pstmt.setString(2, item_no);

			updateCount = pstmt.executeUpdate();

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
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
		System.out.println(updateCount);
	}

	@Override
	public FbItemVO findByPrimaryKey(String fb_order_no, String item_no) {
		FbItemVO fbItemVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setString(1, fb_order_no);
			pstmt.setString(2, item_no);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				fbItemVO = new FbItemVO();
				fbItemVO.setFb_order_no(rs.getString("FB_ORDER_NO"));
				fbItemVO.setItem_no(rs.getString("ITEM_NO"));
				fbItemVO.setFb_item_pic(rs.getBytes("FB_ITEM_PIC"));
				fbItemVO.setFb_item_cnt(rs.getInt("FB_ITEM_CNT"));
				fbItemVO.setFb_item_prc(rs.getInt("FB_ITEM_PRC"));

			}

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
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
		return fbItemVO;
	}

	@Override
	public List<FbItemVO> getAll() {
		List<FbItemVO> list = new ArrayList<FbItemVO>();
		FbItemVO fbItemVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// fbItemVO �]�٬� Domain objects
				fbItemVO = new FbItemVO();
				fbItemVO.setFb_order_no(rs.getString("FB_ORDER_NO"));
				fbItemVO.setItem_no(rs.getString("ITEM_NO"));
				fbItemVO.setFb_item_pic(rs.getBytes("FB_ITEM_PIC"));
				fbItemVO.setFb_item_cnt(rs.getInt("FB_ITEM_CNT"));
				fbItemVO.setFb_item_prc(rs.getInt("FB_ITEM_PRC"));

				list.add(fbItemVO); // Store the row in the vector
			}

			// Handle any driver errors
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Couldn't load database driver. " + e.getMessage());
			// Handle any SQL errors
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
		return list;
	}
	
	public void insertOrder(FbItemVO fbItemVO, Connection con2) {
		int updateCount = 0;
		Connection con = con2;
		PreparedStatement pstmt = null;
System.out.println("�i��itemdao");
		try {
			
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setString(1, fbItemVO.getFb_order_no());
			pstmt.setString(2, fbItemVO.getItem_no());
			pstmt.setInt(3, fbItemVO.getFb_item_cnt());
			pstmt.setInt(4, fbItemVO.getFb_item_prc());
			pstmt.setString(5, fbItemVO.getFb_comment());
			pstmt.setBytes(6, fbItemVO.getFb_item_pic());

			updateCount = pstmt.executeUpdate();
			
			System.out.println("fbitemdao executeUpdate");

			// Handle any driver errors
		}catch (SQLException se) {
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
	
		}	
	}

}
