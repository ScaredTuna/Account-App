package com.account.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;

@RestController
@RequestMapping("api/v1/")
public class AccountController {
	
	AccountManager manager = new AccountManager();
	
	@RequestMapping(value = "accounts", method = RequestMethod.GET)
	public List<Account> accountList() {
		return manager.list();
	}
	
	@RequestMapping(value = "accounts", method = RequestMethod.POST)
	public Account create(@RequestBody Account account){
		return manager.createAccount(account);
	}
	
	@RequestMapping(value = "accounts/{id}", method = RequestMethod.GET)
	public Account get(@PathVariable int id){
		return manager.getAccount(id);
	}
	
	@RequestMapping(value = "accounts/{id}", method = RequestMethod.PUT)
	public Account update(@PathVariable int id, @RequestBody Account account){
		return manager.updateAccount(id, account);
	}
	
	@RequestMapping(value = "accounts/{id}", method = RequestMethod.DELETE)
	public Account delete(@PathVariable int id){
		return manager.deleteAccount(id);
	}
}
