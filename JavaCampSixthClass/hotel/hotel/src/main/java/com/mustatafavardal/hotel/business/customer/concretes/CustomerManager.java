package com.mustatafavardal.hotel.business.customer.concretes;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mustatafavardal.hotel.business.customer.abstracts.CustomerService;
import com.mustatafavardal.hotel.business.customer.requests.CreateCustomerRequest;
import com.mustatafavardal.hotel.business.customer.requests.UpdateCustomerRequest;
import com.mustatafavardal.hotel.business.customer.responses.GetAllCustomerResponse;
import com.mustatafavardal.hotel.business.customer.responses.GetByIdCustomerResponse;
import com.mustatafavardal.hotel.core.utilities.model.ModelMapperService;
import com.mustatafavardal.hotel.dataAccess.CustomerRepository;
import com.mustatafavardal.hotel.entities.Customer;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {


	private CustomerRepository customerRepository;

	private ModelMapperService modelMapperService;

	@Override
	public ResponseEntity<List<GetAllCustomerResponse>> getAll() {
		List<Customer> allCustomers = customerRepository.findAll();

		List<GetAllCustomerResponse> getAllCustomerResponses = allCustomers.stream() // For each customer turn the GetAllCustomerResponse Type.
				.map(selectedCustomer -> this.modelMapperService.forResponses().map(selectedCustomer,
						GetAllCustomerResponse.class))
				.toList();

		return ResponseEntity.ok(getAllCustomerResponses);
	}

	@Override
	public GetByIdCustomerResponse getById(int id) {
		Customer customer = customerRepository.findById(id).orElseThrow();
		GetByIdCustomerResponse getByIdCustomerResponse = this.modelMapperService.forResponses().map(customer,
				GetByIdCustomerResponse.class);

		return getByIdCustomerResponse;
	}

	@Override
	public void add(CreateCustomerRequest createCustomerRequest) {
		
													// With forRequests() it will be new. Like: Brand brand = new Brand() & brand.setName(createBrandRequest.getName())
		Customer customer = this.modelMapperService.forRequests().map(createCustomerRequest, Customer.class); // I have customer object change the customer type.
		this.customerRepository.save(customer);

	}

	@Override
	public void update(UpdateCustomerRequest updateCustomerRequest) {
		Customer customer = this.modelMapperService.forRequests().map(updateCustomerRequest, Customer.class);
		this.customerRepository.save(customer);

	}

	@Override
	public void deleteById(int id) {
		Customer customer = customerRepository.findById(id).orElseThrow();
		
		this.customerRepository.delete(customer);

	}

}
