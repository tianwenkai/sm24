package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Manager;

public interface IManagerDao {

	void save(Manager obj);

	void update(Manager obj);

	void delete(Integer no);

	Manager findOne(Integer no);

	List<Manager> findAll();
}
