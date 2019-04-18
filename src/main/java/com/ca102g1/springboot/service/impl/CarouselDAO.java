package com.ca102g1.springboot.service.impl;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// �����O��@DAO interface�A�ñN��Ʈw�ާ@�Ӹ`�ʸ˰_��
public class CarouselDAO implements CarouselDAO_interface {
	
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
	"INSERT INTO CAROUSEL(CAROUSEL_NO, CAROUSEL_PIC, CAROUSEL_TITLE, CAROUSEL_SUBTITLE)"
	+ "VALUES(CAROUSEL_SEQ.nextval, ?, ?, ?)";
	
	private static final String UPDATE_STMT = 
	"UPDATE CAROUSEL SET CAROUSEL_PIC = ?, CAROUSEL_TITLE = ?, CAROUSEL_SUBTITLE = ? WHERE CAROUSEL_NO = ?";
	
	private static final String DELETE_STMT = 
	"DELETE FROM CAROUSEL WHERE CAROUSEL_NO = ?";
	private static final String FIND_BY_PK = 
	"SELECT * FROM CAROUSEL WHERE CAROUSEL_NO = ?";
	
	private static final String Find_BY_TITLE = "SELECT * FROM CAROUSEL WHERE UPPER(CAROUSEL_TITLE) LIKE ?";
	private static final String GET_ALL = "SELECT * FROM CAROUSEL";
	
	
	//InputStream��Byte
	public static byte[] getPictureByteArray(String path) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[8192];
		int i;
		while ((i = fis.read(buffer)) != -1) {
			baos.write(buffer, 0, i);
		}
		baos.close();
		fis.close();

		return baos.toByteArray();
	}
	
	public void add(CarouselVO cv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(INSERT_STMT);
			
			//pstmt.setInt(1, cv.getCarousel_no());�ۼW�D��
			pstmt.setBytes(1, cv.getCarousel_pic());
			pstmt.setString(2, cv.getCarousel_title());
			pstmt.setString(3, cv.getCarousel_subTitle());
			
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
	public void update(CarouselVO cv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(UPDATE_STMT);

			pstmt.setBytes(1, cv.getCarousel_pic());
			pstmt.setString(2, cv.getCarousel_title());
			pstmt.setString(3, cv.getCarousel_subTitle());
			pstmt.setInt(4, cv.getCarousel_no());
			
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

	public void delete(Integer carousel_no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(DELETE_STMT);

			pstmt.setInt(1, carousel_no);
			
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
	public CarouselVO findByPK(Integer CAROUSEL_No) {
		CarouselVO thisCarouselNo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(FIND_BY_PK);
			pstmt.setInt(1, CAROUSEL_No);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				thisCarouselNo = new CarouselVO();
				thisCarouselNo.setCarousel_no(rs.getInt("CAROUSEL_NO"));
				thisCarouselNo.setCarousel_pic(rs.getBytes("CAROUSEL_PIC"));
				thisCarouselNo.setCarousel_title(rs.getString("CAROUSEL_TITLE"));
				thisCarouselNo.setCarousel_subTitle(rs.getString("CAROUSEL_SUBTITLE"));
				
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

		return thisCarouselNo;
	}

	
	@Override
	public List<CarouselVO> findByTitle(String Carousel_title) {
		List<CarouselVO> carouselList = new ArrayList<>();
		CarouselVO thisCarouselNo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(Find_BY_TITLE);
			pstmt.setString(1, "%"+Carousel_title.toUpperCase()+"%");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				thisCarouselNo = new CarouselVO();
				thisCarouselNo.setCarousel_no(rs.getInt("CAROUSEL_NO"));
				thisCarouselNo.setCarousel_pic(rs.getBytes("CAROUSEL_PIC"));
				thisCarouselNo.setCarousel_title(rs.getString("CAROUSEL_TITLE"));
				thisCarouselNo.setCarousel_subTitle(rs.getString("CAROUSEL_SUBTITLE"));
				carouselList.add(thisCarouselNo);
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
		return carouselList;
	}
	
	
	@Override
	public List<CarouselVO> getAll() {
		List<CarouselVO> carouselList = new ArrayList<>();
		CarouselVO thisCarouselNo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				thisCarouselNo = new CarouselVO();
				thisCarouselNo.setCarousel_no(rs.getInt("CAROUSEL_NO"));
				thisCarouselNo.setCarousel_pic(rs.getBytes("CAROUSEL_PIC"));
				thisCarouselNo.setCarousel_title(rs.getString("CAROUSEL_TITLE"));
				thisCarouselNo.setCarousel_subTitle(rs.getString("CAROUSEL_SUBTITLE"));
				carouselList.add(thisCarouselNo);
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
		return carouselList;
	}
	

}
