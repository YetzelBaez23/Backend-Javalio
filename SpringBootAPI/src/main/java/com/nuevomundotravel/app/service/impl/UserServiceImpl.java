package com.nuevomundotravel.app.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nuevomundotravel.app.entity.User;
import com.nuevomundotravel.app.repository.UserRepository;
import com.nuevomundotravel.app.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	
	// comunicar service con la capa de en medio
	
   UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User getUserById(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		User existingUser;
		
		if(userOptional.isPresent()) {
			existingUser= userOptional.get();
			return existingUser;
		}
		else {
			throw new IllegalStateException("User does not exist with id " + id);
		}
		
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {	
		user.setActive(true);
		user.setId(null);
		// TODO encriptar password
		
		if( userRepository.existsByEmail(user.getEmail()) ) {
			throw new IllegalStateException("User exist with email " + user.getEmail());
		}
					
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllActiveUsers() {
		
		return (List<User>) userRepository.findAllByActiveTrue();
	
	}

	@Override
	public List<User> getAllInactiveUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAllByActiveFalse();
	}

	@Override
	public User updateUser(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUsers(boolean isActive) {
		if(isActive) return getAllActiveUsers();
		else return getAllInactiveUsers();
	}

}
