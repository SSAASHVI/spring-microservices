package com.customer.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.domain.Customer;
import com.customer.domain.CustomerDB;
import com.customer.repositary.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repositary;

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
		custDB.setDOB(customer.getDOB());
		custDB.setCreatedon(new Date());
		repositary.save(custDB);
		customer.setId(custDB.getId());
		return customer;
	}
}
