package com.fudn.spring;

import com.fudn.spring.aop.HelloService;
import com.fudn.spring.beans.Cat;
import com.fudn.spring.beans.Person;
import com.fudn.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author fdn
 * @since 2021-09-26 22:20
 */
public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

//		Person bean = context.getBean(Person.class);
//		System.out.println(bean);

//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		System.out.println(Arrays.asList(beanDefinitionNames));

//		Cat cat1 = context.getBean(Cat.class);
//		Cat cat2 = context.getBean(Cat.class);
//		System.out.println(cat1 == cat2);	//false

//		Person person1 = context.getBean(Person.class);
//		Person person2 = context.getBean(Person.class);
//		System.out.println("cat1==cat2  "+(person1.getCat() == person2.getCat()));	//true


		//aop测试，helloService 是代理对象
		HelloService helloService = context.getBean("helloService", HelloService.class);
		helloService.sayHello("guoguo");
	}
}
