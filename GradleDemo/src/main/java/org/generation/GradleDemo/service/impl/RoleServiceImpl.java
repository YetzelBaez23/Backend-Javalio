package org.generation.GradleDemo.service.impl;

import java.util.Optional;

import org.generation.GradleDemo.Service.RoleService;
import org.generation.GradleDemo.entity.Role;
import org.generation.GradleDemo.repository.RoleRepository;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {

	
	RoleRepository roleRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	
	@Override
	public  Role getRoleById(Long id) {		
		Optional<Role> userOptional = roleRepository.findById(id);
		Role existingRole;
		
		if( userOptional.isPresent() ) {
			existingRole = userOptional.get();
			return existingRole;
		} else {
			throw new IllegalStateException("Role does not exist with id " + id);
		}			
	}


	
		

	
}
