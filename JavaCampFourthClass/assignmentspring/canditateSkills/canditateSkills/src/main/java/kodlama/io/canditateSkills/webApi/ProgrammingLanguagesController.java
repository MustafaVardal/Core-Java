package kodlama.io.canditateSkills.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import kodlama.io.canditateSkills.business.abstracts.ProgrammingLanguageService;
import kodlama.io.canditateSkills.entities.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception{
		programmingLanguageService.add(programmingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(int id) {
		programmingLanguageService.delete(id);
	}
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.update(programmingLanguage);
	}
	@GetMapping("/getonebyid")
	public ProgrammingLanguage getOneById(int id){
		return programmingLanguageService.getOneById(id);
	}
	
	
}
