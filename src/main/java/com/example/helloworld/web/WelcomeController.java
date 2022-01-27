package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class WelcomeController {

	@RequestMapping("/hello")
	public String hello(@RequestParam(name="location") String location,
			@RequestParam(name="firstname") String firstname ) {
		
		String paluu = "Welcome to the " + location + " " + firstname + "!";
		return paluu;
	}

}
