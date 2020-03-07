package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Driver;

public interface IDriverDao {

	void save(Driver obj);

	void update(Driver obj);

	void delete(Integer no);

	Driver findOne(Integer no);

	List<Driver> findAll();
}
