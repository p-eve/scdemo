package me.badman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/sayHello")
	public String sayHello(String name)
	{
		if(name==null)return "Hello World";
		return "Hello "+name;
	}

}
