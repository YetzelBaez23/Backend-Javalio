package com.nuevomundotravel.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nuevomundotravel.app.entity.Destination;


public interface DestinationRepository extends CrudRepository <Destination, Long> {
	List<Destination> findByFullName (String fullName);  
	Destination findById (long Id );
	
}
