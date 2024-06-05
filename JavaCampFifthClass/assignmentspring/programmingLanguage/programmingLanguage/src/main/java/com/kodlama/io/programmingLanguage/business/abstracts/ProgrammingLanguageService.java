package com.kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import com.kodlama.io.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;
import com.kodlama.io.programmingLanguage.business.requests.UpdateProgrammingLanguageRequest;
import com.kodlama.io.programmingLanguage.business.responses.GetAllProgrammingLanguageResponse;
import com.kodlama.io.programmingLanguage.business.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();

	GetByIdProgrammingLanguageResponse getById(int id);

	void create(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

	void update(int id, UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

	void delete(int id);
}
