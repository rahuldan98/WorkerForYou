package com.org.workerforyou.util.converter;

import org.springframework.stereotype.Component;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;

@Component
public class CustomerConverter {
	
		public Customer convert(CustomerDto customerDto) {
			
			return Customer.builder().name(customerDto.getName()).build();
			
	}

}
