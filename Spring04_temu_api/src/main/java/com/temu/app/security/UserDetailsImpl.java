
/*
package com.temu.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.temu.app.entity.User;
import com.temu.app.service.UserService;


// STEP 4 Leer el usuario de la DB
public class UserDetailsImpl implements UserDetailsService{
	
	private UserService userservice;
	
	public UserDetailsImpl(UserService userservice) {
		this.userservice =userservice;
	}
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User existingUser = userservice.getUserByEmail(email);
		
		
		return new UserDetailsImp(existingUser);
	}

}

*/
