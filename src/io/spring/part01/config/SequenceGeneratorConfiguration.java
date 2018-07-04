package io.spring.part01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.spring.part01.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {

	@Bean // Any method definitions decorated with the @Bean annotation generates a bean
			// name based on themethod name.
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator seqgen = new SequenceGenerator();
		seqgen.setPrefix("30");
		seqgen.setSuffix("A");
		seqgen.setInitial(100000);
		return seqgen;
	}
}
