package com.temu.app.service.impl;

import org.springframework.stereotype.Service;

import com.temu.app.entity.Image;
import com.temu.app.repository.ImageRepository;
import com.temu.app.service.ImageService;
@Service
public class ImageServiceImpl implements ImageService {
	
	
    ImageRepository imageRepository;
	
	public ImageServiceImpl(ImageRepository imageRepository) {
		this.imageRepository = imageRepository;
	}
	public Image createImage(Image image) {
		image.setId(null);
        return imageRepository.save(image);
    }

}
