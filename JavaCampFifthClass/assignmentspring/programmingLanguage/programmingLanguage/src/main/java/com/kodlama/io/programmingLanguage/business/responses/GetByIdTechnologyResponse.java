package com.kodlama.io.programmingLanguage.business.responses;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdTechnologyResponse {
	@NonNull
	private int id;
	private String name;
	private int programmingLanguageId;
	private String programmingLanguageName;
}
