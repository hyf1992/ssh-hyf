package com.whitehorse.qingzhi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whitehorse.qingzhi.dao.UserDao;
import com.whitehorse.qingzhi.entity.User;
import com.whitehorse.qingzhi.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User select(int id) {
		
		return userDao.select(id);
	}

}
