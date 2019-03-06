package com.demo_spring.service;

import java.util.List;

import com.demo_spring.model.Customer;
import com.demo_spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepo;
	
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
	//setter injection
	public void setCustomerRepo(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}
}
