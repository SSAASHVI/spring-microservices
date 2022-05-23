package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService service;
	
	@PostMapping("/order")
	public void createOrder(@Valid @RequestBody OrderVO orderVO) {
		service.saveOrder(orderVO);
	}

}
