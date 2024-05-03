package org.generation.GradleDemo.service.impl;

import java.util.List;

import org.generation.GradleDemo.Service.PurchaseHasPostService;
import org.generation.GradleDemo.entity.PurchaseHasPost;
import org.generation.GradleDemo.entity.User;
import org.generation.GradleDemo.repository.PurchaseHasPostRepository;
import org.springframework.stereotype.Service;



@Service
public class PurchaseHasPostServiceImpl implements PurchaseHasPostService {
	PurchaseHasPostRepository purchaseHasPostRepository;
	
	public PurchaseHasPostServiceImpl(PurchaseHasPostRepository purchaseHasPostRepository) {
		this.purchaseHasPostRepository = purchaseHasPostRepository;
	}
	@Override
	public List<PurchaseHasPost> getAllPurchaseHasPost() {
		
		return (List<PurchaseHasPost>) purchaseHasPostRepository.findAll();
	}

	
	
	
	
	



}
