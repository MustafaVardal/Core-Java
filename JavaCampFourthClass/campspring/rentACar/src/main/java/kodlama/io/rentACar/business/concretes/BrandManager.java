package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // IoC ye eklemesi icin yani kutuya eklemesi icin. Servis oldugunu Belirtiyoruz.
			// bunu otomatik olarak newlenicek. Bu sinifin business nesnesi oldugunu
			// anlatiyoruz spring e.
public class BrandManager implements IBrandService { // Business rule here.

	private IBrandRepository brandRepository;

	@Autowired // newlenmis halini bana ver.
	public BrandManager(IBrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {

		return brandRepository.getAll();
	}

}
