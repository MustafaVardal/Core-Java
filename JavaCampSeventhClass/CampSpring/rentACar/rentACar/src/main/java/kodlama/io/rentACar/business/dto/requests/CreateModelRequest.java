package kodlama.io.rentACar.business.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateModelRequest {
	
	
	@NotNull // if it is empty, return error.
	@NotBlank // There is no space. 
	@Size(min = 3, max = 20)
	private String name;
	@NotNull // if it is empty, return error.
	@NotBlank // There is no space. 
	private int brandId;
}
