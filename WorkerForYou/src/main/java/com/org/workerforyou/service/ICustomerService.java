package com.org.workerforyou.service;

import java.util.List;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.View;
import org.springframework.stereotype.Service;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;


public interface ICustomerService {
	
	public  Customer register(CustomerDto cutomerdto);
	
	public Customer view (Integer id);
	
	public List<Customer> viewAll();
	
	public Customer update(Integer id, CustomerDto customerDto);
	
	public Customer delete(Integer id);
	
	public Worker request(Integer customerid, Integer workerid);

	 
}
