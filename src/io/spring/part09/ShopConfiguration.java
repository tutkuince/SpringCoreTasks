package io.spring.part09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.spring.part07.model.Product;

@Configuration
public class ShopConfiguration {

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
