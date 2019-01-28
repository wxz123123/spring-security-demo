package com.example.demo;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.pojo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringSecurityDemoApplicationTests {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Test
	public void addUserTest() {
		UserInfo userInfo=new UserInfo();
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		userInfo.setUsername("root");
		userInfo.setPassword(encoder.encode("123456"));
		userInfoMapper.insert(userInfo);
	}

}

