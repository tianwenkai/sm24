package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Sendcar;

public interface ISendcarService {

	void save(Sendcar obj);

	void update(Sendcar obj);

	void delete(Integer no);

	Sendcar findOne(Integer no);

	List<Sendcar> findAll();
}
