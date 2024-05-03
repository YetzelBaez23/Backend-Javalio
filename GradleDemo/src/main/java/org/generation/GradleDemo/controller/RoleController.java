package org.generation.GradleDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.generation.GradleDemo.Service.RoleService;
import org.generation.GradleDemo.entity.Role;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}") // localhost:8080/api/v1/roles/{id}
    ResponseEntity<Role> getRoleById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(roleService.getRoleById(id), HttpStatus.OK);
    }
}