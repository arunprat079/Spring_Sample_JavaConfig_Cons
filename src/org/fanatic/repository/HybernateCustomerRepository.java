package org.fanatic.repository;

import java.util.*;

import org.fanatic.model.Customer;

public class HybernateCustomerRepository implements customerRepository {

	/* (non-Javadoc)
	 * @see org.fanatic.repository.customerRepository#findAll()
	 */
	public List<Customer> findAll()
	{
		List<Customer> customers = new ArrayList <Customer>();
		Customer c = new Customer();
		Customer c1 = new Customer();
		c.setFirstName("Vivek");
		c.setLastName("Kumar");
		c1.setFirstName("Love");
		c1.setLastName("Kumar");
		customers.add(c);
		customers.add(c1);
		return customers;
	}

	
	
}
