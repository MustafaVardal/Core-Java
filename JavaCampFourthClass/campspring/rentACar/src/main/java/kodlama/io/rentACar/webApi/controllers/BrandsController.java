package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // Annotation Yani bilgilendirme ifadesi yaniii Programin erisim noktasi
				// oldugunu soyluyoruz.
@RequestMapping("/api/brands") // Kontrol merkeziyle kullanilan yontem. tarayicidaki adresslemede /api/brands
								// yazdigimizda alicagimiz yer.
public class BrandsController {
	// Controller inis departmanina bilgi verme amaciyla kullanilan yerdir. !!
	// Restfull appler icin kontrol amaciyla kurulur.

	private IBrandService brandService; // Dependency injection...
	@Autowired // Git ve parametrelerine bak. Ve newlenmis halini bana ver.
	public BrandsController(IBrandService brandService) {

		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<Brand> getAll() {
		// BrandManager brandManager = new BrandManager(new InMemoryBrandRepository());
		// IoC denilen yapi bu polimorfik yapi springteki default geliyor.. 
		// IoC Inversion of Control (Kutu denilir) 
		// Git bellekte birseyi newle
		// Ornegin BrandRepository veya BrandManager
		
		
		return brandService.getAll();
	}

	// RequestMapping ve GetMapping -- > www.kodlamaio/api/brands/getAll --> dedigin
	// anda getAll operasyonu calisir. Buradan brand manager a gidicek ve is
	// kurallari calisicak.
	// Daha sonra InMemoryRepository ye gidicek ve butun markalari cagiricak.
	
	// Yeni version spring the @autowired yazmadan da calisir.

}
