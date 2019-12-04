package com.yss.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yss.commons.demo.entity.User;
import com.yss.commons.demo.service.UserService;
import com.yss.commons.web.util.JsonUtil;

@Service
public class UserServiceImpl implements UserService{
	
	@Value("${test.user-service.users}")
	private String userJson;
	
	@Override
	public User getUser(Integer id) {
		List<User> list = 
		 JsonUtil.from(userJson,
		 new TypeReference<List<User>>() {});
		
		for (User user : list) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		
		return new User(id, "username"+id, "password"+id);
	}

}
