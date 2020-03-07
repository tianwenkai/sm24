package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.IManagerDao;
import com.woniu.pojo.Manager;
import com.woniu.tool.MyBatisUtils;

public class ManagerDaoImpl implements IManagerDao{
	String namespace = "com.woniu.pojo.ManagerMapper";
	@Override
	public void save(Manager obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().insert(namespace+".save", obj);
	}

	@Override
	public void update(Manager obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().update(namespace+".update", obj);
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().delete(namespace+".delete", no);
	}

	@Override
	public Manager findOne(Integer no) {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectOne(namespace+".findOne", no);
	}

	@Override
	public List<Manager> findAll() {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectList(namespace+".findAll");
	}

}
