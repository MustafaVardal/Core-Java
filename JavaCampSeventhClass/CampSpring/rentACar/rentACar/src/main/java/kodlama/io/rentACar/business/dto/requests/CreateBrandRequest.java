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
public class CreateBrandRequest {
	@NotNull // if it is empty, return error.
	@NotBlank // There is no space. 
	@Size(min = 3, max = 20)
	private String name; // We want to show only this brand name; End user will give this data.
	
}
