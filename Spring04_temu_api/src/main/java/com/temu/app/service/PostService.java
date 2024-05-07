package com.temu.app.service;

import java.util.List;

import com.temu.app.entity.Post;


public interface PostService {
	
	Post createPost(Post post);
	Post getPostById(Long id);
	
	List<Post> getAllPosts(boolean isActive);
	List<Post> getAllActivePosts();
	List<Post> getAllInactivePosts();

}
