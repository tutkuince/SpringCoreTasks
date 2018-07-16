package io.spring.part09;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import io.spring.part07.model.Product;

public class DiscountFactoryBean extends AbstractFactoryBean<Product> {
	private Product product;
	private double discount;

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public Class<?> getObjectType() {
		return product.getClass();
	}

	@Override
	protected Product createInstance() throws Exception {
		product.setPrice(product.getPrice() * (1 - discount));
		return product;
	}
}
