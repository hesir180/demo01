package com.czwj.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.czwj.domain.User;
@Repository
public interface UserMapper {

	List<User> findAll();

	int addUser(User user);

	int delUser(int userId);

	int updateUser(User user);
	

	User getUserInformationById(int id);

}
