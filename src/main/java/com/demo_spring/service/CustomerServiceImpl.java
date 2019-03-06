package com.demo_spring.service;

import java.util.List;

import com.demo_spring.model.Customer;
import com.demo_spring.repository.CustomerRepository;
import com.demo_spring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.demo_spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
