package com.account.repository;

import org.springframework.stereotype.Repository;

import com.account.domain.Account;

@Repository
public class AccountRepository {
	
	public Account account(Account account) {
		System.out.println("Account repository");
		return account;
	}

}
