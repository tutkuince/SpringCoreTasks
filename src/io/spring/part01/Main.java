package io.spring.part01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import io.spring.part01.config.SequenceGeneratorConfiguration;
import io.spring.part01.dao.SequenceDao;

public class Main {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//				SequenceGeneratorConfiguration.class);
//
//		SequenceGenerator generator = context.getBean("sequenceGenerator", SequenceGenerator.class);
//
//		System.out.println(generator.getSequence());
//		System.out.println(generator.getSequence());
//		
//		context.close();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.spring.part01");
		SequenceDao sequenceDao = context.getBean(SequenceDao.class);
		
		System.out.println(sequenceDao.getNextValue("IT"));
		System.out.println(sequenceDao.getNextValue("IT"));
		
		context.close();
	}

}
