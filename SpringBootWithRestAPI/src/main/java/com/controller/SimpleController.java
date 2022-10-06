package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@RequestMapping(value="say")
	public String sayHello()
	{
		return "welcome to spring boot with spring initializer";
	}

}
