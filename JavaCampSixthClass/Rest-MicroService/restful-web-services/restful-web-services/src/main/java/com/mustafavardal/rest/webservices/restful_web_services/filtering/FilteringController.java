package com.mustafavardal.rest.webservices.restful_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	
	@GetMapping("/filtering")
	public MappingJacksonValue getSomeBean() {
		 // Dynamic filter:
		//field1, field2
		 SomeBean bean = new SomeBean("value1", "value2", "value3");
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bean);		 
		
		SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
		
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
		mappingJacksonValue.setFilters(filters);
				 
		return mappingJacksonValue;
	}
	@GetMapping("/filtering-list") 
	public MappingJacksonValue getListSomeBean(){
		List<SomeBean> beans = Arrays.asList(new SomeBean("value1", "value2","value3"), new SomeBean("value11","value22","value33"));
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(beans);
		SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
		mappingJacksonValue.setFilters(filterProvider);
		return mappingJacksonValue;
		
	}
	
	

	/*
	 * @GetMapping("/filtering-list") public List<SomeBean> getListSomeBean() {
	 * // Static Filter
	 * // field2 ,field3 return Arrays.asList(new
	 * SomeBean("value1","value2","value3"), new
	 * SomeBean("value1","value2","value3")); }
	 */
}
