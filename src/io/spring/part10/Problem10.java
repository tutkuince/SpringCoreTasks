package io.spring.part10;

public class Problem10 {
	/**
	 * Use Spring Environments and Profiles to Load Different Sets of POJOs
	 * 
	 * Problem
	 * 
	 * You want to use the same set of POJO instances or beans but with different
	 * instantiation values for different application scenarios (e.g., production
	 * and development and testing).
	 * 
	 * Solution
	 * 
	 * Create multiple Java configuration classes and group POJOs instances or beans
	 * into each of these classes. Assign a profile name to the Java configuration
	 * class with the @Profile annotation based on the purpose of the group. Get the
	 * environment for an application’s context and set the profile to load a
	 * specific group of POJOs.
	 * 
	 * How It Works
	 * 
	 * POJO instantiation values can vary depending on different application
	 * scenarios. For example, a common scenario can occur when an application goes
	 * from development to testing and on to production. In each of these scenarios,
	 * the properties for certain beans can vary slightly to accommodate environment
	 * changes (e.g., database username/password, file paths, etc.). You can create
	 * multiple Java configuration classes each with different POJOs (e.g.,
	 * ShopConfigurationGlobal, ShopConfigurationStr, and ShopConfigurationSumWin)
	 * and, in the application context, only load a given configuration class file
	 * based on the scenario.
	 */
}
