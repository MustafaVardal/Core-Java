package kodlama.io.canditateSkills.business.abstracts;

import java.util.List;

import kodlama.io.canditateSkills.entities.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage) throws Exception;

	void delete(int id);

	void update(ProgrammingLanguage programmingLanguage)throws Exception;

	ProgrammingLanguage getOneById(int id);


}
