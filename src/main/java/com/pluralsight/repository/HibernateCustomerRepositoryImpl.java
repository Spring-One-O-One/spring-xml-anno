package com.pluralsight.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Will");
		customer.setLastName("Mallett");
		
		customers.add(customer);
		
		return customers;
	}
	
}
