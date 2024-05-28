package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface IBrandService { // Business rules pattern here.
	List<Brand> getAll();
}
