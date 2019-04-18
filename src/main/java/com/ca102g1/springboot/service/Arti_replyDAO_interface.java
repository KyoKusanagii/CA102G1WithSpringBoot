package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.ArtiReply;

import java.util.List;

public interface Arti_replyDAO_interface {
	public void insert(ArtiReply ArtiReply);
	public void update(ArtiReply ArtiReply);
	public void delete(String arti_no, Integer rep_no);
	public ArtiReply findByPrimaryKey(Integer rep_no);
	public List<ArtiReply> getAll();
	public List<ArtiReply> getRepByArtiNO(String arti_no);
	public void deleteAllRep(String arti_no);

}
