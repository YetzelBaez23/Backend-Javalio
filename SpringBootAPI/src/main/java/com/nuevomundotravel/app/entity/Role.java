package com.nuevomundotravel.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")	
public class Role  {
	
		public Role() {} 
	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		 private Long id; 
		
		@Column(name = "name", length = 20, nullable = false)  
		private String name; 
		
		@Column(name = "description", length = 150, nullable = false)  
		private String description;

		
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

