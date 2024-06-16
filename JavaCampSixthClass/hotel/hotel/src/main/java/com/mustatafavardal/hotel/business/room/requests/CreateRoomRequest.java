package com.mustatafavardal.hotel.business.room.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoomRequest {
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 200)
	private String roomNumber;
	
	private String entryTime;
	
	private String exitTime;
	@NotNull
	private int customerId;
}
