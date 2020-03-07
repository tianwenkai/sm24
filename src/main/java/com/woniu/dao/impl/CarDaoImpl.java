package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.ICarDao;
import com.woniu.pojo.Car;
import com.woniu.tool.MyBatisUtils;

public class CarDaoImpl implements ICarDao{
	String namespace = "com.woniu.pojo.CarMapper";
	@Override
	public void save(Car obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().insert(namespace+".save", obj);
	}

	@Override
	public void update(Car obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().update(namespace+".update", obj);
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().delete(namespace+".delete", no);
	}

	@Override
	public Car findOne(Integer no) {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectOne(namespace+".findOne", no);
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectList(namespace+".findAll");
	}

}
