package org.generation.GradleDemo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.generation.GradleDemo.Service.PurchaseHasPostService;
import org.generation.GradleDemo.entity.PurchaseHasPost;

@RestController
@RequestMapping("api/order-has-product")
public class PurchaseHasPostController {
	
	@Autowired
	PurchaseHasPostService purchaseHasPostService;
	
	@PostMapping
	public ResponseEntity<PurchaseHasPost> createOrderHasProduct(@Validated @RequestBody PurchaseHasPost orderHasProduct) {
		PurchaseHasPost savedOrderHasProduct = purchaseHasPostService.createPurchaseHasPost(orderHasProduct);
		return new ResponseEntity<>(savedOrderHasProduct, HttpStatus.CREATED);
	}

	@GetMapping("/query")
	public ResponseEntity<PurchaseHasPost> getOrderHasProductById(
			@RequestParam long orderId,
			@RequestParam long productId
			) {
		PurchaseHasPost orderHasProduct = purchaseHasPostService.getPurchaseHasPostById(orderId, productId);
		return new ResponseEntity<>(orderHasProduct, HttpStatus.OK);
	}


	@PutMapping("/query")
	public ResponseEntity<PurchaseHasPost> updateOrderHasProduct(
			@RequestParam long orderId,
			@RequestParam long productId,
			@Validated @RequestBody PurchaseHasPost orderHasProduct
			) {
		PurchaseHasPost updateOrderHasProduct = purchaseHasPostService.updatePurchaseHasPost(orderHasProduct, orderId, productId);
		return new ResponseEntity<>(updateOrderHasProduct, HttpStatus.OK);
	}

	@DeleteMapping("/query")
	public ResponseEntity<String> deleteOrderHasProduct(
			@RequestParam long orderId,
			@RequestParam long productId
			) {
		purchaseHasPostService.deleteOrderHasProduct(orderId, productId);
		return new ResponseEntity<>("Order id: " + orderId + "and product id: " + productId + " successfully deleted", HttpStatus.OK);
	}

}
