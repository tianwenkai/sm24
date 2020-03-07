package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.IDeptDao;
import com.woniu.pojo.Dept;
import com.woniu.tool.MyBatisUtils;

public class DeptDaoImpl implements IDeptDao{
	String namespace = "com.woniu.pojo.DeptMapper";
	@Override
	public void save(Dept obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().insert(namespace+".save", obj);
	}

	@Override
	public void update(Dept obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().update(namespace+".update", obj);
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().delete(namespace+".delete", no);
	}

	@Override
	public Dept findOne(Integer no) {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectOne(namespace+".findOne", no);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectList(namespace+".findAll");
	}

}
