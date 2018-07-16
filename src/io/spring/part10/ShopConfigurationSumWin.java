package io.spring.part10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.spring.part07.model.Battery;
import io.spring.part07.model.Disc;
import io.spring.part07.model.Product;

@Configuration
@Profile({ "summer", "winter" })
public class ShopConfigurationSumWin {

	@Bean
	public Product aaa() {
		Battery p1 = new Battery();
		p1.setName("AAA");
		p1.setPrice(2.0);
		p1.setRechargeable(true);
		return p1;
	}

	@Bean
	public Product cdrw() {
		Disc p2 = new Disc("CD-RW", 1.0, 0);
		p2.setCapacity(700);
		return p2;
	}

	@Bean
	public Product dvdrw() {
		Disc p2 = new Disc("DVD-RW", 2.5, 0);
		p2.setCapacity(700);
		return p2;
	}
}
