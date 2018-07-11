package io.spring.part08;

import org.springframework.beans.factory.annotation.Required;

import io.spring.part03.service.PrefixGenerator;

/**
 * Instead of creating of custom post-constructor to verify the particular
 * properties of a bean, it’s possible to decorate a property with the @Required
 * annotation.
 */
@SuppressWarnings("unused")
public class SequenceGenerator {
	private PrefixGenerator prefixGenerator;
	private int suffix;

	@Required
	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}

	@Required
	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}

}
