package com.kodlama.io.programmingLanguage.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;
import com.kodlama.io.programmingLanguage.business.requests.UpdateProgrammingLanguageRequest;
import com.kodlama.io.programmingLanguage.business.responses.GetAllProgrammingLanguageResponse;
import com.kodlama.io.programmingLanguage.business.responses.GetByIdProgrammingLanguageResponse;
import com.kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.kodlama.io.programmingLanguage.entities.ProgrammingLanguage;
import com.kodlama.io.programmingLanguage.model.abstracts.ModelService;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	@Autowired
	private ProgrammingLanguageRepository programmingLanguageRepository;
	@Autowired
	private ModelService modelService;

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguageResponse = programmingLanguages.stream()
				.map(programmingLanguage -> this.modelService.responses().map(programmingLanguage,
						GetAllProgrammingLanguageResponse.class))
				.toList();
		return programmingLanguageResponse;

	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).orElseThrow();
		GetByIdProgrammingLanguageResponse getByIdProgrammingLanguageResponse = this.modelService.responses()
				.map(programmingLanguage, GetByIdProgrammingLanguageResponse.class);

		return getByIdProgrammingLanguageResponse;
	}

	@Override
	public void create(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = this.modelService.requests().map(createProgrammingLanguageRequest,
				ProgrammingLanguage.class);
		this.programmingLanguageRepository.save(programmingLanguage);

	}

	@Override
	public void update(int id, UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).orElseThrow();
		this.modelService.requests().map(updateProgrammingLanguageRequest, programmingLanguage);
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).orElseThrow();
		this.programmingLanguageRepository.delete(programmingLanguage);

	}

}
