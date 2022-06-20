package com.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.domain.Account;
import com.account.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService service;
	
	@PostMapping("/account")
	public Account account(@RequestBody Account account) {
		System.out.println("Account controller");
		return service.account(account) ;
		
	}

}
