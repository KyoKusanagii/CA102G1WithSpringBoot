package com.ca102g1.springboot.service.impl;

import com.ca102g1.springboot.mapper.ArticleMapper;
import com.ca102g1.springboot.model.Article;
import com.ca102g1.springboot.model.ArticleExample;
import com.ca102g1.springboot.service.ArticleDAO_interface;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO implements ArticleDAO_interface {

	@Autowired
	ArticleMapper articleMapper;

//	public static final String INSERT_STMT = "INSERT INTO ARTICLE(ARTI_NO, ARTI_TOPIC, MEM_NO, ARTI_CONTENT, PO_TIME) VALUES('A'||LPAD(to_char(article_seq.NEXTVAL), 5,'0'), ?, ?, ?, ?)";
//	public static final String UPDATE_STMT = "UPDATE ARTICLE SET ARTI_TOPIC = ?, ARTI_CONTENT = ?, PO_TIME = ? WHERE ARTI_NO = ?";
//	public static final String DELETE_STMT = "DELETE FROM ARTICLE WHERE ARTI_NO = ?";
//	public static final String FIND_BY_PK = "SELECT * FROM ARTICLE WHERE ARTI_NO = ?" ;
//	//public static final String GET_ALL = "SELECT * FROM ARTICLE ORDER BY ARTI_NO DESC";
//
//	//只顯示沒被檢舉的、被檢舉未處理的、被檢舉駁回的文章
//	public static final String GET_ALL =
//	"SELECT * FROM ARTICLE  WHERE (ARTI_NO IN (SELECT ARTICLE.ARTI_NO FROM ARTICLE JOIN ARTICLE_REPORT " +
//	"ON ARTICLE.ARTI_NO = ARTICLE_REPORT.ARTI_NO WHERE ARTICLE_REPORT.REPORT_STATUS !=1) OR (ARTI_NO NOT IN " +
//	"(SELECT ARTICLE_REPORT.ARTI_NO FROM ARTICLE_REPORT))) ORDER BY ARTICLE.ARTI_NO DESC";
//
//	public static final String FIND_BY_TOPIC = "SELECT * FROM ARTICLE WHERE UPPER(ARTI_TOPIC) LIKE UPPER(?) OR UPPER(ARTI_TOPIC) LIKE UPPER(?) ORDER BY ARTI_NO DESC";


	@Override
	public void insert(Article article) {
		articleMapper.insertSelective(article);
	}

	@Override
	public void update (Article articleVO){
		articleMapper.updateByPrimaryKey(articleVO);
	}

	@Override
	public Article findByPrimaryKey (String arti_no){
		return articleMapper.selectByPrimaryKey(arti_no);
	}

	@Override
	public List<Article> getAll () {
		ArticleExample articleExample = new ArticleExample();
		return articleMapper.selectByExample(articleExample);
	}


	@Override
	public List<Article> findByTopic (String arti_topic){
		ArticleExample articleExample = new ArticleExample();
		ArticleExample.Criteria criteria = articleExample.createCriteria();
		criteria.andArtiTopicLike(arti_topic);
		return articleMapper.selectByExample(articleExample);
	}

	public Reader stringToReader (String text){
		if (text != null) {
			return new StringReader(text);
		} else {
			return null;
		}
	}


	public String readerToString (Reader reader){
		if (reader != null) {
			int i;
			StringBuilder sb = new StringBuilder();
			try {
				while ((i = reader.read()) != -1) {
					sb.append((char) i);
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return sb.toString();
		} else {
			return null;
		}
	}


	@Override
	public void delete (String arti_no){
		articleMapper.deleteByPrimaryKey(arti_no);
	}

}

