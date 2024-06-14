package com.mustatafavardal.hotel.business.customer.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mustatafavardal.hotel.business.customer.requests.CreateCustomerRequest;
import com.mustatafavardal.hotel.business.customer.requests.UpdateCustomerRequest;
import com.mustatafavardal.hotel.business.customer.responses.GetAllCustomerResponse;
import com.mustatafavardal.hotel.business.customer.responses.GetByIdCustomerResponse;

public interface CustomerService {
	ResponseEntity<List<GetAllCustomerResponse>> getAll();

	GetByIdCustomerResponse getById(int id);

	void add(CreateCustomerRequest createCustomerRequest);

	void update(UpdateCustomerRequest customerRequest);

	void deleteById(int id);
}