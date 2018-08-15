package com.wind.controller;

import com.wind.pojo.JSONResult;
import com.wind.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public JSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc777");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc~~hello imooc~~");
		
		return JSONResult.ok(u);
	}
}
