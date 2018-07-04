package io.spring.part02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.part02.config.ShopConfiguration;
import io.spring.part02.model.Product;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);

		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);

		System.out.println(aaa);
		System.out.println(cdrw);

		context.close();
	}
}
