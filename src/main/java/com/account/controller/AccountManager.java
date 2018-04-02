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
		return null;
	}

	public Account updateAccount(int id, Account account) {
		
		return account;
	}

	public Account createAccount(Account account1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account deleteAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
