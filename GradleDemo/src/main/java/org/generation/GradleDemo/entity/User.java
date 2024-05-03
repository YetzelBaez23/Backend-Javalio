package org.generation.GradleDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	//"INSERT INTO  users  (full_name ,  email ,  telephone ,  password ,  active, role_id ) VALUES ("Jesús Lopez  ",  "jlmwsk32@gmail.com ",  "8745333955 ",  "generation2024 ", 1)" via JDBC [Column count doesn't match value count at row 1]

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// TODO personalizar los campos name, nullable, length
	@Column(name = "full_name", nullable = false, length = 100)
	private String fullName;
	
	
	@Column(name = "email", nullable = false, length = 100, unique = true)
	private String email;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@Column(name = "telephone", nullable = false, length = 100)
	private String telephone;
	
	private Boolean active; 
	
	/*
	 * Relaciones entre Entidades: JPA permite definir relaciones 
	 * entre entidades, como relaciones uno a uno, uno a muchos 
	 * y muchos a muchos. Estas relaciones se pueden configurar
	 *  usando anotaciones como @OneToOne, @OneToMany, @ManyToOne 
	 *  y @ManyToMany.
	 *  
	 * "optional = false" se establece en false, significa 
	 * que cada instancia de la entidad que contiene la relación 
	 * debe tener un valor asociado para esa relación. En el 
	 * contexto de la entidad de usuario, esto significa que 
	 * cada usuario debe tener un rol asociado, y no se permitirá 
	 * que la relación sea nula desde el punto de vista del objeto.
	 * 
	 * "nullable = false" establece el campo role_id en la tabla 
	 * users como Not Null, lo que garantiza que cada 
	 * usuario tenga un rol asociado en la base de datos.
	 *   
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	public User() {
		
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

	public void setName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
		builder.append(", password=");
		builder.append(password);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", active=");
		builder.append(active);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}
	

	
	
	
	

}

