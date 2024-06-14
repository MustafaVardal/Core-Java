package com.mustatafavardal.hotel.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustatafavardal.hotel.entities.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{
	
}
