package io.spring.part11;

public class Problem11 {
	/**
	 * Make POJOs Aware of Spring’s IoC Container Resources
	 * 
	 * Problem
	 * 
	 * Even though a well-designed component should not have direct dependencies on
	 * Spring’s IoC container, sometimes it’s necessary for beans to be aware of the
	 * container’s resources.
	 * 
	 * Solution
	 * 
	 * Your beans can be aware of the Spring IoC container’s resources by
	 * implementing certain “aware” interfaces.Spring injects the corresponding
	 * resources to beans that implement these interfaces via the setter methods
	 * defined in these interfaces.
	 * 
	 * BeanNameAware -> The bean name of its instances configured in the IoC
	 * container.
	 * 
	 * BeanFactoryAware -> The current bean factory, through which you can invoke
	 * the container’s services
	 * 
	 * ApplicationContextAware -> The current application context, through which you
	 * can invoke the container’s services
	 * 
	 * MessageSourceAware -> A message source, through which you can resolve text
	 * messages
	 * 
	 * ApplicationEventPublisherAware -> An application event publisher, through
	 * which you can publish application events
	 * 
	 * ResourceLoaderAware -> A resource loader, through which you can load external
	 * resources
	 * 
	 * EnvironmentAware -> The org.springframework.core.env.Environment instance
	 * associated with the ApplicationContext interface
	 * 
	 * Note The ApplicationContext interface in fact extends the MessageSource,
	 * ApplicationEventPublisher, and ResourceLoader interfaces, so you only need to
	 * be aware of the application context to access all these services. However,
	 * the best practice is to choose an aware interface with minimum scope that can
	 * satisfy your requirement.
	 * 
	 * ■Note With the newer versions of Spring, it is not strictly necessary to
	 * implement the aware interfaces. You could also use @Autowired to get, for
	 * instance, access to the ApplicationContext. However, if you are writing a
	 * framework/library, it might be better to implement the interfaces.
	 */
}
