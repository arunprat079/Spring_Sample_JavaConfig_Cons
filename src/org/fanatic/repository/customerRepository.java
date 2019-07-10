package org.fanatic.repository;

import java.util.List;

import org.fanatic.model.Customer;

public interface customerRepository {

	public abstract List<Customer> findAll();
	
	

}