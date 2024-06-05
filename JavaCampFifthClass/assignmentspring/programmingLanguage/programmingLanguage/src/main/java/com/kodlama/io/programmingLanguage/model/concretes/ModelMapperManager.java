package com.kodlama.io.programmingLanguage.model.concretes;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.kodlama.io.programmingLanguage.model.abstracts.ModelService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelService{
	private ModelMapper modelMapper;

	public ModelMapper requests() {
		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelMapper;
	}

	public ModelMapper responses() {
		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.STANDARD);
		
		return this.modelMapper;
	}

}
