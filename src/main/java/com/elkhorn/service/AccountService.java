package com.elkhorn.service;

import javax.transaction.Transactional;

import org.apache.solr.logging.LoggerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkhorn.beans.Account;
import com.elkhorn.repository.AccountRepository;

import ch.qos.logback.classic.Logger;

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

	public Account loginAccount(String username, String password) {
		Account account = accountRepository.findByusername(username);
		if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
			return account;

		} else {
		  System.out.println("Invalid Info");
		  return null;
		}

	}
}
