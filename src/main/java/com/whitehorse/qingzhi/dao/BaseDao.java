package com.whitehorse.qingzhi.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.whitehorse.qingzhi.util.Util;

@Repository
public class BaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * 获取当前session
	 * @return
	 */
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	} 
	
	@SuppressWarnings("unchecked")
	public T select(int id){
		//getCurrentSession().createQuery("from User u where u.userId="+id).uniqueResult();
		return (T) getCurrentSession().get(Util.getSuperClassGenricType(this.getClass(), 0), id);
	}
	
}
