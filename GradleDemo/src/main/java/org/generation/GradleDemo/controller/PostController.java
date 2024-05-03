package org.generation.GradleDemo.controller;



import java.util.List;

import org.generation.GradleDemo.Service.PostService;
import org.generation.GradleDemo.entity.Post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/posts")
public class PostController {
	
	PostService postService;
	
	public PostController(PostService PostService) {
		this.postService = PostService;
	}

	@GetMapping 
	 ResponseEntity< List<Post> > getAllPosts(){
		return new ResponseEntity<List<Post>>(postService.getAllPost( ), HttpStatus.OK);
	}

	
	
	@GetMapping("{id}") // localhost:8080/api/v1/Posts/{id}
	ResponseEntity<Post> getPostById(@PathVariable("id") Long id ){
		return new ResponseEntity<Post>(postService.getPostById(id) ,HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<Post> createPost(@RequestBody Post Post ){
		Post createdPost = postService.createPost(Post);
		
		return new ResponseEntity<Post>( createdPost, HttpStatus.CREATED );		
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deletePost(@PathVariable("id") Long id ){
		postService.deletePost(id);
		return new ResponseEntity<String>("Post id " + id + " successfully deleted", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Post> updatePost(
			@RequestBody Post Post, 
			@PathVariable("id") Long id  
			){
		Post updatedPost = postService.updatePost(Post, id);
		
		return new ResponseEntity<Post>( updatedPost, HttpStatus.OK );		
	}
	

}

