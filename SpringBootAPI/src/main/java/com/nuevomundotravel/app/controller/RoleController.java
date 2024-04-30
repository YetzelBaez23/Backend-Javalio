package com.nuevomundotravel.app.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nuevomundotravel.app.entity.Role;
import com.nuevomundotravel.app.service.RoleService;



@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/v1/users")
public class RoleController {
	
RoleService roleService;
	
	//inyeccion de dependencias
	public RoleController(RoleService roleService) {
		this.roleService = roleService;

	}
	
	// creacion de endpoint
	/**
	 * Request Param
	 * Vincula los parametros de una solicitud HTTP con los
	 * parámetros del método.
	 * PErmite extraer los valores de los parametros de 
	 * la consulta (query parameters).
	 * Si no se proporciona los valores, se genera la excepción
	 * MissingServletRequestPArametersException
	 * 
	 * En el sig. ej. manejaremos la url como
	 * 
	 * localhost:8080/api/v1/users?active=true
	 * localhost:8080/api/v1/users
	 * 
	 * localhost:8080/api/v1/users?active=false
	 * 
	 * 	Class ResponseEntity<> : Es una clase que representa la respuesta HTTP:
	 *  código estado, encabezado, cuerpo de la respuesta.
	 *  Proporciona una forma más flexible y completa de manejar las respuestas HTTP. 
	 *
	 * 
	 * @return
	 */
	@GetMapping 
	 ResponseEntity< List<Role> > getAllRoles(
			@RequestParam(	name="active", 
							required=false, 
							defaultValue="true") boolean active 
			){
		return new ResponseEntity<List<Role>>(roleService.getAllRoles( active ), HttpStatus.OK);
	}
	
	/**
	 *  @GetMapping con Path Variable
	 *  Path Variable vincula un valor de una variable URL
	 *  a un parámetro del método.
	 *  Permite capturar datos dinámicos presentes en la URL 
	 */

	@GetMapping("{id}") // localhost:8080/api/v1/users/{id}
	  ResponseEntity<Role> getRoleById(@PathVariable("id") Long id){
		return new ResponseEntity<Role>(roleService.getRoleById(id), HttpStatus.OK);
	}
	
	
	@PostMapping
	ResponseEntity<Role> createUser(@RequestBody Role user ){
		Role createdRole = roleService.createRole(user);
		
		return new ResponseEntity<Role>( createdRole, HttpStatus.CREATED );		
	}

}
