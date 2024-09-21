package com.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PAYMENTSERVICE")
public interface PaymentClient {
	
	@GetMapping("/payment/status")
	public String pay();

}
