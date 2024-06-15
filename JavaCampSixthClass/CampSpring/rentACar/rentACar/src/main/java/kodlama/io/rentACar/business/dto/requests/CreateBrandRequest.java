package kodlama.io.rentACar.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {

	private String name; // We want to show only this brand name; End user will give this data.
	
}
