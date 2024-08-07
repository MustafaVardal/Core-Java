package com.kodlama.io.programmingLanguage.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodlama.io.programmingLanguage.entities.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
