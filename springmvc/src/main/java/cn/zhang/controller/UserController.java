package cn.zhang.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zhang.model.User;
import cn.zhang.service.UserService;


@Controller
@RequestMapping("/userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryUserById/{id}")
	public String queryUserById(@PathVariable String id, HttpServletRequest request) {
		User user = userService.getUserById(Integer.parseInt(id));
		request.setAttribute("user", user);
		return "queryUser";
	}
}
