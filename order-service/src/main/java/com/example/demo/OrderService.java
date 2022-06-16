package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;
	@Autowired
	RestTemplate restTemplate ;
	@Autowired
	EmailClient emailClient;
	
	public Integer saveOrder(OrderVO orderVO) {
		
		System.out.println("In service save order");
		repository.save(orderVO);
		//template.getForEntity("http://localhost:8080/email?address="+orderVO.getEmail(), String.class);
		System.out.println(orderVO.getItem());
		System.out.println(orderVO.getQuantity());
		ResponseEntity<String> response = restTemplate.getForEntity("http://EMAIL/email", String.class);//nOT WORKING
		System.out.println("1:"+response.getBody());
		ResponseEntity<String> response1 = restTemplate.getForEntity(emailClient.sendEmail(), String.class);// NOT WORKING
		System.out.println("2:"+response1.getBody());
		System.out.println("3:"+emailClient.sendEmail());
		return orderVO.getId();
	}
	public List<OrderVO> getOrders() {
		/*
		 * RestTemplate template = new RestTemplate(); ResponseEntity<String> response =
		 * template.getForEntity("http://localhost:8085", String.class);
		 System.out.println(response.getBody());*/
		return repository.findAll();
	}
}
