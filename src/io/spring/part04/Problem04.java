package io.spring.part04;

public class Problem04 {
	/**
	 * Problem
	 * 
	 * When you declare a POJO instance with an annotation like @Component, you are
	 * actually defining a template for bean creation, not an actual bean instance.
	 * When a bean is requested by the getBean() method or referenced from other
	 * beans, Spring decides which bean instance should be returned according to the
	 * bean scope. Sometimes you have to set an appropriate scope for a bean other
	 * than the default scope.
	 * 
	 * Solution
	 * 
	 * A bean’s scope is set with the @Scope annotation. By default, Spring creates
	 * exactly one instance for each bean declared in the IoC container, and this
	 * instance is shared in the scope of the entire IoC container. This unique bean
	 * instance is returned for all subsequent getBean() calls and bean references.
	 * This scope is called singleton, which is the default scope of all beans.
	 */
}
