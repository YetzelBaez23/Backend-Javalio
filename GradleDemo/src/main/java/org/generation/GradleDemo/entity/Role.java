package org.generation.GradleDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="roles") 
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "description", nullable = true, length = 150)
	private String description;
	
	//Visitante
	public Role(long i) {
		this.id=1L;
		this.name="customer";
		this.description="Cliente de la ecommerce";
	}
	//admin
    public Role() {
    	this.id=2L;
		this.name="admin";
		this.description="Administrador de la ecommerce";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Role [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

	


	
	
	
	

}
