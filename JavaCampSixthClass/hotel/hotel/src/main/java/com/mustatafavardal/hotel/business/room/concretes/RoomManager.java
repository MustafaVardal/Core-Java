package com.mustatafavardal.hotel.business.room.concretes;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mustatafavardal.hotel.business.room.abstracts.RoomService;
import com.mustatafavardal.hotel.business.room.requests.CreateRoomRequest;
import com.mustatafavardal.hotel.business.room.requests.UpdateRoomRequest;
import com.mustatafavardal.hotel.business.room.responses.GetAllRoomResponse;
import com.mustatafavardal.hotel.business.room.responses.GetByIdRoomResponse;
import com.mustatafavardal.hotel.core.utilities.model.ModelMapperService;
import com.mustatafavardal.hotel.dataAccess.RoomRepository;
import com.mustatafavardal.hotel.entities.Room;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoomManager implements RoomService {

	private RoomRepository roomRepository;

	private ModelMapperService modelMapperService;

	@Override
	public ResponseEntity<List<GetAllRoomResponse>> getAll() {
		List<Room> allRooms = roomRepository.findAll();
		List<GetAllRoomResponse> getAllRoomResponses = allRooms.stream()
				.map(selectedRoom -> this.modelMapperService.forResponses().map(selectedRoom, GetAllRoomResponse.class))
				.toList();
		return ResponseEntity.ok(getAllRoomResponses);
	}

	@Override
	public GetByIdRoomResponse getById(int id) {
		Room room = roomRepository.findById(id).orElseThrow();
		GetByIdRoomResponse getByIdRoomResponse = this.modelMapperService.forResponses().map(room, GetByIdRoomResponse.class);
		
		return getByIdRoomResponse;
	}

	@Override
	public void add(CreateRoomRequest createRoomRequest) {
		Room room = this.modelMapperService.forRequests().map(createRoomRequest, Room.class);
		this.roomRepository.save(room);
	}

	@Override
	public void update(UpdateRoomRequest updateRoomRequest) {
		Room room = this.modelMapperService.forRequests().map(updateRoomRequest, Room.class);
		this.roomRepository.save(room);

	}

	@Override
	public void deleteById(int id) {
		this.roomRepository.deleteById(id);

	}

}
