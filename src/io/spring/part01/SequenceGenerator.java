package io.spring.part01;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
	private String prefix;
	private String suffix;
	private int initial;

	// store the numeric value of each generator
	private final AtomicInteger counter = new AtomicInteger();

	public SequenceGenerator() {

	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	// get the last sequence number with the prefix and suffix joined.
	public String getSequence() {
		StringBuilder builder = new StringBuilder();
		builder.append(prefix).append(initial).append(counter.getAndIncrement()).append(suffix);
		return builder.toString();
	}
}
