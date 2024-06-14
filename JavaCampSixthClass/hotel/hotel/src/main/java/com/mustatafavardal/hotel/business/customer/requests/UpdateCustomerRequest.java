package com.mustatafavardal.hotel.business.customer.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {

	private int id;

	private String name;


	private String email;

}
