package com.ca102g1.springboot.service;

import com.ca102g1.springboot.model.Trailer;

import java.util.List;

public interface TrailerDAO_interface {
	
	public void insert(Trailer trailer);
	public void update(Trailer trailer);
	public void delete(String trailer_no);
	public Trailer findByPrimaryKey(String trailer_no);
	public List<Trailer> getAll();
}
