package com.fudn.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * 可以实现PriorityOrdered或者Ordered接口来进行优先级的设置
 *
 * @author fdn
 * @since 2021-09-28 23:16
 */
//@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("MyBeanDefinitionRegistryPostProcessor无参构造");
	}

	@Override		//先执行
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor....postProcessBeanDefinitionRegistry");
		//增强bean定义信息的注册中心，比如自己注册组件
	}

	@Override		//紧接着执行
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor....postProcessBeanFactory");

	}

//	@Override
//	public int getOrder() {
//		return 0;//数字越小，优先级越高
//	}
}
