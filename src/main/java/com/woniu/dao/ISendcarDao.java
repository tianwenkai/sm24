package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Sendcar;

public interface ISendcarDao {

	void save(Sendcar obj);

	void update(Sendcar obj);

	void delete(Integer no);

	Sendcar findOne(Integer no);

	List<Sendcar> findAll();
}
