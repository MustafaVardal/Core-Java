package com.mustafavardal.rest.webservices.restful_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"field1"}) // We don't need to write again and again JsonIgnore annotation. Only use this. Static Filter
@JsonFilter("SomeBeanFilter")
public class SomeBean {
	//Static filter:
	private String field1;
	// @JsonIgnore
	private String field2;
	// @JsonIgnore
	private String field3;
}
