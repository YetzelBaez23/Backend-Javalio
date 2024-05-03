package org.generation.GradleDemo.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.generation.GradleDemo.Service.ImageService;
import org.generation.GradleDemo.entity.Image;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/images")
public class ImageController {
	
	ImageService imageService;
	
	public ImageController(ImageService imageService) {
		this.imageService = imageService;
	}
	
	
	@GetMapping("{id}") // localhost:8080/api/v1/users/{id}
	ResponseEntity<Image> getRoleById(@PathVariable("id") Long id ){
		return new ResponseEntity<Image>(imageService.getImageById(id) ,HttpStatus.OK );
	}


}
