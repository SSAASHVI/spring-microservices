package com.customer.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.domain.Customer;
import com.customer.domain.CustomerDB;
import com.customer.repositary.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repositary;
	
	@Autowired
	RestTemplate restTemplate;

	public Customer addCustomer(Customer customer) {
		System.out.println("Customer service add");
		CustomerDB custDB= new CustomerDB();
		custDB.setName(customer.getName());
		custDB.setAddress(customer.getAddress());
		custDB.setCity(customer.getCity());
		custDB.setEmail(customer.getAddress());
		custDB.setGender(customer.getGender());
		custDB.setPin(customer.getPin());
		custDB.setTelephone(customer.getTelephone());
		try {
			custDB.setDOB(new SimpleDateFormat("yyyy-MM-dd").parse(customer.getBirth()));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		custDB.setCreatedon(new Date());
		repositary.save(custDB);
		restTemplate.getForEntity("http://localhost:8085/email/"+custDB.getId(), String.class);
		System.out.println(restTemplate.getForEntity("http://localhost:8085/emailId?id="+custDB.getId(), String.class));
		customer.setId(custDB.getId());
		return customer;
	}
}
