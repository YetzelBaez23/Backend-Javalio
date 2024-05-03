package org.generation.GradleDemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.generation.GradleDemo.Service.PostService;
import org.generation.GradleDemo.entity.Post;
import org.generation.GradleDemo.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post getPostById(Long id) {
        Optional<Post> postOptional = postRepository.findById(id);
        Post existingPost;
        if (postOptional.isPresent()) {
            existingPost = postOptional.get();
            return existingPost;
        } else {
            throw new IllegalStateException("Post does not exist with id " + id);
        }
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post, Long id) {
        Post existingPost = getPostById(id);
        existingPost.setDepartureDate(post.getDepartureDate());
        existingPost.setReturnDate(post.getReturnDate());
        existingPost.setPrice(post.getPrice());
        existingPost.setDepartureSite(post.getDepartureSite());
        existingPost.setSpots(post.getSpots());
        existingPost.setDescription(post.getDescription());
        return postRepository.save(existingPost);
    }

    @Override
    public void deletePost(Long id) {
        return;
    }

    @Override
    public List<Post> getAllPost() {
        return (List<Post>)  postRepository.findAll();
    }

	

   
}