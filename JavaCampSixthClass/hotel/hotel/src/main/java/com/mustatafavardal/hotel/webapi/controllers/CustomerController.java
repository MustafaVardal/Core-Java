package com.mustatafavardal.hotel.webapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mustatafavardal.hotel.business.customer.abstracts.CustomerService;
import com.mustatafavardal.hotel.business.customer.requests.CreateCustomerRequest;
import com.mustatafavardal.hotel.business.customer.requests.UpdateCustomerRequest;
import com.mustatafavardal.hotel.business.customer.responses.GetAllCustomerResponse;
import com.mustatafavardal.hotel.business.customer.responses.GetByIdCustomerResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/customers/rooms")
@AllArgsConstructor
public class CustomerController {
	

	private CustomerService customerService;
	
	
	
	@GetMapping
	ResponseEntity<List<GetAllCustomerResponse>> getAll(){
		ResponseEntity<List<GetAllCustomerResponse>> customers = customerService.getAll();
		
		return customers;
	}
	@GetMapping(path = "/{id}")
	public GetByIdCustomerResponse getByIdCustomerResponse(@PathVariable int id) {
		 return customerService.getById(id);
	
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addOneCustomer(@RequestBody() CreateCustomerRequest createCustomerRequest) {
		this.customerService.add(createCustomerRequest);
	}
	@PutMapping
	public void updateCustomer(@RequestBody UpdateCustomerRequest updateCustomerRequest) {
		this.customerService.update(updateCustomerRequest);
	}
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable int id) {
		this.customerService.deleteById(id);
	}
	
	


}
