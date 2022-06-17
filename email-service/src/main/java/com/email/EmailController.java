package com.email;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmailController {
	
	@GetMapping("/email")
	String sendEmail() {
		System.out.println("eMAIL SENT");
		return "Email Sent";
		}
	
	@GetMapping("/emailId")
	String sendEmailParam(@RequestParam String id) {
		System.out.println("Reqeust Parma Email sent for id :"+ id);
		return "Param id created : "+ id;
	}
	
	@GetMapping("/email/{id}")
	String sendEmail(@PathVariable String id) {
		System.out.println("Path Variable Email sent and id created : "+id);
		return "Id created"+ id;
	}
}
