package com.mustafavardal.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersonController {
	//URI
	@GetMapping("/v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Mustafa");
	}
	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Mustafa", "Vardal"));
	}
	// PARAMS
	@GetMapping(value = "/v1/person/param",params = "version=1")
	public PersonV1 personParamV1() {
		return new PersonV1("Mustafa");
	}
	@GetMapping(value = "/v2/person/param",params = "version=2")
	public PersonV2 personParamV2() {
		return new PersonV2(new Name("Mustafa", "Vardal"));
	}
	
	// HEADER
	@GetMapping(value = "/person/header",headers = "X-API-VERSION=1")
	public PersonV1 personHeaderV1() {
		return new PersonV1("Mustafa");
	}
	@GetMapping(value = "/person/header",headers = "X-API-VERSION=2")
	public PersonV2 personHeaderV2() {
		return new PersonV2(new Name("Mustafa", "Vardal"));
	}
	
	//PRODUCES
	@GetMapping(value = "/person/produces",produces  = "application/vnd.company.app-v1+json")
	public PersonV1 personProducesV1() {
		return new PersonV1("Mustafa");
	}
	@GetMapping(value = "/person/produces",produces =  "application/vnd.company.app-v2+json")
	public PersonV2 personProducesV2() {
		return new PersonV2(new Name("Mustafa", "Vardal"));
	}
	
	
	// All companies using different versioning type.
	// Mediatype versioning (a.k.a ===> "content negotiation", "accept header")
	// - GITHUB
	// (Custom) header versioning
	// - Microsoft
	// URI versioning
	// - Twitter
	// Request Parameter versioning
	// - Amazon
	
	
	// Which versioning type you should use Factors!!!
		// URI Pollution -- first 2
		// Misuse of http headers -- last 2
		// Caching  -- last 2 
		// Can we execute the request on the browser
		// API documentation
	// No Perfect Solution!
}
