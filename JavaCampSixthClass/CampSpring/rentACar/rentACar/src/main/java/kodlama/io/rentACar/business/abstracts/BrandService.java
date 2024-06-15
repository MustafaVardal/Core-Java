package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.dto.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dto.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll(); // Responses // We need to return the what we want to show on the screen. We do
											// not want to show everything for now.
	GetByIdBrandResponse getById(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	void delete(int id);
	
}
