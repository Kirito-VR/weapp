package com.example.weapp;

import com.example.weapp.bean.User;
import com.example.weapp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WeappApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Test
	void contextLoads() {
	}
	@Test
	void testUserMapper()
	{
		List<User> list=userMapper.findAllUsers();
		System.out.println(list);
	}
}
