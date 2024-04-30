package com.nuevomundotravel.app.service;


import java.util.List;

import com.nuevomundotravel.app.entity.Role;


public interface RoleService {

	Role getRoleById(Long id);
	Role createRole(Role role);
	List<Role> getAllRoles(boolean active);
	void deleteRole(Long id);
}
