package org.generation.GradleDemo.service.impl;

import java.util.Optional;

import org.generation.GradleDemo.Service.PurchaseService;
import org.generation.GradleDemo.entity.Purchase;

import org.generation.GradleDemo.repository.PurchaseRepository;
import org.springframework.stereotype.Service;


@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	PurchaseRepository purchaseRepository;
	
	public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
		this.purchaseRepository =  purchaseRepository;
	}
	@Override
	public Purchase getPurchaseById(Long id) {		
		Optional<Purchase> purchaseOptional = purchaseRepository.findById(id);
		Purchase existingPurchase;
		
		if( purchaseOptional.isPresent() ) {
			existingPurchase = purchaseOptional.get();
			return existingPurchase;
		} else {
			throw new IllegalStateException("Purchase does not exist with id " + id);
		}			
	}
	

	@Override
	public Purchase createPurchase(Purchase purchase) {	
					
		return purchaseRepository.save(purchase);
	}
}
