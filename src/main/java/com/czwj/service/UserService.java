package com.czwj.service;

import java.util.List;

import com.czwj.domain.User;

public interface UserService {
	List<User> findAll();
	
	User findByUserCode(String userCode);
	
	int addUser(User user);

	int delUser(int userId);

	int updateUser(User user);
	
	User getUserInformationById(int id);

	public void aa();
}