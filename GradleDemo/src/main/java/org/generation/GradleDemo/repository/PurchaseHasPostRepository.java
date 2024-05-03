package org.generation.GradleDemo.repository;

import org.generation.GradleDemo.entity.PurchaseHasPost;
import org.generation.GradleDemo.entity.compositekey.PurchasePostKey;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PurchaseHasPostRepository extends JpaRepository<PurchaseHasPost, PurchasePostKey> {

}
