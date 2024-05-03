package org.generation.GradleDemo.Service;


import org.generation.GradleDemo.entity.PurchaseHasPost;


public interface PurchaseHasPostService {

	
	PurchaseHasPost getPurchaseHasPostById(long orderId, long productId);	
	
	PurchaseHasPost updatePurchaseHasPost(PurchaseHasPost purchaseHasPost, long orderId, long productId);
	
	void deleteOrderHasProduct(long orderId, long productId);

	PurchaseHasPost createPurchaseHasPost(PurchaseHasPost purchaseHasPost);

	
	
}
