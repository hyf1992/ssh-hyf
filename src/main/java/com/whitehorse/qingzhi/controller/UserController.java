package com.whitehorse.qingzhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whitehorse.qingzhi.entity.User;
import com.whitehorse.qingzhi.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/select")
	public @ResponseBody User selectById(int id,Model model){
		User user = userService.select(id);
		System.out.println(id);
		System.out.println(user);
		model.addAttribute(user);
		return user;
	}
}
