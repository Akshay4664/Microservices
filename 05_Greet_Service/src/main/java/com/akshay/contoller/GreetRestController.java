package com.akshay.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welcomeClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String welcomeMsg = welcomeClient.getWelcomeMsg();
		
		String greetMsg = "Good morning...!";
		
		return greetMsg+welcomeMsg; 
	}
}
