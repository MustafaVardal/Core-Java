package com.mustatafavardal.hotel.business.room.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoomRequest {
	
	private String roomNumber;
	
	private String entryTime;
	
	private String exitTime;
}
