package com.fudn.spring;

import com.fudn.spring.beans.Cat;
import com.fudn.spring.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fdn
 * @since 2021-09-26 18:16
 */
public class MainTest {
	public static void test01(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println("****"+bean);
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Cat bean = context.getBean(Cat.class);
		System.out.println("****"+bean);
	}
}
