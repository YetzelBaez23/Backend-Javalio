package com.nuevomundotravel.app.entity;

import jakarta.persistence.*;

@Entity 
@Table (name = "images")

public class Destination {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Long id;  

	@Column(name = "name", length = 100, nullable = false)  
	private String name; 
	
	@Column(name = "recurrence", nullable = false)  
	private Integer recurrence; 
	
	@Column(name = "description", length = 200, nullable = false)  
	private String description;

	public Destination() {}

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

	public Integer getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(Integer recurrence) {
		this.recurrence = recurrence;
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
		builder.append("Destination [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", recurrence=");
		builder.append(recurrence);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
}

