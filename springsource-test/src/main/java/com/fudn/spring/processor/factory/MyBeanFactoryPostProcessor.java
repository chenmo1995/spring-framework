package com.fudn.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author fdn
 * @since 2021-09-28 23:19
 */
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public MyBeanFactoryPostProcessor() {
		System.out.println("自定义beanFactory后置增强构造方法。。。MyBeanFactoryPostProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor.....postProcessBeanFactory");
	}
}
