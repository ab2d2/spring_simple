package com.demo_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_spring.model.Customer;
import com.demo_spring.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public CustomerServiceImpl() {
		
	}
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepo = customerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
	//setter injection
	@Autowired
	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("We are now using Setter injections");
		this.customerRepo = customerRepo;
	}
}
