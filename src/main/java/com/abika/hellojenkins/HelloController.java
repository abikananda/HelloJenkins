package com.abika.hellojenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String sayHello() {
		return "Hello Jenkins. I am Abikananda";
	}
}
