package com.account.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.account.model.Account;

public class AccountManager {

	private Map<Integer, Account> accountMap = new HashMap<>();
	private int idIndex = 1;

	public Account getAccount(int id){
		return accountMap.get(id);
	}

	public ArrayList<Account> list() {
		return new ArrayList<Account>(accountMap.values());
	}

	public Account updateAccount(int id, Account account) {
		accountMap.put(id,  account);
		return account;
	}

	public Account createAccount(Account account) {
		account.setId(idIndex);
		accountMap.put(idIndex, account);
		idIndex++;
		return account;
	}

	public Account deleteAccount(int id) {
		return accountMap.remove(id);
	}
	
}
