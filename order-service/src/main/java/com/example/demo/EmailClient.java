package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(url = "http://localhost:8085/email", name="EmailClient")
@FeignClient(url = "http://EMAIL/email", name="EmailClient")
public interface EmailClient {
	
	@RequestMapping(method = RequestMethod.GET)
	String sendEmail();
	

}
