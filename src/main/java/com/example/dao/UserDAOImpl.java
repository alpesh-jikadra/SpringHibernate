package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.example.dto.User;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> listAll() {
		Session session = SessionFactoryUtils.getSession(sessionFactory, true);
		return session.createQuery("from User").list();
	}

	@Override
	public User get() {
		Session session = SessionFactoryUtils.getSession(sessionFactory, true);
		return (User) session.get(User.class, 1);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> listAndGet() {
		Session session = SessionFactoryUtils.getSession(sessionFactory, true);
		List<User> list = session.createQuery("from User").list();
		list.add(get());
		return list;
	}
	
	
}
