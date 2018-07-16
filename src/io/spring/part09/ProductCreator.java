package io.spring.part09;

import java.util.Map;

import io.spring.part07.model.Battery;
import io.spring.part07.model.Disc;
import io.spring.part07.model.Product;

public class ProductCreator {
	private Map<String, Product> products;

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}

	public static Product createProduct(String productId) {
		if ("aaa".equals(productId))
			return new Battery("AAA", 2.5, 0);
		else if ("cdrw".equals(productId))
			return new Disc("CD-RW", 1.5, 0);
		else if ("dvdrw".equals(productId))
			return new Disc("DVD-RW", 3.0, 0);
		throw new IllegalArgumentException("Unknown product");
	}

	public Product createInstanceProduct(String productId) {
		Product product = products.get(productId);
		if (product != null)
			return product;

		throw new IllegalArgumentException("Unknown product");
	}
}
