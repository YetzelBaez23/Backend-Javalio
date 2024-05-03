package org.generation.GradleDemo.repository;


import org.generation.GradleDemo.entity.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository< User , Long > {
	
	Iterable<User> findByEmail(String email); // SElect * from User where email = ?
	Iterable<User> findAllByActiveTrue(); // SELECT * FROM users WHERE active = 1;
	Iterable<User> findAllByActiveFalse(); // SELECT * FROM users WHERE active = 0;
	// Iterable<User> findAllByActive(boolean state); // SELECT * FROM users WHERE active = ?1;
	boolean existsByEmail(String email);

}
