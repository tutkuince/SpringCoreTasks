package io.spring.part03;

public class Problem03 {
	/**
	 * Use POJO References and Autowiring to Interact with Other POJOs
	 * 
	 * Problem
	 * 
	 * The POJO instances or beans that make up an application often need to
	 * collaborate with each other to complete the application’s functions. You want
	 * to use annotations to use POJO references and autowiring.
	 * 
	 * Solution
	 * 
	 * For POJO instances defined in a Java config class, you can use standard Java
	 * code to create references between beans. To autowire POJO references, you can
	 * mark a field, a setter method, a constructor, or even an arbitrary method
	 * with the @Autowired annotation.
	 * 
	 * How It Works
	 * 
	 * First we will introduce you to different methods of autowiring using
	 * constructors, fields and properties. Finally you will see how you could solve
	 * issues in autowiring.
	 */
}
