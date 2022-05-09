package com.fudn.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * bean进行代理增强期间进行使用
 *
 * @author fdn
 * @since 2021-09-28 23:30
 */
//@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......postProcessBeforeInitialization");

		return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......postProcessAfterInitialization");

		return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......postProcessBeforeInstantiation");

		return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......postProcessAfterInstantiation");
		//返回false，则bean的赋值全部结束
		return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......postProcessProperties");

		return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}

//	@Override
//	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		return SmartInstantiationAwareBeanPostProcessor.super.postProcessPropertyValues(pvs, pds, bean, beanName);
//	}

	@Override		//预测bean的类型，最后一次改变组件类型，比如要做代理的时候
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......predictBeanType");

		return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
	}

	@Override		//决定构造器，返回候选的构造器列表
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......determineCandidateConstructors");

		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}

	@Override		//返回早期的bean引用
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor......getEarlyBeanReference");
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}

	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor无参构造");
	}
}
