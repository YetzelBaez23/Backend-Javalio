package com.nuevomundotravel.app.entity;

import jakarta.persistence.*;

@Entity
@Table (name= "users")

public class User {
	
	public User() {}  // TODO Auto-generated constructor stub
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Long id; 
	
	@Column(name = "full_name", length = 70, nullable = false)
	 private String fullName;
	
	@Column(name = "email", length = 100, nullable = false, unique = true)
	 private String email;
	 
	@Column(name = "telephone", length = 20, nullable = false)
	 private String telephone; 
	
	@Column(name = "password", length = 100, nullable = false) 
	 private String password;
	
	@ManyToOne
	// @JoinColumn(name = "role_id")
	private Role role;
	
	
	// PURCHASES HAS POSTS 
	
	
	
	public User(Long id, String fullName, Role role, String telephone, String password) {
			
			this.id = id;
			this.fullName = fullName;
			this.role = role;
			this.telephone = telephone;
			this.password = password;
		}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", fullName=");
		builder.append(fullName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", password=");
		builder.append(password);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}
	
}





