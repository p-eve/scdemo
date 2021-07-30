package me.badman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.badman.feign.IUserFeign;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private IUserFeign userFeign;
	
	@RequestMapping("/sayHello")
	public String sayHello(String name) {
		return this.userFeign.sayHello(name);
	}

}
