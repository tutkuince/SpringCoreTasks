package io.spring.part01;

public class SequenceGenerator {
	private final String id;
	private final String prefix;
	private final String suffix;

	public SequenceGenerator(String id, String prefix, String suffix) {
		super();
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public String getId() {
		return id;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

}
