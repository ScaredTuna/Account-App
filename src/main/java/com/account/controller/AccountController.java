package com.account.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;

@RestController
@RequestMapping("api/v1/")
public class AccountController {

	@RequestMapping(value = "accounts", method = RequestMethod.GET)
	public List<Account> accountList() {
		return null;
	}
}
