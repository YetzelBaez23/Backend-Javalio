package org.generation.GradleDemo.entity.compositekey;



import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Component
@Embeddable
public class PurchasePostKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column( name = "order_id" )
	Long orderId;
	@Column( name = "product_id" )
	Long productId;
	
	public PurchasePostKey() {
		
	}
	
	public PurchasePostKey(Long orderId, Long productId) {
		
		this.orderId = orderId;
		this.productId = productId;
	}

	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PurchasePostKey [orderId=");
		builder.append(orderId);
		builder.append(", productId=");
		builder.append(productId);
		builder.append("]");
		return builder.toString();
	}	
	
	
	

}