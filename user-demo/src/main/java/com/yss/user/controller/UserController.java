package com.yss.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yss.commons.demo.entity.User;
import com.yss.commons.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/demo/")
	@ResponseBody
	public User getUser() {
		log.info("查询用户 - userId - "+7);
		User user = userService.getUser(7);
		return user;
	}

}
