package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;
	public void saveOrder(OrderVO orderVO) {
		repository.save(orderVO);
		System.out.println(orderVO.getItem());
		System.out.println(orderVO.getQuantity());
	}
	public List<OrderVO> getOrders() {
		return repository.findAll();
	}
}
