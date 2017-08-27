package cn.zhang.service;

import java.util.List;

import cn.zhang.model.User;

public interface UserService {

	public abstract User getUserById(Integer id);

	public abstract List<User> getAllUser();

}
