package org.generation.GradleDemo.Service;



import java.util.List;

import org.generation.GradleDemo.entity.Post;


public interface PostService {
	
	Post getPostById(Long id);
	Post createPost(Post Post);
	Post updatePost(Post Post, Long id);
	List<Post> getAllPost();
	void deletePost(Long id);
	

}