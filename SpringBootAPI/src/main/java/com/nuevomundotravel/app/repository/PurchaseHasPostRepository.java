package com.nuevomundotravel.app.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.PurchaseHasPost;


public interface PurchaseHasPostRepository extends CrudRepository <PurchaseHasPost, Long> {
	List<PurchaseHasPost> findByFullName (String fullName);  
	PurchaseHasPost findById (long Id );	
}

