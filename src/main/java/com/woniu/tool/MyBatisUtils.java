package com.woniu.tool;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//声明静态sqlsessionfactory 目的是：
	static SqlSessionFactory sessionFactory;
	//声明静态ThreadLocal  目的是：
	static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();
	static {
		try {
			//创建reader对象，读取mybatis的主配置文件
			Reader reader = Resources.getResourceAsReader("conf.xml");
			//创建sessionFactory对象
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//确保session对象为当前session对象
	public static SqlSession getSession() {
		//通过threadLocal的get()方法得到当前session
		SqlSession session = tl.get();
		if(session==null) {
			//获得session
			session = sessionFactory.openSession();
			tl.set(session);
		}
		return session;
	}
	//关闭session
	public static void closeSession() {
		SqlSession session = tl.get();
		if(session!=null) {
			session.close();
			tl.set(null);
		}
	}
}
