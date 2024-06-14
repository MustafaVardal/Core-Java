package com.mustatafavardal.hotel.business.room.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllRoomResponse {
	private int id;

	private String roomNumber;

	private String entryTime;

	private String exitTime;
}
