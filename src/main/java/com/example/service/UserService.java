package com.example.service;

import java.util.List;

import com.example.bean.User;

public interface UserService {
	 public List<User> findAllUser();

	public User findUserById(Integer id);

	public void updateUser(User user);

	public void addUser(User user);

	public void delete(Integer id);
}
