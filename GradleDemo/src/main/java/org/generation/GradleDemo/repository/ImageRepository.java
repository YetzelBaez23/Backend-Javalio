package org.generation.GradleDemo.repository;


import java.util.Optional;

import org.generation.GradleDemo.entity.Image;

import org.springframework.data.repository.CrudRepository;



public interface ImageRepository extends CrudRepository< Image, Long > {
	
	Optional<Image> findById(Long Id);
	
}
