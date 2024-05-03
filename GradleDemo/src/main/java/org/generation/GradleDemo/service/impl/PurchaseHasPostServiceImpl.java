package org.generation.GradleDemo.service.impl;


import org.generation.GradleDemo.Service.PurchaseHasPostService;
import org.generation.GradleDemo.entity.PurchaseHasPost;

import org.generation.GradleDemo.entity.compositekey.PurchasePostKey;
import org.generation.GradleDemo.repository.PurchaseHasPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PurchaseHasPostServiceImpl implements PurchaseHasPostService {
	
	
	@Autowired
	private PurchasePostKey purchasePostKey;
	
	@Autowired
	private PurchaseHasPostRepository purchasePostRepository;

	@Override
	public PurchaseHasPost createPurchaseHasPost(PurchaseHasPost purchaseHasPost) {		
		
		return  purchasePostRepository.save(purchaseHasPost);
	}

	@Override
	public PurchaseHasPost getPurchaseHasPostById(long orderId, long productId) {
		purchasePostKey.setOrderId(orderId);
		purchasePostKey.setProductId(productId);
		
		return purchasePostRepository.findById( purchasePostKey )
				.orElseThrow( ()-> new IllegalStateException (
						"OrderHasProduct does not exist with orderId: " + orderId + " and productId " + productId
						));		
	}

	@Override
	public PurchaseHasPost updatePurchaseHasPost(PurchaseHasPost purchasePost, long orderId, long productId) {
		PurchaseHasPost existingOrderHasProduct = getPurchaseHasPostById(orderId, productId);
		existingOrderHasProduct.setQuantity( purchasePost.getQuantity() );
		return createPurchaseHasPost(existingOrderHasProduct);
	}

	@Override
	public void deleteOrderHasProduct(long orderId, long productId) {
		PurchaseHasPost existingOrderHasProduct = getPurchaseHasPostById(orderId, productId);
		purchasePostRepository.delete(existingOrderHasProduct);		
	}

	

	

	

}
