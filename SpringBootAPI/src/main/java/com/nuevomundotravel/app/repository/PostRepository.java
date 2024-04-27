package com.nuevomundotravel.app.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.Post;


public interface PostRepository extends CrudRepository <Post, Long> {
	List<Post> findByFullName (String fullName);  
	Post findById (long Id );	
}

