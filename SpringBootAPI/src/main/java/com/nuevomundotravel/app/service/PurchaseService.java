package com.nuevomundotravel.app.service;

import java.util.List;

import com.nuevomundotravel.app.entity.Purchase;

public interface PurchaseService {
	
	Purchase getPurchaseById(Long id);
	Purchase createPurchase(Purchase purchase);
	
	//List<User> getAllActiveUsers();
	//List<User> getAllInactiveUsers();
	List<Purchase> getAllPurchases(boolean isActive);
	Purchase updatePurchase(Purchase purchase, Long id);
	void deletePurchase(Long id);
	

}
