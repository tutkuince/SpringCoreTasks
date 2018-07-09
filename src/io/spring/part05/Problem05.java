package io.spring.part05;

public class Problem05 {
	/**
	 * Use Data from External Resources (Text Files, XML Files, Properties Files, or
	 * Image Files)
	 * 
	 * Problem
	 * 
	 * Sometimes applications need to read external resources (e.g., text files, XML
	 * files, properties file, or image files) from different locations (e.g., a
	 * file system, classpath, or URL). Usually, you have to deal with different
	 * APIs for loading resources from different locations.
	 * 
	 * Solution
	 * 
	 * Spring offers the @PropertySource annotation as a facility to load the
	 * contents of a .properties file (i.e., key-value pairs) to set up bean
	 * properties. Spring also has a resource loader mechanism that provides a
	 * unified Resource interface to retrieve any type of external resource by a
	 * resource path. You can specify different prefixes for this path to load
	 * resources from different locations with the @Value annotation. To load a
	 * resource from a file system, you use the file prefix. To load a resource from
	 * the classpath, you use the classpath prefix. You can also specify a URL in
	 * the resource path.
	 * 
	 * How It Works
	 * 
	 * To read the contents of a properties file (i.e., key-value pairs) to set up
	 * bean properties, you can use Spring’s
	 * 
	 * @PropertySource annotation with PropertySourcesPlaceholderConfigurer. If you
	 *                 want to read the contents of any file, you can use Spring’s
	 *                 Resource mechanism decorated with the @Value annotation.
	 */
}
