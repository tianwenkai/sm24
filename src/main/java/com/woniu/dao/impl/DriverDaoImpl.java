package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.IDriverDao;
import com.woniu.pojo.Driver;
import com.woniu.tool.MyBatisUtils;

public class DriverDaoImpl implements IDriverDao{
	String namespace = "com.woniu.pojo.DriverMapper";
	@Override
	public void save(Driver obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().insert(namespace+".save", obj);
	}

	@Override
	public void update(Driver obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().update(namespace+".update", obj);
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().delete(namespace+".delete", no);
	}

	@Override
	public Driver findOne(Integer no) {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectOne(namespace+".findOne", no);
	}

	@Override
	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectList(namespace+".findAll");
	}

}
