package com.nuevomundotravel.app.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.User;


public interface UserRepository extends CrudRepository <User, Long> {
	List<User> findByFullName (String fullName);  
	User findById (long Id );
}

