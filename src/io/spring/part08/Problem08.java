package io.spring.part08;

public class Problem08 {
	/**
	 * Create Post-Processors to Validate and Modify POJOs
	 * 
	 * Problem
	 * 
	 * You want to apply tasks to all bean instances or specific types of instances
	 * during construction to validate or modify bean properties according to
	 * particular criteria.
	 * 
	 * Solution
	 * 
	 * A bean post-processor allows bean processing before and after the
	 * initialization callback method (i.e., the one assigned to the initMethod
	 * attribute of the @Bean annotation or the method decorated with
	 * the @PostConstruct annotation). The main characteristic of a bean
	 * post-processor is that it processes all the bean instances in the IoC
	 * container, not just a single bean instance. Typically, bean post-processors
	 * are used to check the validity of bean properties, alter bean properties
	 * according to particular criteria, or apply certain tasks to all bean
	 * instances. Spring also supports the @Required annotation, which is backed by
	 * the built-in Spring post-processor RequiredAnnotationBeanPostProcessor. The
	 * RequiredAnnotationBeanPostProcessor bean post-processor checks whether all
	 * the bean properties with the @Required annotation have been set.
	 * 
	 * How It Works
	 * 
	 * Suppose you want to audit the creation of every bean. You may want to do this
	 * to debug an application, to verify the properties of every bean, or in some
	 * other scenario. A bean post-processor is an ideal choice to implement this
	 * feature because you don’t have to modify any preexisting POJO code.
	 */
}
