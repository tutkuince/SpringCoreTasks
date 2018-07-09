package io.spring.part04;

public class Problem04 {
	/**
	 * Problem
	 * 
	 * You want to use the Java standard @Resource and @Inject annotations to
	 * reference POJOs via autowiring, instead of using the
	 * Spring-specific @Autowired annotation.
	 * 
	 * Solution
	 * 
	 * JSR-250, or Common Annotations for the Java Platform, defines the @Resource
	 * annotation to autowire POJO references by name. JSR-330, or Standard
	 * Annotations for Injection, defines the @Inject annotations to autowire POJO
	 * references by type.
	 * 
	 * How It Works
	 * 
	 * The @Autowired annotation described in the previous recipe belongs to the
	 * Spring Framework, specifically to the
	 * org.springframework.beans.factory.annotation package. This means it can be
	 * used only in the context of the Spring Framework. Soon after Spring added
	 * support for the @Autowired annotation, the Java language standardized various
	 * annotations to fulfill the same purpose of the @Autowired annotation. These
	 * annotations are @Resource, which belongs to the javax.annotation package,
	 * and @Inject, which belongs to the javax.inject package.
	 * 
	 */
}
