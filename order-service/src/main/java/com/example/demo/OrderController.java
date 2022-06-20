package com.example.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService service;
	
	@PostMapping("/order")
	public Integer createOrder(@Valid @RequestBody OrderVO orderVO) {
		System.out.println("ADD ORDERS"+ orderVO);
		return service.saveOrder(orderVO);
	}
	@GetMapping("/order")
	public List<OrderVO> getOrders() {
		System.out.println("GET ORDERS");
		return  	service.getOrders();
	}
}
