package org.generation.GradleDemo.controller;

import org.generation.GradleDemo.Service.PurchaseService;
import org.generation.GradleDemo.entity.Purchase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }
    
    @GetMapping("/{id}") // localhost:8080/api/v1/purchase/{id}
    ResponseEntity<Purchase> getUserById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(purchaseService.getPurchaseById(id), HttpStatus.OK);
    }
    
    @PostMapping
	ResponseEntity<Purchase> createPurchase(@RequestBody Purchase Purchase ){
		Purchase createdPurchase = purchaseService.createPurchase(Purchase);
		
		return new ResponseEntity<Purchase>( createdPurchase, HttpStatus.CREATED );		
	}
	

}
