package com.blogspot.javabyrajasekhar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello() {
		return "welcome to spring security";
		
	}

}
