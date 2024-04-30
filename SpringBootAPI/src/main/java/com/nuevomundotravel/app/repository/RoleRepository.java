package com.nuevomundotravel.app.repository;


import org.springframework.data.repository.CrudRepository;

import com.nuevomundotravel.app.entity.Role;


public interface RoleRepository extends CrudRepository<Role, Long> { 
	Role findById (long Id );	
}

