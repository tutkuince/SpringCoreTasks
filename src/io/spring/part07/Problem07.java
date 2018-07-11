package io.spring.part07;

public class Problem07 {
	/**
	 * Customize POJO Initialization and Destruction with Annotations
	 * 
	 * Problem
	 * 
	 * Some POJOs have to perform certain types of initialization tasks before
	 * they’re used. These tasks can include opening a file, opening a
	 * network/database connection, allocating memory, and so on. In addition, these
	 * same POJOs have to perform the corresponding destruction tasks at the end of
	 * their life cycle. Therefore, sometimes it’s necessary to customize bean
	 * initialization and destruction in the Spring IoC container.
	 * 
	 * Solution
	 * 
	 * Spring can recognize initialization and destruction callback methods by
	 * setting the initMethod and destroyMethod attributes of the @Bean definition
	 * in a Java config class. Or Spring can also recognize initialization and
	 * destruction callback methods if POJO methods are decorated with
	 * the @PostConstruct and @PreDestroy annotations, respectively. Spring can also
	 * delay the creation of a bean up until the point it’s required—a process
	 * called lazy initialization—with the @Lazy annotation. Spring can also ensure
	 * the initialization of certain beans before others with the @DependsOn
	 * annotation.
	 * 
	 * How It Works
	 * 
	 * Define methods to run before POJO initialization and destruction with @Bean.
	 * Let’s take the case of the shopping application and consider an example
	 * involving a checkout function. Let’s modify the Cashier class to record a
	 * shopping cart’s products and the checkout time to a text file.
	 */
}
