package com.mustatafavardal.hotel.webapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
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

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {

	private CustomerService customerService;

	@GetMapping()
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	List<GetAllCustomerResponse> getAll() {
		return customerService.getAll();
	}

	@GetMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public GetByIdCustomerResponse getById(@PathVariable int id) {
		return customerService.getById(id);

	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid CreateCustomerRequest createCustomerRequest) {
		this.customerService.add(createCustomerRequest);
	}

	@PutMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@RequestBody() UpdateCustomerRequest updateCustomerRequest) {
		this.customerService.update(updateCustomerRequest);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		this.customerService.deleteById(id);
	}

}
