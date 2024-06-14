package com.mustatafavardal.hotel.business.room.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mustatafavardal.hotel.business.room.requests.CreateRoomRequest;
import com.mustatafavardal.hotel.business.room.requests.UpdateRoomRequest;
import com.mustatafavardal.hotel.business.room.responses.GetAllRoomResponse;
import com.mustatafavardal.hotel.business.room.responses.GetByIdRoomResponse;

public interface RoomService {
	ResponseEntity<List<GetAllRoomResponse>> getAll();

	GetByIdRoomResponse getById(int id);

	void add(CreateRoomRequest createRoomRequest);

	void update(UpdateRoomRequest updateRoomRequest);

	void deleteById(int id);
}
