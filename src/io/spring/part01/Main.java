package io.spring.part01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.part01.config.SequenceGeneratorConfiguration;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SequenceGeneratorConfiguration.class);

		SequenceGenerator generator = context.getBean("sequenceGenerator", SequenceGenerator.class);

		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		context.close();
	}

}
