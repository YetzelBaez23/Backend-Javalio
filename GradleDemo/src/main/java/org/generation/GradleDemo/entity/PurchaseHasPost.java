package org.generation.GradleDemo.entity;

import jakarta.persistence.*;



@Table(name = "purchases_has_products")
public class PurchaseHasPost  {
	
	@ManyToOne
	@MapsId("orderId")
    @JoinColumn(name = "purchase_id")
	private Purchase purchase;
	
	@ManyToOne
	@MapsId("productId")
    @JoinColumn(name = "post_id")
	private Post post;
	
	@Column(name = "quantity")
	private Long quantity;
	
	@Column(name = "price")
	private Double price;

	public PurchaseHasPost() {
		
	}

	public PurchaseHasPost(Purchase purchase, Post post, Long quantity, Double price) {
		this.purchase = purchase;
		this.post = post;
		this.quantity = quantity;
		this.price = price;
	}

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

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PurchaseHasPost [purchase=");
		builder.append(purchase);
		builder.append(", post=");
		builder.append(post);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}