package io.spring.part04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.spring.part04.model.Battery;
import io.spring.part04.model.Disc;
import io.spring.part04.model.Product;


@Configuration
@ComponentScan(basePackages = "io.spring.part04")
public class ShopConfiguration {

	@Bean
	public Product aaa() {
		Battery p1 = new Battery("AAA", 2.5);
		p1.setRechargeable(true);
		return p1;
	}
	
	@Bean
	public Product cdrw() {
		Disc p2 = new Disc("CD-RW", 1.5);
		p2.setCapacity(700);
		return p2;
	}
	
	@Bean
	public Product dvdrw() {
		Disc p2 = new Disc("DVD-RW", 3.0);
		p2.setCapacity(700);
		return p2;
	}
}
