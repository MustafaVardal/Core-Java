package com.mustatafavardal.hotel.business.rules;

import org.springframework.stereotype.Service;

import com.mustatafavardal.hotel.core.utilities.exceptions.BusinessException;
import com.mustatafavardal.hotel.dataAccess.CustomerRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class CustomerBusinessRules {
	
	private CustomerRepository customerRepository;
	
	public void checkIfCustomerNameExists(String name) {
		if(this.customerRepository.existsByName(name)) {
			throw new BusinessException("Customer name already exists.");
		}
	}
}
