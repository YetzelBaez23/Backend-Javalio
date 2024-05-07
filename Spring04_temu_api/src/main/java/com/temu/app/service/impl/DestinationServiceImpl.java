package com.temu.app.service.impl;

import org.springframework.stereotype.Service;

import com.temu.app.entity.Destination;
import com.temu.app.repository.DestinationRepository;
import com.temu.app.service.DestinationService;

@Service
public class DestinationServiceImpl implements DestinationService{

	DestinationRepository destinationRepository;
	public DestinationServiceImpl(DestinationRepository destinationRepository) {
		this.destinationRepository = destinationRepository;
	}
	@Override
	public Destination createDestination(Destination destination) {
		destination.setId(null);
		return destinationRepository.save(destination);
	}
	
	
}
