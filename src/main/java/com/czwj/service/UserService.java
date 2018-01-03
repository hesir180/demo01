package com.czwj.service;

import java.util.List;

import com.czwj.domain.User;
import com.czwj.domain.role_entity;

public interface UserService {
	List<User> findAll();
	
	User findByUserCode(String userCode);
	
	int addUser(User user);

	int delUser(int userId);

	int updateUser(User user);
	
	User getUserInformationById(int id);

	List<role_entity> GetUserRelatedEntity(int id);
}