package org.generation.GradleDemo.service.impl;

import java.util.Optional;

import org.generation.GradleDemo.Service.ImageService;
import org.generation.GradleDemo.entity.Image;

import org.generation.GradleDemo.repository.ImageRepository;
import org.springframework.stereotype.Service;


@Service
public class ImageServiceImpl implements ImageService {

	
	ImageRepository imageRepository;
	
	public ImageServiceImpl(ImageRepository imageRepository) {
		this.imageRepository = imageRepository;
	}
	

	@Override
	public Image getImageById(Long id) {
		Optional<Image> userOptional = imageRepository.findById(id);
		Image existingRole;
		
		if( userOptional.isPresent() ) {
			existingRole = userOptional.get();
			return existingRole;
		} else {
			throw new IllegalStateException("Image does not exist with id " + id);
		}	
	}
	
	@Override
	public Image createImage(Image image) {	
		return imageRepository.save(image);
	}
		

	
}
