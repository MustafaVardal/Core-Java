	package com.mustatafavardal.hotel.webapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mustatafavardal.hotel.business.room.abstracts.RoomService;
import com.mustatafavardal.hotel.business.room.requests.CreateRoomRequest;
import com.mustatafavardal.hotel.business.room.requests.UpdateRoomRequest;
import com.mustatafavardal.hotel.business.room.responses.GetAllRoomResponse;
import com.mustatafavardal.hotel.business.room.responses.GetByIdRoomResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/rooms")
@AllArgsConstructor
public class RoomController {
	
	
	private RoomService roomService;
	
	@GetMapping()
	public ResponseEntity<List<GetAllRoomResponse>> getAll(){
		ResponseEntity<List<GetAllRoomResponse>> responseEntity= roomService.getAll();
		return responseEntity;
		
	}
	@GetMapping(path = "/{id}")
	public GetByIdRoomResponse getById(@PathVariable int id) {
		GetByIdRoomResponse getByIdRoomResponse = roomService.getById(id);
		return getByIdRoomResponse;
	}
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() CreateRoomRequest createRoomRequest) {
		this.roomService.add(createRoomRequest);
	}
	@PutMapping()
	public void update(@RequestBody() UpdateRoomRequest updateRoomRequest) {
		this.roomService.update(updateRoomRequest);
	}
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable int id) {
		this.roomService.deleteById(id);
	}
	
	
	
	
}
