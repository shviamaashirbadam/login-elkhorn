package com.elkhorn.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.elkhorn.dto.AccountDTO;

@Entity
@Table(name = "ACCOUNT")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountSequence")
	@SequenceGenerator(allocationSize = 1, name = "accountSequence", sequenceName = "SQ_ACCOUNT_PK")
	@Column(name = "ACCOUNT_ID")
	private int accountId;
	@Column(name = "USERNAME", nullable = false)
	private String username;
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	public Account() {
		super();

	}

	public Account(int accountId, String username, String password) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
	}

	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Account(AccountDTO account) {
		super();
		this.accountId=account.getAccountId();
		this.username = account.getUsername();
		this.password = account.getPassword();
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

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + "]";
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}
