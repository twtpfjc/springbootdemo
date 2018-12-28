package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.dao.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	
	  	@Autowired
	    private UserMapper userMapper;
	    
	    
	    public List<User> findAllUser() {
	        List<User> list = userMapper.findAll();
	        return list;
	    }


		@Override
		public User findUserById(Integer id) {
			 User user = userMapper.findUserById(id);
			return user;
		}


		@Override
		public void updateUser(User user) {
			userMapper.updateUser(user);
		}


		@Override
		public void addUser(User user) {
			userMapper.addUser(user);
		}


		@Override
		public void delete(Integer id) {
			userMapper.delete(id);
		}

}
