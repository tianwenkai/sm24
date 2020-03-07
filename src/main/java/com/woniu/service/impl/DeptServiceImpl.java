package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.woniu.dao.IDeptDao;
import com.woniu.dao.impl.DeptDaoImpl;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
import com.woniu.tool.MyBatisUtils;

public class DeptServiceImpl implements IDeptService {
    IDeptDao dd = new DeptDaoImpl();
	@Override
	public void save(Dept obj) {
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
	public void update(Dept obj) {
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
	public Dept findOne(Integer no) {
		// TODO Auto-generated method stub
		Dept dept = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			dept = dd.findOne(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return dept;
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		List<Dept> deptList = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			deptList = dd.findAll();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return deptList;
	}

}
