package com.demo_spring.service;

import java.util.List;

import com.demo_spring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}