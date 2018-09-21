package com.elkhorn.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkhorn.beans.Account;
import com.elkhorn.repository.AccountRepository;

@Service
@Transactional
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	public Account accountbyid(int id) {
		return accountRepository.findOne(id);		
	}
	
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}
	

}
