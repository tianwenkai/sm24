package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.woniu.dao.IDriverDao;
import com.woniu.dao.impl.DriverDaoImpl;
import com.woniu.pojo.Driver;
import com.woniu.service.IDriverService;
import com.woniu.tool.MyBatisUtils;

public class DriverServiceImpl implements IDriverService {
    IDriverDao dd = new DriverDaoImpl();
	@Override
	public void save(Driver obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			dd.save(obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public void update(Driver obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			dd.save(obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public void delete(Integer no) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			dd.delete(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public Driver findOne(Integer no) {
		// TODO Auto-generated method stub
		Driver Driver = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			Driver = dd.findOne(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return Driver;
	}

	@Override
	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		List<Driver> DriverList = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			DriverList = dd.findAll();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return DriverList;
	}

}
