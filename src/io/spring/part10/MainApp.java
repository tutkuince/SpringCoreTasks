package io.spring.part10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("global", "winter");
		context.scan("io.spring");
		context.refresh();
		context.close();
	}
}
