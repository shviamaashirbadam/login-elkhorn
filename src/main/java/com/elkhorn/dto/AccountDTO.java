package com.elkhorn.dto;

import com.elkhorn.beans.Account;

public class AccountDTO {
	private int accountId;
	private String username;
	private String password;

	public AccountDTO() {
		super();
		
	}
	public AccountDTO(int accountId, String username, String password) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
	}

	public AccountDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public AccountDTO(Account account) {
		// TODO Auto-generated constructor stub
		super();
		this.accountId=account.getAccountId();
		this.username=account.getUsername();
		this.password=account.getPassword();
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
