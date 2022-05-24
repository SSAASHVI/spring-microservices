package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	
	RestTemplate template =new RestTemplate();
	@Autowired
	OrderRepository repository;
	public void saveOrder(OrderVO orderVO) {
		repository.save(orderVO);
		template.getForEntity("http://localhost:8080/email?address="+orderVO.getEmail(), String.class);
		
		System.out.println(orderVO.getItem());
		System.out.println(orderVO.getQuantity());
	}
	public List<OrderVO> getOrders() {
		return repository.findAll();
	}
}
