package com.temu.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.temu.app.entity.Role;
import com.temu.app.entity.User;
import com.temu.app.repository.UserRepository;
import com.temu.app.service.UserService;


@Service
public class UserServiceImpl  implements UserService{
	
	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		User existingUser;
		if(userOptional.isPresent()) {
			existingUser = userOptional.get();
			return existingUser;
		}else {
			throw new IllegalStateException("El usuario no existe con id: " + id);
		}
		
	}

	@Override
	public User getUserByEmail(String email) {
		Optional<User> userOptional = userRepository.findByEmail(email);
		User existingUser;
		if(userOptional.isPresent()) {
			existingUser = userOptional.get();
			return existingUser;
		}else {
			throw new IllegalStateException("No existe el usuario con correo: " +email);
		}
		
	}

	@Override
	public User createCustomer(User user) {
		user.setActive(true);
		user.setId(null);
		user.setRole(new Role(1L)); // id 1
		if(userRepository.existsByEmail(user.getEmail())) {
			throw new IllegalStateException("El usuario con correo: " + user.getEmail() + " ya existe");
		}
		return userRepository.save(user);
	}
	
	

	@Override
	public User createAdmin(User user) {
		user.setActive(true);
		user.setId(null);
		user.setRole(new Role(2L)); // id 1
		if(userRepository.existsByEmail(user.getEmail())) {
			throw new IllegalStateException("El usuario con correo: " + user.getEmail() + " ya existe");
		}
		return userRepository.save(user);
	}
	
	@Override
	public User createVisitor(User user) {
		user.setActive(true);
		user.setId(null);
		user.setRole(new Role(3L)); // id 1
		if(userRepository.existsByEmail(user.getEmail())) {
			throw new IllegalStateException("El usuario con correo: " + user.getEmail() + " ya existe");
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
	public User updateUser(User user, Long id) {
		User existingUser = getUserById(id);
		existingUser.setFirstName( user.getFirstName() );
		existingUser.setLastName( user.getLastName() );
		existingUser.setPassword( user.getPassword() );
		existingUser.setBirthDate( user.getBirthDate() );
		return userRepository.save(existingUser);	
	}

	@Override
	public void deleteUser(Long id) {
	 User existingUser = getUserById(id);
	 existingUser.setActive(false);
	 userRepository.save(existingUser);
	}

	@Override
	public List<User> getAllUsers(boolean isActive) {
		if(isActive) return getAllActiveUsers();
		else return getAllInactiveUsers();
	}

}
