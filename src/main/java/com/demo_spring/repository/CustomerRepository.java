package com.demo_spring.repository;

import java.util.List;

import com.demo_spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}