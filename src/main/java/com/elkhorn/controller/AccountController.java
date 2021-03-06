package com.elkhorn.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elkhorn.beans.Account;
import com.elkhorn.dto.AccountDTO;
import com.elkhorn.service.AccountService;

@CrossOrigin
@RestController
public class AccountController {
	 Logger logger = Logger.getLogger(AccountController.class);

	@Autowired
	AccountService accountService;

	@GetMapping(path = "/account/{id}")
	public ResponseEntity<AccountDTO> getpublic(@PathVariable int id) {
		Account account = accountService.accountbyid(id);
		return new ResponseEntity<AccountDTO>(new AccountDTO(account), HttpStatus.OK);
	}

	@PostMapping(path = "/account/create")
	public ResponseEntity<AccountDTO> getpublic(@RequestBody AccountDTO account) {
		Account accountNew = accountService.createAccount(new Account(account));
		return new ResponseEntity<AccountDTO>(new AccountDTO(accountNew), HttpStatus.OK);
	}

	@PostMapping(path = "/account/login")
	public ResponseEntity<Account> getpublic(@RequestBody Account account) {
		Account accountLogin = accountService.loginAccount(account.getUsername(), account.getPassword());
		logger.getLevel();
		return new ResponseEntity<Account>(accountLogin, HttpStatus.OK);

	}

}
