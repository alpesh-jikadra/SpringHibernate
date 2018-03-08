package com.example.manager.impl;

import java.util.List;

import com.example.dao.UserDAO;
import com.example.dto.User;
import com.example.manager.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDAO userDao;
	@Override
	public List<User> readAllUsers() {
		
		List<User> listAll = userDao.listAll();
		System.out.println(listAll);
		return listAll;
		
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	
}
