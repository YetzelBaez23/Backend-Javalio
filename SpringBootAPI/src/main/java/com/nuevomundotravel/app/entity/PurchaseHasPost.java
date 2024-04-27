package com.nuevomundotravel.app.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "purchases_has_post") 
public class PurchaseHasPost {
		
		@ManyToOne  
		private Purchase purchase; 
		
		@ManyToOne
		private Post post; 
		
		@Column(name = "reservations", nullable = false)  
		private Integer reservation;

		
		
		public PurchaseHasPost() {}
		
		

		public Purchase getPurchase() {
			return purchase;
		}

		public void setPurchase(Purchase purchase) {
			this.purchase = purchase;
		}

		public Post getPost() {
			return post;
		}

		public void setPost(Post post) {
			this.post = post;
		}

		public Integer getReservation() {
			return reservation;
		}

		public void setReservation(Integer reservation) {
			this.reservation = reservation;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Purchaspost [purchase=");
			builder.append(purchase);
			builder.append(", post=");
			builder.append(post);
			builder.append(", reservation=");
			builder.append(reservation);
			builder.append("]");
			return builder.toString();
		} 
	
}
