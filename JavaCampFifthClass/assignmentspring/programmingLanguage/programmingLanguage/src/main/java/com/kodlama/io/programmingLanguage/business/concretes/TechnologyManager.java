package com.kodlama.io.programmingLanguage.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.programmingLanguage.business.abstracts.TechnologyService;
import com.kodlama.io.programmingLanguage.business.requests.CreateTechnologyRequest;
import com.kodlama.io.programmingLanguage.business.requests.UpdateTechnologyRequest;
import com.kodlama.io.programmingLanguage.business.responses.GetAllTechnologiesResponse;
import com.kodlama.io.programmingLanguage.business.responses.GetByIdTechnologyResponse;
import com.kodlama.io.programmingLanguage.dataAccess.abstracts.TechnologyRepository;
import com.kodlama.io.programmingLanguage.entities.Technology;
import com.kodlama.io.programmingLanguage.model.abstracts.ModelService;

@Service
public class TechnologyManager implements TechnologyService {
	@Autowired
	private TechnologyRepository technologyRepository;
	@Autowired
	private ModelService modelService;

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> allTechnologiesResponses = technologies.stream()
				.map(technology -> this.modelService.responses().map(technology, GetAllTechnologiesResponse.class))
				.toList();
		return allTechnologiesResponses;
	}

	@Override
	public GetByIdTechnologyResponse getById(int id) {
		Technology technology = technologyRepository.findById(id).orElseThrow();
		GetByIdTechnologyResponse getByIdTechnologyResponse = this.modelService.responses().map(technology, GetByIdTechnologyResponse.class);
		return getByIdTechnologyResponse;
	}

	@Override
	public void create(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = this.modelService.requests().map(createTechnologyRequest, Technology.class);
		this.technologyRepository.save(technology);

	}

	@Override
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = technologyRepository.findById(id).orElseThrow();
		this.modelService.requests().map(updateTechnologyRequest, technology);
		this.technologyRepository.save(technology);

	}

	@Override
	public void delete(int id) {
		Technology technology = technologyRepository.findById(id).orElseThrow();
		this.technologyRepository.delete(technology);

	}

}
