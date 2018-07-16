package io.spring.part11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

	@Bean(initMethod = "openFile", destroyMethod = "closeFile")
	public Cashier cashier() {
		final String path = System.getProperty("java.io.tmpdir") + "cashier";
		Cashier cashier = new Cashier();
		cashier.setBeanName(path);
		return cashier;
	}
}
