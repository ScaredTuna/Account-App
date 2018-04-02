package com.account.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.account.model.Account;

public class AccountManagerTest {
	
	AccountManager manager;

	@Test
	public void test() {
		manager = new AccountManager();
		Account account1 = new Account("Joe", "Bloggs", 12345678);
		Account account2 = manager.createAccount(account1);
		assertEquals(account2, account1);
		assertEquals(account1, manager.getAccount(1));
		ArrayList<Account> accountList = manager.list();
		assertEquals(1, accountList.size());
		Account account3 = new Account("Jane", "Bloggs", 23456789);
		account3 = manager.updateAccount(account1.getId(), account3);
		assertEquals("Jane", manager.getAccount(1).getFirstName());
		assertEquals("Bloggs", manager.getAccount(1).getSurname());
		assertEquals(23456789, (int)manager.getAccount(1).getAccountNumber());
		account3 = manager.deleteAccount(1);
		accountList = manager.list();
		assertEquals(0, accountList.size());
	}

}
