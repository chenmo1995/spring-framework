package com.fudn.spring.aop;

import org.springframework.stereotype.Component;

/**
 * 业务类
 *
 * @author fdn
 * @since 2021-10-09 18:03
 */
@Component
public class HelloService {
	public HelloService(){
		System.out.println("....");
	}

	public String sayHello(String name){
		String result = "你好："+name;
		System.out.println(result);
		int length = name.length();
		return result + "---" + length;
	}
}
