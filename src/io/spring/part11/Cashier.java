package io.spring.part11;

import org.springframework.beans.factory.BeanNameAware;

public class Cashier implements BeanNameAware{
	@SuppressWarnings("unused")
	private String fileName;

	@Override
	public void setBeanName(String name) {
		this.fileName = name;
	}
}
