package com.temu.app.service;

import java.util.List;


import com.temu.app.entity.User;
public interface UserService {
	
	User getUserById(Long id);
	User getUserByEmail(String email);
	User createCustomer(User user);
	User createVisitor(User user);
	User createAdmin(User user);
	
	List<User> getAllActiveUsers();
	List<User> getAllInactiveUsers();
	List<User> getAllUsers(boolean isActive);

	User updateUser(User user, Long id);
	void deleteUser(Long id);

}
