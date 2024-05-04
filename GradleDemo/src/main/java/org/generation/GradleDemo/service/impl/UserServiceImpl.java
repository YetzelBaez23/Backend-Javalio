package org.generation.GradleDemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.generation.GradleDemo.Service.UserService;
import org.generation.GradleDemo.entity.Role;
import org.generation.GradleDemo.entity.User;
import org.generation.GradleDemo.repository.UserRepository;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User getUserById(Long id) {		
		Optional<User> userOptional = userRepository.findById(id);
		User existingUser;
		
		if( userOptional.isPresent() ) {
			existingUser = userOptional.get();
			return existingUser;
		} else {
			throw new IllegalStateException("User does not exist with id " + id);
		}			
	}

	@Override
	public User getUserByEmail(String email) {
		Optional<User> userOptional = userRepository.findByEmail(email);
		User existingUser;
		
		if( userOptional.isPresent() ) {
			existingUser = userOptional.get();
			return existingUser;
		} else {
			throw new IllegalStateException("User does not exist with email " + email);
		}	
	}

	@Override
	public User createVisitor(User user) {	
		user.setActive(false);
		user.setId(null);
		user.setRole( new Role(1) );
		user.setPassword( user.getPassword() );
		
		if( userRepository.existsByEmail(user.getEmail()) ) {
			throw new IllegalStateException("User exist with email " + user.getEmail());
		}
					
		return userRepository.save(user);
	}
	
	@Override
	public User createCustomer(User user) {	
		user.setActive(true);
		user.setId(null);
		user.setRole( new Role(1) );
		//user.setPassword(user.getPassword() );
		
		if( userRepository.existsByEmail(user.getEmail()) ) {
			throw new IllegalStateException("User exist with email " + user.getEmail());
		}
					
		return userRepository.save(user);
	}
	
	@Override
	public User createAdmin(User user) {	
		user.setActive(true);
		user.setId(null);
		user.setRole( new Role() );
		user.setPassword( user.getPassword()  );
		
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
		return (List<User>) userRepository.findAllByActiveFalse();
	}
	
	@Override
	public List<User> getAllUsers(boolean isActive) {
		if( isActive ) return getAllActiveUsers();
		else return getAllInactiveUsers();		
	}
	
	@Override
	public User updateUser(User user, Long id) {
		User existingUser = getUserById(id);
		
		existingUser.setName( user.getFullName() );
		existingUser.setPassword( user.getPassword() );
		existingUser.setTelephone( user.getTelephone() );
		return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(Long id) {		
		User existingUser = getUserById(id);		
		existingUser.setActive(false);
		
		userRepository.save(existingUser);
	}


	

}

