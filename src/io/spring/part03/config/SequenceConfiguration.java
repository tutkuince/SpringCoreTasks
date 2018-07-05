package io.spring.part03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.spring.part03.service.DatePrefixGenerator;
import io.spring.part03.service.SequenceGenerator;

@Configuration
public class SequenceConfiguration {

	@Bean
	public DatePrefixGenerator datePrefixGenerator() {
		DatePrefixGenerator dpg = new DatePrefixGenerator();
		dpg.setPattern("yyyyMMdd");
		return dpg;
	}

	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator sequence = new SequenceGenerator();
		sequence.setInitial(100000);
		sequence.setSuffix("A");
		sequence.setPrefixGenerator(datePrefixGenerator());
		return sequence;
	}
}
