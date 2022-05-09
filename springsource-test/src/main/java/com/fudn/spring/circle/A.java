package com.fudn.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fdn
 * @since 2021-10-09 15:42
 */
@Component
public class A {

	private B b;

	public A() {
		System.out.println("A的无参构造");
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}
}
