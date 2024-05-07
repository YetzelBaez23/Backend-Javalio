package com.temu.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.temu.app.entity.Post;
import com.temu.app.service.PostService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/posts")
public class PostController {
	
	PostService postService;
	public PostController(PostService postService) {
		this.postService=postService;
	}
	
	@GetMapping
	ResponseEntity<List<Post>> getAllPosts(@RequestParam(name="active",
			required= false,
			defaultValue="true") boolean active){
		return new ResponseEntity<List<Post>> (postService.getAllPosts(active), HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Post> createcustomer(@RequestBody Post post){
		Post createdPost = postService.createPost(post);
		return new ResponseEntity<Post>(createdPost, HttpStatus.CREATED);
	}

}
