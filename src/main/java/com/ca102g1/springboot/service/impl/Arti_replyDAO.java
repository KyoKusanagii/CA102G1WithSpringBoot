package com.ca102g1.springboot.service.impl;

import com.ca102g1.springboot.mapper.ArtiReplyMapper;
import com.ca102g1.springboot.model.ArtiReply;
import com.ca102g1.springboot.model.ArtiReplyExample;
import com.ca102g1.springboot.model.ArtiReplyKey;
import com.ca102g1.springboot.model.ArticleExample;
import com.ca102g1.springboot.service.Arti_replyDAO_interface;
import org.springframework.beans.factory.annotation.Autowired;

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

public class Arti_replyDAO implements Arti_replyDAO_interface {



	@Autowired
	private ArtiReplyMapper artiReplyMapper;

//	public static final String INSERT_STMT = "INSERT INTO ARTI_REPLY(ARTI_NO, REP_NO, MEM_NO, REP_CONTENT, REP_TIME) VALUES(?, rep_no_seq.NEXTVAL, ?, ?, ?)";
//	public static final String UPDATE_STMT = "UPDATE ARTI_REPLY SET REP_CONTENT = ?, REP_TIME = ? WHERE ARTI_NO = ? AND REP_NO = ?";
//	public static final String DELETE_STMT = "DELETE FROM ARTI_REPLY WHERE ARTI_NO = ? AND REP_NO = ?";
//	public static final String FIND_BY_PK = "SELECT * FROM ARTI_REPLY WHERE REP_NO = ?";
//	public static final String GET_ALL = "SELECT * FROM ARTI_REPLY ORDER BY REP_NO";
//	//public static final String GET_REP = "SELECT * FROM ARTI_REPLY WHERE ARTI_NO = ?  ORDER BY REP_NO";
//
//
//	//只顯示沒被檢舉的、被檢舉未處理的、被檢舉駁回的留言
//	public static final String GET_REP =
//	"SELECT * FROM ARTI_REPLY  WHERE  ARTI_REPLY.ARTI_NO = ? AND (REP_NO IN (SELECT ARTI_REPLY.REP_NO FROM ARTI_REPLY JOIN ARTIREPLY_REPORT " +
//	"ON ARTI_REPLY.REP_NO = ARTIREPLY_REPORT.REP_NO WHERE ARTIREPLY_REPORT.REPORT_STATUS !=1) OR (REP_NO NOT IN " +
//	"(SELECT ARTIREPLY_REPORT.REP_NO FROM ARTIREPLY_REPORT)))  ORDER BY ARTI_REPLY.REP_NO";
//
//	public static final String DELETE_ALL_REP = "DELETE FROM ARTI_REPLY WHERE ARTI_NO = ?";

	@Override
	public void insert(ArtiReply arti_replyVO) {
		artiReplyMapper.insertSelective(arti_replyVO);
	}

	@Override
	public void update(ArtiReply arti_replyVO) {
		artiReplyMapper.updateByPrimaryKey(arti_replyVO);
	}

	@Override
	public void delete(String arti_no, Integer rep_no) {

		ArtiReplyKey artiReplyKey = new ArtiReplyKey();
		artiReplyKey.setArtiNo(arti_no);
		artiReplyKey.setRepNo(rep_no);
		artiReplyMapper.deleteByPrimaryKey(artiReplyKey)
			// Handle any SQL errors
	}

	@Override
	public ArtiReply findByPrimaryKey (Integer rep_no){
		ArtiReplyKey artiReplyKey = new ArtiReplyKey();
		artiReplyKey.setRepNo(rep_no);
		return artiReplyMapper.selectByPrimaryKey(artiReplyKey);
	}

	@Override
	public List<ArtiReply> getAll () {
		return artiReplyMapper.selectByExample(new ArtiReplyExample());
	}

	@Override
	public List<ArtiReply> getRepByArtiNO (String arti_no){ //得到該文章的所有留言
		ArtiReplyExample artiReplyExample = new ArtiReplyExample();
		ArtiReplyExample.Criteria criteria = artiReplyExample.createCriteria();
		criteria.andArtiNoEqualTo(arti_no);
		artiReplyExample.setOrderByClause("REP_NO");
		return artiReplyMapper.selectByExample(artiReplyExample);
	}

	@Override
	public void deleteAllRep (String arti_no){

		ArtiReplyExample artiReplyExample = new ArtiReplyExample();
		ArtiReplyExample.Criteria cArtiReplyExample = artiReplyExample.createCriteria();    //Mybatis的條件刪除
		cArtiReplyExample.andArtiNoEqualTo(arti_no);    //相當於where arti_no= ?
		artiReplyMapper.deleteByExample(artiReplyExample);

	}
}
