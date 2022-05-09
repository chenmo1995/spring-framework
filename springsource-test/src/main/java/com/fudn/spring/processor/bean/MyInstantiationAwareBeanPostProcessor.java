package com.fudn.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author fdn
 * @since 2021-09-28 23:26
 */
//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("MyInstantiationAwareBeanPostProcessor无参构造");
	}

	@Override		//实例化之前调用的增强方法
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.....postProcessBeforeInstantiation");
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.....postProcessAfterInstantiation");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.....postProcessProperties");
		return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}

//	@Override
//	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		return InstantiationAwareBeanPostProcessor.super.postProcessPropertyValues(pvs, pds, bean, beanName);
//	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.....postProcessBeforeInitialization");

		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.....postProcessAfterInitialization");

		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
