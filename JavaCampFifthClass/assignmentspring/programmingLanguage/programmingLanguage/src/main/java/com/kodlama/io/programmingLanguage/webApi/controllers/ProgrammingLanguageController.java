package com.kodlama.io.programmingLanguage.webApi.controllers;


import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;
import com.kodlama.io.programmingLanguage.business.responses.GetAllProgrammingLanguageResponse;
import com.kodlama.io.programmingLanguage.business.responses.GetByIdProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguageController {
	@Autowired
	private ProgrammingLanguageService programmingLanguageService;
	JSONObject result = new JSONObject();

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GetAllProgrammingLanguageResponse> getAll(){
		return this.programmingLanguageService.getAll();
	}
	
	@GetMapping(path = ("/{id}"), produces = MediaType.APPLICATION_JSON_VALUE)
	public GetByIdProgrammingLanguageResponse getById(@PathVariable int id) {
		return this.programmingLanguageService.getById(id);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String create(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		result.put("Message", createProgrammingLanguageRequest.getName() + " language is added.");
		programmingLanguageService.create(createProgrammingLanguageRequest);
		return result.toString();
	}
	
	@DeleteMapping(path = ("{id}"), produces = MediaType.APPLICATION_JSON_VALUE)
	public String delete(@PathVariable int id) {
		result.put("Message", "Language is deleted: " + id);
		this.programmingLanguageService.delete(id);
		return result.toString();
	}
	
	
	
	/*
	 * @PostMapping(path = , produces = MediaType.APPLICATION_JSON_VALUE) public
	 * ResponseEntity<Object>produces =
	 * MediaType.APPLICATION_JSON_VALUE(@RequestBody ProgrammingLanguage
	 * programmingLanguage){ return
	 * programmingLanguageService.addProgrammingLanguage(programmingLanguage); }
	 * 
	 * @DeleteMapping("/api/programminglanguages/delete/{id}") public
	 * ResponseEntity<Object> deleteProgrammingLanguage(@PathVariable Integer id){
	 * return programmingLanguageService.deleteProgLanguague(id); }
	 * 
	 */
	/*
	 * @PostMapping("/create") public void add(CreateProgrammingLanguageRequest
	 * createProgrammingLanguageRequest) {
	 * this.programmingLanguageService.add(createProgrammingLanguageRequest); }
	 */
	
	
	

}
