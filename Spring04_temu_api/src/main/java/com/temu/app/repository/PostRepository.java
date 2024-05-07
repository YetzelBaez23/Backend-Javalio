package com.temu.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.temu.app.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
	
	Optional<Post> findById(Long id);
	Iterable<Post> findAll();
	Iterable<Post> findAllByActiveTrue();
	Iterable<Post> findAllByActiveFalse();
	
}
