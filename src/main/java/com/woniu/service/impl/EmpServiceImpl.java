package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.woniu.dao.IEmpDao;
import com.woniu.dao.impl.EmpDaoImpl;
import com.woniu.pojo.Emp;
import com.woniu.service.IEmpService;
import com.woniu.tool.MyBatisUtils;

public class EmpServiceImpl implements IEmpService {
    IEmpDao ed = new EmpDaoImpl();

    @Override
	public void save(Emp obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			ed.save(obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public void update(Emp obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			ed.save(obj);
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
			ed.delete(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public Emp findOne(Integer no) {
		// TODO Auto-generated method stub
		Emp emp = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			emp = ed.findOne(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return emp;
	}

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		List<Emp> empList = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			empList = ed.findAll();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return empList;
	}

}
