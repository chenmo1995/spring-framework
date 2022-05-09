package com.fudn.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fdn
 * @since 2021-10-09 15:43
 */
@Component
public class B {

	private A a;

	public B(){
		System.out.println("B的构造方法");
	}

	@Autowired
	public void setA(A a){
		this.a = a;
	}
}
