package com.mustatafavardal.hotel.webapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mustatafavardal.hotel.business.room.abstracts.RoomService;
import com.mustatafavardal.hotel.business.room.requests.CreateRoomRequest;
import com.mustatafavardal.hotel.business.room.responses.GetAllRoomResponse;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/rooms")
@AllArgsConstructor
public class RoomController {

	
	private RoomService roomService;
	
	
	@GetMapping()
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public List<GetAllRoomResponse> getAll() {
		return this.roomService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody @Valid CreateRoomRequest createRoomRequest) {
		this.roomService.add(createRoomRequest);
	}

}