package com.mustatafavardal.hotel.business.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomerResponse {
	
	private int id;
	
	private String name;
	
	private String email;
}
