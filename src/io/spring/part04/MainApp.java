package io.spring.part04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.part04.config.ShopConfiguration;
import io.spring.part04.dao.ShoppingCart;
import io.spring.part04.model.Product;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);

		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);
		Product dvdrw = context.getBean("dvdrw", Product.class);

		ShoppingCart cart1 = context.getBean("shoppingCart", ShoppingCart.class);
		cart1.addItem(aaa);
		cart1.addItem(cdrw);
		System.out.println("Shopping cart 1 contains: " + cart1.getItems());

		ShoppingCart cart2 = context.getBean("shoppingCart", ShoppingCart.class);
		cart2.addItem(dvdrw);
		System.out.println("Shopping cart 2 contains: " + cart2.getItems());
		
		context.close();
	}
}
