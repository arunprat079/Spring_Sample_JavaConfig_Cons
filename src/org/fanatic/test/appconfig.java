package org.fanatic.test;
import java.io.ObjectInputStream.GetField;

import org.fanatic.repository.HybernateCustomerRepository;
import org.fanatic.repository.customerRepository;
import org.fanatic.service.CustomerServiceImpl;
import org.fanatic.service.customerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appconfig
{
	@Bean(name="customerService")
	public customerService getCustomerService()
	{
		CustomerServiceImpl service=new CustomerServiceImpl(getCustomerRepository());
		
		return service;
		
	}
	@Bean
	public customerRepository getCustomerRepository()
	{
		customerRepository cs = new HybernateCustomerRepository();
		return cs;
	}
	
	

}
