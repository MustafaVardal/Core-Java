package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.dto.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dto.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	
	private ModelMapperService mapperService;
	
	private BrandBusinessRules brandBusinessRules;
	@Override
	public List<GetAllBrandsResponse> getAll() {

		List<Brand> brands = brandRepository.findAll();
		
		List<GetAllBrandsResponse> responses = brands.stream()
				.map(brand -> this.mapperService.forResponse()
				.map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList()); 
		
		return responses;
		
		// Primitive version of check the brand responseItem with each brand attribute
		/*
		 * List<GetAllBrandsResponse> getAllBrandsResponses = new ArrayList<GetAllBrandsResponse>(); 
		 * for (Brand brand : brands) {
		 * 
		 * GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
		 * responseItem.setId(brand.getId()); 
		 * responseItem.setName(brand.getName());
		 * getAllBrandsResponses.add(responseItem); }
		 * 
		 * return getAllBrandsResponses
		 */

	}
	
	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandResponse getByIdBrandResponse = this.mapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		
		return getByIdBrandResponse;
	}
	

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
		
		Brand brand = this.mapperService.forRequest().map(createBrandRequest, Brand.class);
		
		this.brandRepository.save(brand);
		
		/* 
		 *
		 * Brand brand = new Brand(); brand.setName(createBrandRequest.getName());
		 * 
		 * this.brandRepository.save(brand);
		 */

		// if we put createBrandRequest Database object will be angry, because in
		// JpaRepository<Entity Object!, Data type of this entity object's id>

		// So we will create new object which is Brand();
		// then we will match this brand object with createBrandRequest object getName
		// operation.
		// this.brandRepository.save(createBrandRequest);
		
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand= this.mapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}

	

}
