package org.generation.GradleDemo.controller;

import java.util.List;

import org.generation.GradleDemo.Service.UserService;
import org.generation.GradleDemo.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

  
    @GetMapping
    ResponseEntity<List<User>> getAllUsers(
            @RequestParam(name = "active", required = false, defaultValue = "true") boolean active) {
        return new ResponseEntity<>(userService.getAllUsers(active), HttpStatus.OK);
    }

    /**
     * @GetMapping con Path Variable
     * Path Variable vincula un valor de una variable URL
     * a un parámetro del método.
     * Permite capturar datos dinámicos presentes en la URL
     */
    @GetMapping("/{id}") // localhost:8080/api/v1/users/{id}
    ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<User> createVisitor(@RequestBody User user) {
        User createdVisitor = userService.createVisitor(user);
        return new ResponseEntity<>(createdVisitor, HttpStatus.CREATED);
    }

    @PostMapping("/admin")
    ResponseEntity<User> createAdmin(@RequestBody User user) {
        User createdAdmin = userService.createAdmin(user);
        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
    }

    @PostMapping("/customer")
    ResponseEntity<User> createCustomer(@RequestBody User user) {
        User createdCustomer = userService.createCustomer(user);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("User id " + id + " successfully deleted", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<User> updateUser(
            @RequestBody User user,
            @PathVariable("id") Long id) {
        User updatedUser = userService.updateUser(user, id);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}