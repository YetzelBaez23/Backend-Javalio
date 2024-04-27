package com.nuevomundotravel.app.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.Purchase;


public interface PurchaseRepository extends CrudRepository <Purchase, Long> {
	List<Purchase> findByFullName (String fullName);  
	Purchase findById (long Id );
}

