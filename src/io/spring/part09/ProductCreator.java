package io.spring.part09;

import io.spring.part07.model.Battery;
import io.spring.part07.model.Disc;
import io.spring.part07.model.Product;

public class ProductCreator {
	
	public static Product createProduct(String productId) {
		if ("aaa".equals(productId))
			return new Battery("AAA", 2.5, 0);
		else if ("cdrw".equals(productId))
			return new Disc("CD-RW", 1.5, 0);
		else if ("dvdrw".equals(productId))
			return new Disc("DVD-RW", 3.0, 0);
		throw new IllegalArgumentException("Unknown product");
	}
}
