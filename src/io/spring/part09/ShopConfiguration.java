package io.spring.part09;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.spring.part07.model.Battery;
import io.spring.part07.model.Disc;
import io.spring.part07.model.Product;

@Configuration
public class ShopConfiguration {

	@Bean	// instance factory method
	public ProductCreator productCreatorFactory() {
		ProductCreator factory = new ProductCreator();
		Map<String, Product> products = new HashMap<>();
		products.put("aaa", new Battery("AAA", 2.5, 0));
		products.put("cdrw", new Disc("CD-EW", 1.5, 0));
		products.put("dvdrw", new Disc("DVD-RW", 3.0, 0));
		factory.setProducts(products);
		return factory;
	}

	@Bean
	public Product aaa() {
		return ProductCreator.createProduct("aaa");
	}

	@Bean
	public Product cdrw() {
		return ProductCreator.createProduct("cdrw");
	}

	@Bean
	public Product dvdrw() {
		return ProductCreator.createProduct("dvdrw");
	}
}
