package com.org.workerforyou.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.exception.CustomerNotFoundException;
import com.org.workerforyou.exception.DuplicateCustomerException;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.repository.ICustomerRepository;
import com.org.workerforyou.service.ICustomerService;
import com.org.workerforyou.util.converter.CustomerConverter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService{

	private ICustomerRepository customerRepository;
	 private CustomerConverter customerConverter;
	 
	@Override
	public Customer register(CustomerDto customerDto) {
		
		Optional<Customer> optionalCustomer= customerRepository.findByName(customerDto.getName());
		
		if(optionalCustomer.isPresent())
			throw new DuplicateCustomerException("Duplicate customer present");
		
		Customer customer = customerConverter.convert(customerDto);
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer view(Integer id) {
		
		return customerRepository.findById(id).orElseThrow(()-> 
		new CustomerNotFoundException("Customer not found"));
	}

	@Override
	public List<Customer> viewAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer update(Integer id, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		Customer customer= customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		customer.setName(customerDto.getName());
		return customerRepository.save(customer);
	}

	@Override
	public Customer delete(Integer id) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		customerRepository.delete(customer);
		return customer;
	}

	@Override
	public Worker request(Integer customerid, Integer workerid) {
		// TODO Auto-generated method stub
		return null;
	}

}
