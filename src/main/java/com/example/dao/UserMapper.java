package com.example.dao;

import java.util.List;



import com.example.bean.User;


public interface UserMapper {
	public List<User> findAll();
	public User findUserById(Integer id);

	public void updateUser(User user);

	public void addUser(User user);

	public void delete(Integer id);
}
