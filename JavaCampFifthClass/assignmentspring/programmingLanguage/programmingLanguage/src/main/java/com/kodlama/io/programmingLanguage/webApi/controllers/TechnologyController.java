package com.kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.programmingLanguage.business.abstracts.TechnologyService;
import com.kodlama.io.programmingLanguage.business.requests.CreateTechnologyRequest;
import com.kodlama.io.programmingLanguage.business.requests.UpdateTechnologyRequest;
import com.kodlama.io.programmingLanguage.business.responses.GetAllTechnologiesResponse;
import com.kodlama.io.programmingLanguage.business.responses.GetByIdTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")

public class TechnologyController {
	@Autowired
	private TechnologyService technologyService;
	JSONObject result = new JSONObject();

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GetAllTechnologiesResponse> getAll() {
		return this.technologyService.getAll();
	}

	@GetMapping(path = ("/{id}"), produces = MediaType.APPLICATION_JSON_VALUE)
	public GetByIdTechnologyResponse getById(@PathVariable int id) {
		return this.technologyService.getById(id);
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String add(@RequestBody CreateTechnologyRequest createTechnologyRequest) {
		result.put("Message", createTechnologyRequest.getName() + " is added to language id : "
				+ createTechnologyRequest.getProgrammingLanguageId());
		this.technologyService.create(createTechnologyRequest);
		return result.toString();
	}
	
	@PutMapping(path = ("/{id}"), produces =  MediaType.APPLICATION_JSON_VALUE)
	public String update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
		result.put("Message", "Technology is updated: " + id);
		this.technologyService.update(id, updateTechnologyRequest);
		return result.toString();
	}
	
	public String delete(@PathVariable int id) {
		result.put("Message", "Technology is deleted: " + id);
		this.technologyService.delete(id);
		return result.toString();
	}


}
