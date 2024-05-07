package com.temu.app.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.temu.app.entity.Destination;
import com.temu.app.entity.Image;
import com.temu.app.entity.Post;
import com.temu.app.repository.PostRepository;
import com.temu.app.service.DestinationService;
import com.temu.app.service.ImageService;
import com.temu.app.service.PostService;
@Service
public class PostServiceImpl implements PostService{
	
	PostRepository postRepository;
	ImageService imageService;
	DestinationService destinationService;
	public PostServiceImpl(PostRepository postRepository,ImageService imageService,DestinationService destinationService) {
		this.postRepository = postRepository;
		this.imageService=imageService;
		this.destinationService=destinationService;
	}
	
	@Override
	public Post createPost(Post post) {
	    // Crear la imagen asociada al post
		Destination destination = createDestForPost(post);
	    Image image = createImageForPost(post);
	    // Crear un destino asociado al post
	    // Asignar la imagen al post
	    post.setImage(image);
	    post.setDestination(destination);
	    
	    // Guardar el post en la base de datos
	    return postRepository.save(post);
	}

	private Image createImageForPost(Post post) {
	    // Extraer la imagen del post
	    Image image = post.getImage();
	    
	    // Crear la imagen utilizando el servicio de imagen
	    return imageService.createImage(image);
	}
	
	private Destination createDestForPost(Post post) {
	    // Extraer el destino del post
	    Destination destination = post.getDestination();
	    
	    // Crear el destino utilizando el servicio de destino
	    return destinationService.createDestination(destination);
	}

	@Override
	public List<Post> getAllPosts(boolean isActive) {
		
		return (List<Post>) postRepository.findAll();
	}

	@Override
	public Post getPostById(Long id) {
		Optional<Post> postOptional = postRepository.findById(id);
		Post existingPost;
		if(postOptional.isPresent()) {
			existingPost = postOptional.get();
			return existingPost;
		}else {
			throw new IllegalStateException("El post no existe con id: " + id);
		}
	}

	@Override
	public List<Post> getAllActivePosts() {
		return (List<Post>) postRepository.findAllByActiveTrue();
	}

	@Override
	public List<Post> getAllInactivePosts() {
		return (List<Post>) postRepository.findAllByActiveFalse();
	}

	


	
}
