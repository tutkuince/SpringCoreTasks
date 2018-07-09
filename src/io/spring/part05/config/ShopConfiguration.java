package io.spring.part05.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import io.spring.part05.model.Disc;
import io.spring.part05.model.Product;

@Configuration
@PropertySource("classpath:discounts.properties")
@ComponentScan(basePackages = "io.spring.part05")
public class ShopConfiguration {

	@Value("${endofyear.discount:0}")
	private double specialEndofyearDiscountField;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public Product dvdrw() {
		Disc p2 = new Disc("DVD-RW", 3.0, specialEndofyearDiscountField);
		p2.setCapacity(700);
		return p2;
	}
}
