package com.temu.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.temu.app.entity.User;
import com.temu.app.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	UserService userService;

	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping
	ResponseEntity<List<User>> getAllUsers(@RequestParam(name="active",
									required= false,
									defaultValue="true") boolean active){
		return new ResponseEntity<List<User>> (userService.getAllUsers(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")// /id path variable
	ResponseEntity<User> getUserById(@PathVariable("id") Long id){
		return new ResponseEntity<User> (userService.getUserById(id),HttpStatus.OK);
	}
	
	@GetMapping("email/{email}")
	ResponseEntity<User> getUserByemail(@PathVariable("email") String email){
		return new ResponseEntity<User>(userService.getUserByEmail(email), HttpStatus.OK);
	}
	
	@PostMapping("customer")
	ResponseEntity<User> createcustomer(@RequestBody User user){
		User createdUser = userService.createCustomer(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}
	
	@PostMapping("visitor")
	ResponseEntity<User> createVisitor(@RequestBody User user){
		User createdUser = userService.createVisitor(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}
	
	@PostMapping("admin")
	ResponseEntity<User> createAdmin(@RequestBody User user){
		User createdUser = userService.createAdmin(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUSer(@PathVariable("id") Long id){
		userService.deleteUser(id);
		return new ResponseEntity<String>("Successfully deleted user with id: " + id , HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<User> updateUser(
			@RequestBody User user, 
			@PathVariable("id") Long id  
			){
		User updatedUser = userService.updateUser(user, id);
		
		return new ResponseEntity<User>( updatedUser, HttpStatus.OK );		
	}
	
	
	
	
	// por lo regular se repiten los nombres de los metodos de la capa de service
	/*
	List<User> getAllActiveUsers(){
		return userService.getAllActiveUsers();
	}
	*/
	
	
	

}
