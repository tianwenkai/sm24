package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.IEmpDao;
import com.woniu.pojo.Emp;
import com.woniu.tool.MyBatisUtils;

public class EmpDaoImpl implements IEmpDao{
	String namespace = "com.woniu.pojo.EmpMapper";
	@Override
	public void save(Emp obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().insert(namespace+".save", obj);
	}

	@Override
	public void update(Emp obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().update(namespace+".update", obj);
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().delete(namespace+".delete", no);
	}

	@Override
	public Emp findOne(Integer no) {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectOne(namespace+".findOne", no);
	}

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectList(namespace+".findAll");
	}

}
