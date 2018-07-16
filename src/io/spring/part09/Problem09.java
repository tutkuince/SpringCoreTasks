package io.spring.part09;

public class Problem09 {
	/**
	 * Create POJOs with a Factory (Static Method, Instance Method, Spring’s
	 * FactoryBean)
	 * 
	 * Problem
	 * 
	 * You want to create a POJO instance in the Spring IoC container by invoking a
	 * static factory method or instance factory method. The purpose of this
	 * approach is to encapsulate the object-creation process either in a static
	 * method or in a method of another object instance, respectively. The client
	 * who requests an object can simply make a call to this method without knowing
	 * about the creation details. You want to create a POJO instance in the Spring
	 * IoC container using Spring’s factory bean. A factory bean is a bean that
	 * serves as a factory for creating other beans within the IoC container.
	 * Conceptually, a factory bean is similar to a factory method, but it’s a
	 * Spring-specific bean that can be identified by the Spring IoC container
	 * during bean construction.
	 * 
	 * 
	 * Solution
	 * 
	 * To create a POJO by invoking a static factory inside an @Bean definition of a
	 * Java configuration class, you use standard Java syntax to call the static
	 * factory method. To create a POJO by invoking an instance factory method
	 * inside an @Bean definition of a Java configuration class, you create a POJO
	 * to instantiate the factory values and another POJO to act as a façade to
	 * access the factory. As a convenience, Spring provides an abstract template
	 * class called AbstractFactoryBean to extend Spring’s FactoryBean interface.
	 * 
	 */
}
