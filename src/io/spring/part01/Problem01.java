package io.spring.part01;

public class Problem01 {
	/**
	 * Problem
	 * 
	 * You want to manage POJOs with annotations with Spring’s IoC container.
	 * 
	 * Solution
	 * 
	 * Design a POJO class. Next, create a Java config class with @Configuration
	 * and @Bean annotations to configure POJO instance values or set up Java
	 * components with @Component, @Repository, @Service, or
	 * 
	 * @Controller annotations to later create POJO instance values. Next,
	 *             instantiate the Spring IoC container to scan for Java classes
	 *             with annotations. The POJO instances or bean instances then
	 *             become accessible to put together as part of an application.
	 * 
	 * 
	 *             How It Works
	 * 
	 *             Suppose you’re going to develop an application to generate
	 *             sequence numbers and you are going to need many series of
	 *             sequence numbers for different purposes. Each sequence will have
	 *             its own prefix, suffix, and initial values. So, you have to
	 *             create and maintain multiple generator instances for the
	 *             application. Create a POJO class to create beans with a Java
	 *             config.
	 */
}
