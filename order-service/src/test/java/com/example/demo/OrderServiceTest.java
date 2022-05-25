package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {
	@Mock
	OrderRepository repository;
	@InjectMocks
	OrderService service;
	@Mock
	private RestTemplate restTemplate;

	@Test
	void testSaveOrder() {
		OrderVO orderVO = new OrderVO();
		orderVO.setId(1);
		when(repository.save(orderVO)).thenReturn(orderVO);
		Integer result = service.saveOrder(orderVO);
		assertEquals(1, result);
	}

	@Test
	void testGetOrders() {
		fail("Not yet implemented");
	}

}
