package org.generation.GradleDemo.repository;

import org.generation.GradleDemo.entity.PurchaseHasPost;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseHasPostRepository extends CrudRepository< PurchaseHasPost  > {
	Iterable<PurchaseHasPost> findAll();
}
