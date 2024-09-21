package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.client.PaymentClient;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private PaymentClient paymentClient;
	
	@GetMapping("/status")
	public String getOrder() {
		
		return "Orders placed & "+paymentClient.pay();
	}
	
	@GetMapping("/test")
	public String testOrder() {
		
		return "Orders MicroService Up & Running";
	}

}
