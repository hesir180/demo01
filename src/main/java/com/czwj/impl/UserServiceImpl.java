package com.czwj.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.czwj.domain.User;
import com.czwj.mapper.UserMapper;
import com.czwj.service.UserService;
import com.google.gson.Gson;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	UserMapper userMapper;

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userMapper.findAll();
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return this.userMapper.addUser(user);
	}

	public int delUser(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.delUser(userId);
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userMapper.updateUser(user);
	}

	public User findByUserCode(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserInformationById(int id) {
		System.out.println(id);
		// TODO Auto-generated method stub
		return userMapper.getUserInformationById(id);
	}
	
	public void aa(){
		System.out.println("aaaa");
	}
}
