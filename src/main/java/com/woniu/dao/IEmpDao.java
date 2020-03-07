package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Emp;


public interface IEmpDao {

	void save(Emp obj);

	void update(Emp obj);

	void delete(Integer no);

	Emp findOne(Integer no);

	List<Emp> findAll();
}
