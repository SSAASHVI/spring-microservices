package com.customer.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.domain.Customer;
import com.customer.domain.CustomerDB;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDB, Integer> {
	

}
