package io.spring.part08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import io.spring.part05.model.Product;

public class ProductCheckBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Product) {
			String productName = ((Product) bean).getName();
			System.out.println("In ProductCheckBeanPostProcessor.postProcessBeforeInitialization, processing Product: "
					+ productName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Product) {
			String productName = ((Product) bean).getName();
			System.out.println("In ProductCheckBeanPostProcessor.postProcessAfterInitialization, processing Product: "
					+ productName);
		}
		return bean;
	}
}
