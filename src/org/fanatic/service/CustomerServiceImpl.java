package org.fanatic.service;
import java.util.List;

import org.fanatic.model.Customer;
import org.fanatic.repository.customerRepository;

public class CustomerServiceImpl implements customerService {

	customerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
		System.out.println("We are using default Constructor.");
	}


	public CustomerServiceImpl(customerRepository customerRepository) {
		
		System.out.println("We are using Constructor Injection...");
		this.customerRepository = customerRepository;
	}

	/*public void setCustomerRepository(customerRepository customerRepository) {
		System.out.println("We are using Setter Injection");
		this.customerRepository = customerRepository;
	}*/
	
	

	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}


	
}
