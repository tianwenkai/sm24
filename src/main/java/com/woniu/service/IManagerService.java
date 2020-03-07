package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Manager;

public interface IManagerService {

	void save(Manager obj);

	void update(Manager obj);

	void delete(Integer no);

	Manager findOne(Integer no);

	List<Manager> findAll();
}
