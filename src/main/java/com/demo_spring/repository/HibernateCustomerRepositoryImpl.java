package com.demo_spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo_spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.demo_spring.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Abdul");
		customer.setLastname("Rahimi");
		
		customers.add(customer);
		
		return customers;
	}
	
}
