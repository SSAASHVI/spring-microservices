package com.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.domain.Account;
import com.account.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository repo;
	
	public Account account(Account account) {
		System.out.println("Account service");
		return repo.account(account);
		
	}

}
