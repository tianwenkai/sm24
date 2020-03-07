package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.woniu.dao.ISendcarDao;
import com.woniu.dao.impl.SendcarDaoImpl;
import com.woniu.pojo.Sendcar;
import com.woniu.service.ISendcarService;
import com.woniu.tool.MyBatisUtils;

public class SendcarServiceImpl implements ISendcarService {
    ISendcarDao sd = new SendcarDaoImpl();
	@Override
	public void save(Sendcar obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			sd.save(obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public void update(Sendcar obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			sd.save(obj);
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
			sd.delete(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public Sendcar findOne(Integer no) {
		// TODO Auto-generated method stub
		Sendcar Sendcar = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			Sendcar = sd.findOne(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return Sendcar;
	}

	@Override
	public List<Sendcar> findAll() {
		// TODO Auto-generated method stub
		List<Sendcar> SendcarList = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			SendcarList = sd.findAll();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return SendcarList;
	}

}
