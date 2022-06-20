package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.domain.Customer;
import com.customer.service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/customer" )
	public Customer customer(@RequestBody Customer customer) {
		System.out.println("Customer controller");
		return service.addCustomer(customer);
		
	}

}
