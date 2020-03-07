package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.woniu.dao.IManagerDao;
import com.woniu.dao.impl.ManagerDaoImpl;
import com.woniu.pojo.Manager;
import com.woniu.service.IManagerService;
import com.woniu.tool.MyBatisUtils;

public class ManagerServiceImpl implements IManagerService {
    IManagerDao md = new ManagerDaoImpl();
	@Override
	public void save(Manager obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			md.save(obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public void update(Manager obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			md.save(obj);
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
			md.delete(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public Manager findOne(Integer no) {
		// TODO Auto-generated method stub
		Manager Manager = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			Manager = md.findOne(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return Manager;
	}

	@Override
	public List<Manager> findAll() {
		// TODO Auto-generated method stub
		List<Manager> managerList = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			managerList = md.findAll();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return managerList;
	}

}
