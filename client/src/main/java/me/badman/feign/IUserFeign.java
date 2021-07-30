package me.badman.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "scdemo-server")
public interface IUserFeign {

	@PostMapping("/user/sayHello")
	String sayHello(@RequestParam("name")String name);
}
