package org.generation.GradleDemo.Service;

import org.generation.GradleDemo.entity.Purchase;

public interface PurchaseService {
	Purchase getPurchaseById(Long id);
	Purchase createPurchase(Purchase purchase);
}
