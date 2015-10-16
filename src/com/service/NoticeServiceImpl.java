package com.service;

import java.util.*;

import com.ORM.*;
import com.base.*;

import org.hibernate.*;

import com.service.*;

public class NoticeServiceImpl extends BaseLog implements NoticeService {

	/** �������� */	
	public boolean addNotice(Notice word) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			session.save(word);
			tx.commit();
			status=true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�addNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	/** ��ҳ����������� */
	public List browseNotice(int pageSize, int pageNo) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		List list = null;
		try{
			Query query = session.createQuery("from Notice as a order by a.id desc");
			query.setMaxResults(pageSize);
			query.setFirstResult((pageNo-1)*pageSize);
			tx = session.beginTransaction();
			list = query.list();
			tx.commit();
			if (!Hibernate.isInitialized(list))Hibernate.initialize(list);
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�browseNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return list;
	}

	/** ����������� */
	public List browseNotice() throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		List list = null;
		try{
			Query query = session.createQuery("from Notice as a order by a.id desc");
			tx = session.beginTransaction();
			list = query.list();
			tx.commit();
			if (!Hibernate.isInitialized(list))Hibernate.initialize(list);
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�browseNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return list;
	}

	/** ͳ���������� */
	public int countNotice() throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		int count = 0;
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("select count(*) from Notice as a");
			query.setMaxResults(1);
			count = ((Integer)query.uniqueResult()).intValue();
			tx.commit();
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�countNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return count;
	}

	/** ɾ������ */	
	public boolean delNotice(Integer id) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			Notice word = (Notice)session.load(Notice.class, id);
			session.delete(word);
			tx.commit();
			status = true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�delNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	/** װ������ */	
	public Notice loadNotice(Integer id) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		Notice word = null;
		try{
			tx = session.beginTransaction();
			word = (Notice)session.get(Notice.class, id);
			tx.commit();
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�loadNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return word;
	}

	/** �ظ����� */	
	public boolean updateNotice(Notice word) throws Exception {
		Session session = MySessionFactory.getSession();
		Transaction tx = null;
		boolean status = false;
		try{
			tx = session.beginTransaction();
			session.update(word);
			tx.commit();
			status=true;
		}catch(Exception ex){
			if(tx!=null)tx.rollback();
			logger.info("��ִ��NoticeServiceImpl���е�updateNotice����ʱ����\n");
			ex.printStackTrace();
		}finally{
			MySessionFactory.closeSession();
		}	
		return status;
	}

	

}
