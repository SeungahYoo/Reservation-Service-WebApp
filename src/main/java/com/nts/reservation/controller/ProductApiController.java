package com.nts.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nts.reservation.dto.Product;
import com.nts.reservation.service.ProductService;

@RestController
@RequestMapping(path = "/api")
public class ProductApiController {
	private ProductService productService;
	private static final int DISPLAY_LIMIT = 4;

	@Autowired
	public ProductApiController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products")
	public List<Product> getProductFromStartIdx(
		@RequestParam(name = "categoryId", required = false, defaultValue = "0") int categoryId,
		@RequestParam(name = "startIdx", required = false, defaultValue = "0") int startIdx) {

		System.out.println(productService.getProductsFromStartIdx(categoryId, startIdx, DISPLAY_LIMIT));
		return productService.getProductsFromStartIdx(categoryId, startIdx, DISPLAY_LIMIT);
	}
}
