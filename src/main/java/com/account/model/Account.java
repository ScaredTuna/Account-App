package com.account.model;

public class Account {
	
	private int id;
	private String firstName;
	private String surname;
	private int accountNumber;
	
	public Account(){}
	
	public Account(String firstName, String surname, int accountNumber){
		this.firstName = firstName;
		this.surname = surname;
		this.accountNumber = accountNumber;
	}

	public int getId(){
		return id;
	}
	
	public void setId(int idIndex) {
		this.id = idIndex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
}
