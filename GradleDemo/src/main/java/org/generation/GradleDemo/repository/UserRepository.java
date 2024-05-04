package org.generation.GradleDemo.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.generation.GradleDemo.entity.User;



public interface UserRepository extends CrudRepository< User , Long > {
	
	Optional<User> findByEmail(String email); // SELECT * FROM users WHERE email = ?1
	Iterable<User> findAllByActiveTrue(); // SELECT * FROM users WHERE active = 1;
	Iterable<User> findAllByActiveFalse(); // SELECT * FROM users WHERE active = 0;
	// Iterable<User> findAllByActive(boolean state); // SELECT * FROM users WHERE active = ?1;
	boolean existsByEmail(String email);

}
