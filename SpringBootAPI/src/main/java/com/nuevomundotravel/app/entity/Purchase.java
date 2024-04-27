package com.nuevomundotravel.app.entity;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "purchases") 
public class Purchase {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		 private Long id; 
		
		@Column(name = "date", nullable = false)  
		private Timestamp date; 
		
		@Column(name = "total", nullable = false)  
		private Double total; 
		
		@ManyToOne
		// @JoinColumn(name = "user_id")
		private User user;
		
		
		
		public Purchase() {}
		

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Timestamp getDate() {
			return date;
		}

		public void setDate(Timestamp date) {
			this.date = date;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}



		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Purchase [id=");
			builder.append(id);
			builder.append(", date=");
			builder.append(date);
			builder.append(", total=");
			builder.append(total);
			builder.append(", user=");
			builder.append(user);
			builder.append("]");
			return builder.toString();
		}		
}
