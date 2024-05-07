package com.temu.app.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.temu.app.entity.Destination;
import com.temu.app.service.DestinationService;
@RestController
@RequestMapping("api/v1/destination")
public class destinationController {
	
	DestinationService destinationService;
	
	public destinationController(DestinationService destinationService) {
		this.destinationService = destinationService;
	}
	
	
	
	
	@PostMapping
	ResponseEntity<Destination> createdestination(@RequestBody Destination destination){
		Destination createdDestination = destinationService.createDestination(destination);
		return new ResponseEntity<Destination>(createdDestination, HttpStatus.CREATED);
	}
	
	
	
}
