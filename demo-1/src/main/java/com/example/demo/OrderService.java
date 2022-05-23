package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public void saveOrder(OrderVO orderVO) {
		System.out.println(orderVO.getItem());
	}

}
