package com.example.demo;

import com.example.demo.entity.Roles;
import com.example.demo.mapper.RolesMapper;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RolesMapper rolesMapper;

	@Test
	public void contextLoads() {
		Roles roles = new Roles();
		roles.setId(2L);
		Roles r1 = rolesMapper.selectOne(roles);
		System.out.println(r1.toString());
	}

}
