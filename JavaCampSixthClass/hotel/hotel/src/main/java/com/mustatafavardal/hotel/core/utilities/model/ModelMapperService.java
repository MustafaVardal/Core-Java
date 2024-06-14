package com.mustatafavardal.hotel.core.utilities.model;

import org.modelmapper.ModelMapper;

public interface ModelMapperService{
	ModelMapper forRequests();
	ModelMapper forResponses();
}
