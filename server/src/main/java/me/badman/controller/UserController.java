package me.badman.controller;

import me.badman.entity.User;
import me.badman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping("/sayHello")
	public String sayHello(String name)
	{
		if(name==null)return "Hello World";
		return "Hello "+name;
	}

	/**
	 * 添加用户
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(String name, Integer age){
		User user =new User();
		user.setName(name);
		user.setAge(age);
		this.userService.addUser(user);
		return user.toString();
	}

}
