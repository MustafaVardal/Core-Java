package com.kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import com.kodlama.io.programmingLanguage.business.requests.CreateTechnologyRequest;
import com.kodlama.io.programmingLanguage.business.requests.UpdateTechnologyRequest;
import com.kodlama.io.programmingLanguage.business.responses.GetAllTechnologiesResponse;
import com.kodlama.io.programmingLanguage.business.responses.GetByIdTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	GetByIdTechnologyResponse getById(int id);

	void create(CreateTechnologyRequest createTechnologyRequest);

	void update(int id, UpdateTechnologyRequest updateTechnologyRequest);

	void delete(int id);

}
