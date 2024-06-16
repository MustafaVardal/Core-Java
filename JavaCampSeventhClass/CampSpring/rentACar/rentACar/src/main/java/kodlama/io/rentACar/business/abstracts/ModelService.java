package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.dto.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dto.responses.GetAllModelsResponse;

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
}
