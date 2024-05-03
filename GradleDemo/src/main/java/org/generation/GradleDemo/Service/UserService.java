package org.generation.GradleDemo.Service;

import java.util.List;

import org.generation.GradleDemo.entity.User;



public interface UserService {
	User getUserById(Long id);
	User getUserByEmail(String email);
	List<User> getAllActiveUsers();
	List<User> getAllInactiveUsers();
	List<User> getAllUsers(boolean isActive);
	User updateUser(User user, Long id);
	void deleteUser(Long id);
	User createCustomer(User user);	
	User createVisitor(User user);
	User createAdmin(User user);
}

