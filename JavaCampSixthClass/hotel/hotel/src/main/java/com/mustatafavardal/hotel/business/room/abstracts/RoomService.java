package com.mustatafavardal.hotel.business.room.abstracts;

import java.util.List;

import com.mustatafavardal.hotel.business.room.requests.CreateRoomRequest;
import com.mustatafavardal.hotel.business.room.responses.GetAllRoomResponse;

public interface RoomService {
	
	List<GetAllRoomResponse> getAll();

	void add(CreateRoomRequest createRoomRequest);
}
