package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {

	void save(Dept obj);

	void update(Dept obj);

	void delete(Integer no);

	Dept findOne(Integer no);

	List<Dept> findAll();
}
