package io.spring.part01;

public class SequenceGenerator {
	private int id;
	private String prefix;
	private String suffix;

	public SequenceGenerator(int id, String prefix, String suffix) {
		super();
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public int getId() {
		return id;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

}
