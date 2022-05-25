package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	@Autowired
	RestTemplate template ;
	@Autowired
	OrderRepository repository;
	public Integer saveOrder(OrderVO orderVO) {
		repository.save(orderVO);
		template.getForEntity("http://localhost:8080/email?address="+orderVO.getEmail(), String.class);
		
		System.out.println(orderVO.getItem());
		System.out.println(orderVO.getQuantity());
		return orderVO.getId();
	}
	public List<OrderVO> getOrders() {
		return repository.findAll();
	}
}
