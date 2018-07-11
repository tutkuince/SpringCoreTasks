package io.spring.part07.config;

import org.springframework.context.annotation.Bean;

import io.spring.part07.service.Cashier;

public class ShopConfiguration {

	@Bean(initMethod = "openFile", destroyMethod = "closeFile")
	public Cashier cashier() {
		String path = System.getProperty("java.io.tmpdir") + "/cashier";
		Cashier c1 = new Cashier();
		c1.setFileName("checkout");
		c1.setPath(path);
		return c1;
	}
}
