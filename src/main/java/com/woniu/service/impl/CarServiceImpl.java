package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.woniu.dao.ICarDao;
import com.woniu.dao.impl.CarDaoImpl;
import com.woniu.pojo.Car;
import com.woniu.service.ICarService;
import com.woniu.tool.MyBatisUtils;

public class CarServiceImpl implements ICarService {
    ICarDao cd = new CarDaoImpl();
	@Override
	public void save(Car obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			cd.save(obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public void update(Car obj) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtils.getSession();
		try {
			cd.save(obj);
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
			cd.delete(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
	}

	@Override
	public Car findOne(Integer no) {
		// TODO Auto-generated method stub
		Car car = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			car = cd.findOne(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return car;
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		List<Car> carList = null;
		SqlSession session = MyBatisUtils.getSession();
		try {
			carList = cd.findAll();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtils.closeSession();
		}
		return carList;
	}

}
