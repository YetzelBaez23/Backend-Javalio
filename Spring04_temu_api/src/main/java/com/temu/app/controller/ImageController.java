package com.temu.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temu.app.entity.Image;
import com.temu.app.service.ImageService;

@RestController
@RequestMapping("api/v1/images")
public class ImageController {
	
	ImageService imageService;
	
	public ImageController(ImageService imageService) {
		this.imageService=imageService;
	}
	
	@PostMapping
	public ResponseEntity<Image> createImage(@RequestBody Image image) {
		return new ResponseEntity<Image> (imageService.createImage(image),HttpStatus.CREATED);
	}
	

}
