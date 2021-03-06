package io.spring.part05.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

import io.spring.part05.model.Disc;
import io.spring.part05.model.Product;

@Configuration
@PropertySource("classpath:io/spring/part05/resources/discounts.properties") // Once you define the @PropertySource annotation to load the
													// properties file, you also need to define
													// aPropertySourcePlaceholderConfigurer bean with the @Bean
													// annotation.
@ComponentScan(basePackages = "io.spring.part05")
public class ShopConfiguration {

	@Value("classpath:banner.txt")
	private Resource banner;
	
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
