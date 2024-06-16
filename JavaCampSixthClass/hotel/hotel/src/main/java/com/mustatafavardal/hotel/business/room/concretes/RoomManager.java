package com.mustatafavardal.hotel.business.room.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mustatafavardal.hotel.business.room.abstracts.RoomService;
import com.mustatafavardal.hotel.business.room.requests.CreateRoomRequest;
import com.mustatafavardal.hotel.business.room.responses.GetAllRoomResponse;
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
	public List<GetAllRoomResponse> getAll() {
		List<Room> rooms = roomRepository.findAll();
		List<GetAllRoomResponse> getAllRoomResponses = rooms.stream()
				.map(room -> this.modelMapperService.forResponses().map(room, GetAllRoomResponse.class))
				.toList();
		return getAllRoomResponses;
	}

	@Override
	public void add(CreateRoomRequest createRoomRequest) {
		Room room = this.modelMapperService.forRequests().map(createRoomRequest, Room.class);
		this.roomRepository.save(room);
	}

}
