package io.spring.part03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SequenceGenerator {
	private String suffix;
	private int initial;

	@Autowired
	@Qualifier("datePrefixGenerator")
	private PrefixGenerator prefixGenerator;

	@Autowired
	private List<PrefixGenerator> prefixGenerators;

	@Autowired
	public void myOwnCustomInjectionName(@Qualifier("datePrefixGenerator") PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}

	public List<PrefixGenerator> getPrefixGenerators() {
		return prefixGenerators;
	}

	public void setPrefixGenerators(List<PrefixGenerator> prefixGenerators) {
		this.prefixGenerators = prefixGenerators;
	}

	public String getSuffix() {
		return suffix;
	}

	public int getInitial() {
		return initial;
	}

	public PrefixGenerator getPrefixGenerator() {
		return prefixGenerator;
	}
}
