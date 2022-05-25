package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class OrderControllerTest {
	@Mock
	OrderService service;
	@InjectMocks
	OrderController controller;
	@Test//AAA
	void testCreateOrder() {
		OrderVO orderVO = new OrderVO();
		Mockito.when(service.saveOrder(orderVO )).thenReturn(1);
		Integer result = controller.createOrder(orderVO);
		Assertions.assertEquals(1, result);
	}

}
