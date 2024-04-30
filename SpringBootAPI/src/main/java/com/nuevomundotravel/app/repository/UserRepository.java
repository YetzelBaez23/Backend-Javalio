package com.nuevomundotravel.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.User;


public interface UserRepository extends CrudRepository <User, Long> {
	Optional<User> findById (Long id); 
	List<User> findByFullName (String fullName);  
	List<User> findByEmail (String email);  
	List<User> findByTelephone (String telephone);  
	List<User> findAllByActiveFalse();
	List<User> findAllByActiveTrue();
	boolean existsByEmail(String email);
	
}

