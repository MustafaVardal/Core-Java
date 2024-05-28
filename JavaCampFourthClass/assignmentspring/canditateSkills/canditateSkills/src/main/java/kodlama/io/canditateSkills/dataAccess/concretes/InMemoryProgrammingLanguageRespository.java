package kodlama.io.canditateSkills.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.canditateSkills.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.canditateSkills.entities.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRespository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRespository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(0, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		programmingLanguages.remove(id);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.set(programmingLanguage.getId(), programmingLanguage);
	}

	@Override
	public ProgrammingLanguage getOneById(int id) {
		for (ProgrammingLanguage language : programmingLanguages) {
			if (language.getId() == id && language.getId() >=0) {
				return language;
			}
		}
		return null;

	}
}
