package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.ISendcarDao;
import com.woniu.pojo.Sendcar;
import com.woniu.tool.MyBatisUtils;

public class SendcarDaoImpl implements ISendcarDao{
	String namespace = "com.woniu.pojo.SendcarMapper";
	@Override
	public void save(Sendcar obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().insert(namespace+".save", obj);
	}

	@Override
	public void update(Sendcar obj) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().update(namespace+".update", obj);
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		MyBatisUtils.getSession().delete(namespace+".delete", no);
	}

	@Override
	public Sendcar findOne(Integer no) {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectOne(namespace+".findOne", no);
	}

	@Override
	public List<Sendcar> findAll() {
		// TODO Auto-generated method stub
		return MyBatisUtils.getSession().selectList(namespace+".findAll");
	}

}
