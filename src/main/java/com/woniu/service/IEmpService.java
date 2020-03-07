package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Emp;

public interface IEmpService {

	void save(Emp obj);

	void update(Emp obj);

	void delete(Integer no);

	Emp findOne(Integer no);

	List<Emp> findAll();
}
