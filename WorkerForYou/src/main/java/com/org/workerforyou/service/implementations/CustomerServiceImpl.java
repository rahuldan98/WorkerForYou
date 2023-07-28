package com.org.workerforyou.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Override
	public Customer register(CustomerDto cutomerdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer view(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer update(Integer id, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Worker request(Integer customerid, Integer workerid) {
		// TODO Auto-generated method stub
		return null;
	}

}
