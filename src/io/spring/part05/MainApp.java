package io.spring.part05;

import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class MainApp {
	public static void main(String[] args) throws Exception {
		Resource resource = new ClassPathResource("io/spring/part05/resources/discounts.properties");
		Properties props = PropertiesLoaderUtils.loadProperties(resource);
		System.out.println("And don't forget our discounts");
		System.out.println(props);
	}
}
