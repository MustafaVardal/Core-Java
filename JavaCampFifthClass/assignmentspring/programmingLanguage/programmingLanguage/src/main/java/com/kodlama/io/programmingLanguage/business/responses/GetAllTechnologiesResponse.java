package com.kodlama.io.programmingLanguage.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologiesResponse {
	private int id;
	private String name;
	private int programmingLanguageId;
	private String programmingLanguageName;
}
