package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	@GetMapping("/status")
	public String pay() {
		
		return "payment done..!";
	}
	
	@GetMapping("/test")
	public String testpay() {
		
		return "payment microservice up & running..!";
	}

}
