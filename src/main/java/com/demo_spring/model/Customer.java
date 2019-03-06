package com.demo_spring.model;

public class Customer {
	private String firstname;
	private String lastname;
	
	//default constructor - this can be omitted as Spring create it
	public Customer() {
		
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
