package com.nuevomundotravel.app.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.Role;


public interface RoleRepository extends CrudRepository <Role, Long> {
	List<Role> findByFullName (String fullName);  
	Role findById (long Id );	
}

