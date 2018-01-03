package com.czwj.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.czwj.domain.User;
import com.czwj.domain.role_entity;
@Repository
public interface UserMapper {

	List<User> findAll();

	int addUser(User user);

	int delUser(int userId);

	int updateUser(User user);
	

	User getUserInformationById(int id);

	List<role_entity> GetUserRelatedEntity(int id);

}
