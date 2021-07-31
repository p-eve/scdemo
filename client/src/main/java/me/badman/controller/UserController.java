package me.badman.controller;

import me.badman.controller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.badman.feign.IUserFeign;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private IUserFeign userFeign;

	@Autowired
	private UserService userService;
	
	@RequestMapping("/sayHello")
	public String sayHello(String name) {
		return this.userFeign.sayHello(name);
	}

	@RequestMapping("/addUser")
	public String addUser(String name,Integer age){
		return this.userService.addUser(name,age);
	}

}
