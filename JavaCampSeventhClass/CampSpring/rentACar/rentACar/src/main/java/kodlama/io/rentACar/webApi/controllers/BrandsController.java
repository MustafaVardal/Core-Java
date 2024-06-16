package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.dto.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dto.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

	private BrandService brandService;

	@GetMapping()
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public GetByIdBrandResponse getById(@PathVariable() int id) {
		return brandService.getById(id);
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid CreateBrandRequest createBrandRequest) { // @Valid means jakarta validation codes will run . if you add it. 
		this.brandService.add(createBrandRequest);
	}
	
	@PutMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}
	
	

}
