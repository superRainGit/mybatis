package cn.zhang.spring.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.zhang.model.User;
import cn.zhang.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestSpring {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(TestSpring.class.getName());

	@Autowired
	private DataSource dataSource;

	@Autowired
	private UserService userService;

	@Test
	public void testSpring() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

	@Test
	public void testUserService() {
		User user = userService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}

	@Test
	public void testGetAllUser() {
		List<User> user = userService.getAllUser();
		logger.info(JSON.toJSONString(user));
	}

}
