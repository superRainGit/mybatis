package cn.zhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhang.dao.UserMapper;
import cn.zhang.model.User;
import cn.zhang.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAllUser() {
		List<User> user = userMapper.getAllUser();
		return user;
	}
}
