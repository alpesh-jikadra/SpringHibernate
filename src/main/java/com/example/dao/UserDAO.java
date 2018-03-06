package com.example.dao;

import java.util.List;

import com.example.dto.User;

public interface UserDAO {

	public User get();
	public List<User> listAll();
}
