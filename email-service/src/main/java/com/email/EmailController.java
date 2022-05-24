package com.email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@GetMapping("/email")
	String sendEmail(@RequestParam("address") String email) {
		System.out.println(email);
		return "mail sent";
	}
}
