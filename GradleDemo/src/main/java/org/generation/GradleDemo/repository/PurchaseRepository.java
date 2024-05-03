package org.generation.GradleDemo.repository;

import org.generation.GradleDemo.entity.Purchase;
import org.springframework.data.repository.CrudRepository;


public interface PurchaseRepository extends CrudRepository< Purchase,Long> {

	
}
