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

public class NewsDAO implements NewsDAO_interface {
	
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
	"INSERT INTO NEWS(NEWS_NO,NEWS_DATE,NEWS_TITLE,NEWS_CONTENT)" + "VALUES(newsno_SEQ.nextval, ?, ?, ?)";
	
	private static final String UPDATE_STMT = 
	"UPDATE NEWS SET NEWS_DATE = ?,NEWS_TITLE = ?,NEWS_CONTENT = ? WHERE NEWS_NO = ?";
	
	private static final String DELETE_STMT = "DELETE FROM NEWS WHERE NEWS_NO = ?";
	
	private static final String FIND_BY_PK =  "SELECT * FROM NEWS WHERE NEWS_NO = ?";
	
	private static final String GET_ALL = "SELECT * FROM NEWS ORDER BY NEWS_DATE DESC";
	
	private static final String SHOW_CUSTUMER = "SELECT * FROM NEWS WHERE  NEWS_DATE < SYSDATE ORDER BY NEWS_DATE DESC";


	
	@Override 
	public void insert(NewsVO news) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(INSERT_STMT);
				
			pstmt.setTimestamp(1, news.getNews_date());
			pstmt.setString(2, news.getNews_title());
			pstmt.setString(3, news.getNews_content());
			pstmt.executeQuery();

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
	public void update(NewsVO news){
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(UPDATE_STMT);
			//pstmt.setString(1, emp.getEmp_no()); ���|��s���A�o�O�T�w��
			pstmt.setTimestamp(1, news.getNews_date());
			pstmt.setString(2, news.getNews_title());
			pstmt.setString(3, news.getNews_content());;
			pstmt.setInt(4, news.getNews_no());;
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
	public void delete(int news_no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(DELETE_STMT);
			pstmt.setInt(1, news_no);	
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
	public NewsVO findByPK(int news_no) {
		NewsVO news = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(FIND_BY_PK);
			pstmt.setInt(1, news_no);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				news = new NewsVO();
				news.setNews_no(rs.getInt("NEWS_NO"));
				news.setNews_date(rs.getTimestamp(("NEWS_DATE")));
				news.setNews_title(rs.getString("NEWS_TITLE"));
				news.setNews_content(rs.getString("NEWS_CONTENT"));
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
		return news;
	}

	@Override
	public List<NewsVO> getAll() {
		List<NewsVO> newsList = new ArrayList<>();
		NewsVO news = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				news = new NewsVO();
				news.setNews_no(rs.getInt("NEWS_NO"));
				news.setNews_date(rs.getTimestamp(("NEWS_DATE")));
				news.setNews_title(rs.getString("NEWS_TITLE"));
				news.setNews_content(rs.getString("NEWS_CONTENT"));							
				newsList.add(news);
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
		return newsList;
	}
	
	@Override
	public List<NewsVO> showCustomer() {
		List<NewsVO> newsList = new ArrayList<>();
		NewsVO news = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(SHOW_CUSTUMER);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				news = new NewsVO();
				news.setNews_no(rs.getInt("NEWS_NO"));
				news.setNews_date(rs.getTimestamp(("NEWS_DATE")));
				news.setNews_title(rs.getString("NEWS_TITLE"));
				news.setNews_content(rs.getString("NEWS_CONTENT"));							
				newsList.add(news);
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
		return newsList;
	}

}
