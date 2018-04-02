package com.account.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HomeControllerTest {

	HomeController controller;
	
	@Test
	public void test() {
		controller = new HomeController();
		assertEquals("Welcome to the Account App - Home page located at: localhost:8080/index.html", controller.home());
	}

}
