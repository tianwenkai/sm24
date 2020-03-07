package com.woniu.tool;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//������̬sqlsessionfactory Ŀ���ǣ�
	static SqlSessionFactory sessionFactory;
	//������̬ThreadLocal  Ŀ���ǣ�
	static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();
	static {
		try {
			//����reader���󣬶�ȡmybatis���������ļ�
			Reader reader = Resources.getResourceAsReader("conf.xml");
			//����sessionFactory����
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//ȷ��session����Ϊ��ǰsession����
	public static SqlSession getSession() {
		//ͨ��threadLocal��get()�����õ���ǰsession
		SqlSession session = tl.get();
		if(session==null) {
			//���session
			session = sessionFactory.openSession();
			tl.set(session);
		}
		return session;
	}
	//�ر�session
	public static void closeSession() {
		SqlSession session = tl.get();
		if(session!=null) {
			session.close();
			tl.set(null);
		}
	}
}
