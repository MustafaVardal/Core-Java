package com.mustafavardal.rest.webservices.restful_web_services.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionResponse{
	private Date timestamp;
	private String message;
	private String details;
	
	

}
