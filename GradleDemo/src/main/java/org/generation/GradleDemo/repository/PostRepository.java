package org.generation.GradleDemo.repository;



import org.generation.GradleDemo.entity.Post;
import org.springframework.data.repository.CrudRepository;



public interface PostRepository extends CrudRepository< Post , Long > {
	
	Iterable<Post> findAll();

}
