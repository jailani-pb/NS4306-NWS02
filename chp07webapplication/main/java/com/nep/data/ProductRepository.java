package com.nep.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nep.models.Product;

@Component
public class ProductRepository {

	private static final List<Product> ALL_PRODUCTS = Arrays.asList(
			new Product("Apple iPhone 6s", 1210.55, "iphone6s.png", true),
			new Product("Apple iPad Pro", 1310.55, "ipadpro.png", true),
			new Product("Samsung Galaxy S7 Edge", 801.32, "samsungs7edge.png", true),
			new Product("Samsung Galaxy Note 7", 1035.99, "samsungnote7.png", false),
			new Product("HTC One X9", 500.99, "htconex9.png", false),
			new Product("Oppo F1s", 309.80, "oppof1s.png", true)
			);
	
	public List<Product> getAllProducts() {
		return ALL_PRODUCTS;
	}
	
	public Product findProductByName(String name) {
		for(Product product : ALL_PRODUCTS) {
			if(product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
	
}








