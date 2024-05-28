package kodlama.io.canditateSkills.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.canditateSkills.business.abstracts.ProgrammingLanguageService;
import kodlama.io.canditateSkills.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.canditateSkills.entities.ProgrammingLanguage;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {

		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	

	@Override
	public List<ProgrammingLanguage> getAll() {
	
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
	
		
		if(findElement(programmingLanguage.getName())) {
			throw new Exception("Name is already exist.");
		}
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Name should not be empty.");
		}
		
		programmingLanguageRepository.add(programmingLanguage);

	}
	
	// Flag will be here!. Check all element with the different function because should be readable.
	public boolean findElement(String name) {
		for (ProgrammingLanguage element : programmingLanguageRepository.getAll()) {
			if (name.equals(element.getName())) {
				System.out.println("Error: This element(" + element.getName() + ") already existed.");
				return true;
			}
		}
		return false;

	}
	
	@Override
	public void delete(int id) {
		
		programmingLanguageRepository.delete(id);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception{
		
		if(findElement(programmingLanguage.getName())) {
			throw new Exception("Name is already exist.");
		}
		
		programmingLanguageRepository.update(programmingLanguage);

	}

	@Override
	public ProgrammingLanguage getOneById(int id){
		
		return programmingLanguageRepository.getOneById(id);
	}

}
